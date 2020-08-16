package com.example.madminiproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

    String quiztitle,question,answer1,answer2,answer3,answer4;

    EditText titleInput;
    EditText questionInput;
    EditText answer1Input;
    EditText answer2Input;
    EditText answer3Input;
    EditText answer4Input;

    Button addquestionButton;
    Button publishButton;



    //https://www.youtube.com/watch?v=V0AETAjxqLI
    //Resource
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newquiz_bim);

        titleInput = (EditText) findViewById(R.id.quiztitle);
        questionInput = (EditText) findViewById(R.id.question);
        answer1Input = (EditText) findViewById(R.id.answer1);
        answer2Input = (EditText) findViewById(R.id.answer2);
        answer3Input = (EditText) findViewById(R.id.answer3);
        answer4Input = (EditText) findViewById(R.id.answer4);


        publishButton = (Button) findViewById(R.id.publishbutton);
        publishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quiztitle = titleInput.getText().toString();
            }

        });

        addquestionButton = (Button) findViewById(R.id.addquestionButton);
        addquestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add a new question
            }

        });


        Log.i("Lifecycle","OnCreate() invoked");



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
}