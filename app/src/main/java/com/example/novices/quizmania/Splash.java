package com.example.novices.quizmania;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        setContentView(R.layout.splash);

        final ImageView imageView = (ImageView) findViewById(R.id.splashimage);
        final Animation animation = AnimationUtils.loadAnimation(getBaseContext(), R.anim.fade_out);

        imageView.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                Intent intent_splash = new Intent(Splash.this, MainActivity.class);
                startActivity(intent_splash);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
