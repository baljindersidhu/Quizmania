package com.example.novices.quizmania;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizScreen extends AppCompatActivity {

    private int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView questionNo = (TextView) findViewById(R.id.questionNo);
        questionNo.setText("#1");
        final Button nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast to display when next button is clicked
                Context context = getApplicationContext();
                CharSequence toastMessage = "Wrong Answer";
                int toastDuration = Toast.LENGTH_SHORT;

                // if option chosen it correct then modify the toastMessage


                Toast nextButtonToastMessage = Toast.makeText(context, toastMessage, toastDuration);
                nextButtonToastMessage.show();

                //increase Question Number and update TextView
                ++count;
                questionNo.setText("#" + count);
            }
        });
        finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}