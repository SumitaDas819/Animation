package com.sumita.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Alpha extends AppCompatActivity {
   ImageView imgbox;
   AppCompatButton alpha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);
        getSupportActionBar().setTitle("Alpha");
        imgbox=findViewById(R.id.imgbox);
        alpha=findViewById(R.id.alpha);
        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation scale= AnimationUtils.loadAnimation(Alpha.this,R.anim.alpha);
                imgbox.startAnimation(scale);
            }
        });
    }
}