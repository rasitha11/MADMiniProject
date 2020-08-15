package com.example.madminiproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.madminiproject.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class newquiz_bim extends AppCompatActivity {

    private TabLayout tablayout;
    private ViewPager viewPager;
    private TabItem tab1, tab2, tab3, tab4;
    public  PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newquiz_bim);

        Log.i("Lifecycle","OnCreate() invoked");



       TextView textView1 = findViewById(R.id.owner);
       textView1.setText("$owner$");

       TextView textView2 = findViewById(R.id.my_account);
       textView2.setText("My Account");

       TextView textView3 = findViewById(R.id.log_out);
       textView2.setText("Logout");





       ImageView myImageView = (ImageView) findViewById(R.id.profile);
       myImageView.setImageResource(R.drawable.profilepic);

       ImageView myImageView1 = (ImageView) findViewById(R.id.logo);
       myImageView1.setImageResource(R.drawable.quiz);
    }
}