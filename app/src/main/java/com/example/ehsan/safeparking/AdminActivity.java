package com.example.ehsan.safeparking;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class AdminActivity extends AppCompatActivity implements OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setIcon(R.drawable.youtube_pic);
        final ViewPager viewPager=(ViewPager)findViewById(R.id.viewPager);
        PagerAdapter pagerAdapter= new PagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(RecentComplaints.newInstance(null,null),"Complaints");
        viewPager.setAdapter(pagerAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setIcon(R.drawable.arrow_pic);
        getSupportActionBar().setTitle("Admin Panel");
        final TabLayout layout=(TabLayout)findViewById(R.id.tabs);
        layout.setupWithViewPager(viewPager);
        layout.setSelectedTabIndicatorColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
        layout.setSelectedTabIndicatorHeight(10);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
