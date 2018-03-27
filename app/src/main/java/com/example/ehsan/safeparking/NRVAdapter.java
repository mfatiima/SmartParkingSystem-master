package com.example.ehsan.safeparking;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ehsan on 28-12-2017.
 */

public class NRVAdapter extends RecyclerView.Adapter<NRVAdapter.complaintViewHolder>{

    List<Complaint>complaints;

    NRVAdapter(List<Complaint> complaints){
        this.complaints = complaints;
    }
    @Override
    public complaintViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.complaint_card, viewGroup, false);
        complaintViewHolder pvh = new complaintViewHolder(v);
        return pvh;
    }
    @Override
    public void onBindViewHolder(complaintViewHolder personViewHolder, int i) {
        personViewHolder.personName.setText(complaints.get(i).getSender());
        personViewHolder.complaint.setText(complaints.get(i).getComplaint());
        //personViewHolder.personPhoto.setImageResource(complaints.get(i).photoId);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
    @Override
    public int getItemCount() {
        return complaints.size();
    }

    public class complaintViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView personName;
        TextView complaint;
        EditText reply;
        TextView ignore;
        TextView replytext;
        Button replyButton;

        complaintViewHolder(View itemView) {
            super(itemView);
            imageView= (ImageView)itemView.findViewById(R.id.imageV);
            personName = (TextView)itemView.findViewById(R.id.textView);
            complaint = (TextView)itemView.findViewById(R.id.textView2);
            ignore = (TextView)itemView.findViewById(R.id.textView3);
            replytext = (TextView)itemView.findViewById(R.id.textView4);
            reply = (EditText) itemView.findViewById(R.id.editText);
            replyButton=(Button)itemView.findViewById(R.id.button2);
            ignore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ignore.setText("ignored");
                    replytext.setVisibility(View.GONE);
                    ignore.setEnabled(false);
                }
            });
            replytext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ignore.setVisibility(View.GONE);
                    replytext.setVisibility(View.GONE);
                    reply.setVisibility(View.VISIBLE);
                    replyButton.setVisibility(View.VISIBLE);
                }
            });
            replyButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos=getAdapterPosition();
                    complaints.get(pos).setResponse(reply.getText().toString());
                    reply.setEnabled(false);
                    replyButton.setText("Replied");
                    replyButton.setEnabled(false);
                }
            });
        }
    }

}