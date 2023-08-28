package com.sumita.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class AnimationSplashscreen extends AppCompatActivity {
    TextView txtsplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_splashscreen);
        txtsplash=findViewById(R.id.txtsplashview);
        Intent splashscreen=new Intent(AnimationSplashscreen.this,MainActivity.class);
        Animation splashview= AnimationUtils.loadAnimation(AnimationSplashscreen.this,R.anim.splashview);
        txtsplash.setAnimation(splashview);
        new Handler().postDelayed(new Runnable() {//handaler class handel the thread
            @Override
            public void run() {
                startActivity(splashscreen);
                finish();
            }
        },4000);
    }
}