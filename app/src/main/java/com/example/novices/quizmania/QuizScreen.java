package com.example.novices.quizmania;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuizScreen extends AppCompatActivity {

    private int count = 1;
    private RadioGroup rg_quiz;
    private RadioButton rb_quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView questionNo = (TextView) findViewById(R.id.questionNo);
        questionNo.setText("#1");
        rg_quiz = (RadioGroup) findViewById(R.id.radio_quiz);
        final Button nextButton = (Button) findViewById(R.id.buttonNext);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast to display when next button is clicked
                Context context = getApplicationContext();
                CharSequence toastMessage = "Wrong Answer";
                int toastDuration = Toast.LENGTH_SHORT;

                // getting chosen Radio Button
                int selected_option = rg_quiz.getCheckedRadioButtonId();
                rb_quiz = (RadioButton) findViewById(selected_option);

                // if option chosen is correct then modify the toastMessage


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