package com.example.novices.quizmania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int[] buttons = {R.id.Topic1, R.id.Topic2, R.id.Topic3, R.id.Topic4, R.id.Topic5, R.id.Topic6,
            R.id.Topic7, R.id.Topic8, R.id.Topic9, R.id.Topic10, R.id.Topic11, R.id.Topic12};
    Button[] but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i <  12; i++) {
            but[i] = (Button) findViewById(buttons[i]);
            but[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, QuizScreen.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
            });
        }

    }
}