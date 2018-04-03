package com.example.ehsan.safeparking;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Settings extends AppCompatActivity implements OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        String frag = getIntent().getStringExtra("fragment");
        switch (frag) {
            case "profile":
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, new Profile()).commit();
                break;
            case "login":
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, new Credentails()).commit();
                break;
            case "reservation":
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, new Reservation()).commit();
                break;
            case "parking":
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, new ParkingView()).commit();
                break;

        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
