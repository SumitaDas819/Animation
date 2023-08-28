package com.sumita.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Scale extends AppCompatActivity {
   AppCompatButton scale;
   ImageView imgbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        getSupportActionBar().setTitle("Scale");
        scale=findViewById(R.id.scale);
        imgbox=findViewById(R.id.imgbox);
        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation scale= AnimationUtils.loadAnimation(Scale.this,R.anim.scale);
                imgbox.startAnimation(scale);
            }
        });


    }
}