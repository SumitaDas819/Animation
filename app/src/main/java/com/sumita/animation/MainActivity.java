package com.sumita.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    AppCompatButton btntrans,btnroat,btnscal,btnalpha;
    TextView mainscanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btntrans=findViewById(R.id.btntrans);
        btnroat=findViewById(R.id.btnroat);
        btnscal=findViewById(R.id.btnscal);
        btnalpha=findViewById(R.id.btnalph);
        mainscanim=findViewById(R.id.txtaanimview);
        Animation rotare2= AnimationUtils.loadAnimation(MainActivity.this,R.anim.mainscreenanim);
        mainscanim.startAnimation(rotare2);
        Intent translatescreen=new Intent(MainActivity.this,Translate.class);
        Intent rotationscreen=new Intent(MainActivity.this,rotation.class);
        Intent scalescreen=new Intent(MainActivity.this,Scale.class);
        Intent alphascreen=new Intent(MainActivity.this,Alpha.class);
        btntrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(translatescreen);
            }
        });
        btnroat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(rotationscreen);
            }
        });
        btnscal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(scalescreen);
            }
        });
        btnalpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(alphascreen);
            }
        });


    }

}