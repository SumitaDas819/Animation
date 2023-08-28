package com.sumita.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import com.airbnb.lottie.LottieAnimationView;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Translate extends AppCompatActivity {
AppCompatButton trans,transp;
ImageView imgbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate2);
        getSupportActionBar().setTitle("Translate");
        trans=findViewById(R.id.trans);
        imgbox=findViewById(R.id.imgbox);
        transp=findViewById(R.id.transp);
        trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation move= AnimationUtils.loadAnimation(Translate.this,R.anim.move);
                imgbox.startAnimation(move);
            }
        });
        transp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgbox.clearAnimation();
            }
        });
    }
}