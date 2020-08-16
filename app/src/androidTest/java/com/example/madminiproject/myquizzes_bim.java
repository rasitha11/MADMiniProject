package com.example.madminiproject;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class myquizzes_bim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myquizzes_bim);


        TextView textView1 = findViewById(R.id.owner);
        textView1.setText("$owner$");

        TextView textView2 = findViewById(R.id.my_account);
        textView2.setText(R.string.Msg3);

        TextView textView3 = findViewById(R.id.log_out);
        textView2.setText(R.string.Msg4);

        TextView textView4 = findViewById(R.id.create_title);
        textView2.setText(R.string.Msg5);




        ImageView myImageView = (ImageView) findViewById(R.id.profile);
        myImageView.setImageResource(R.drawable.profilepic);

        ImageView myImageView1 = (ImageView) findViewById(R.id.logo);
        myImageView1.setImageResource(R.drawable.quiz);

            }

        };

