package com.example.novices.quizmania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private static RadioGroup rg_topic;
    private static RadioButton rb_topic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg_topic = (RadioGroup) findViewById(R.id.radio_topics);
        Button topic_next = (Button) findViewById(R.id.TopicNextButton);

        topic_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected_topic = rg_topic.getCheckedRadioButtonId();
                rb_topic = (RadioButton) findViewById(selected_topic);
                //write switch statement here to pick database for chosen topic;

                // switching to next activity
                Intent intent = new Intent(MainActivity.this, QuizScreen.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }
}