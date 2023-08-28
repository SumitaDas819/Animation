package com.sumita.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class rotation extends AppCompatActivity {
    AppCompatButton rotate,rotatep;
    ImageView imgbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotation);
        getSupportActionBar().setTitle("Rotation");
        imgbox=findViewById(R.id.imgbox);
        rotate=findViewById(R.id.btnrotation);
        rotatep=findViewById(R.id.btnrotationp);
        Animation rotate1= AnimationUtils.loadAnimation(rotation.this,R.anim.rotation);
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imgbox.startAnimation(rotate1);
            }
        });
        rotatep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgbox.clearAnimation();
            }
        });

    }
}