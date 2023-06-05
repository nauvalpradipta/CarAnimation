package com.example.caranimation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ObjectAnimator mAnimatorAbove;
    ObjectAnimator mAnimatorRotate;
    ObjectAnimator mAnimatorDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button moveabove = findViewById(R.id.move_above);
        Button rotation = findViewById(R.id.rotate);
        Button movedown = findViewById(R.id.move_down);

        ImageView car = findViewById(R.id.carview);

        mAnimatorAbove = ObjectAnimator.ofFloat(car,"y", 100);
        mAnimatorRotate = ObjectAnimator.ofFloat(car, "rotation", 0f, 180f);
        mAnimatorDown = ObjectAnimator.ofFloat(car, "translationY", 100f);

        moveabove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAnimatorAbove.setDuration(1000);
                mAnimatorAbove.start();
            }
        });

        rotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAnimatorRotate.setDuration(1000);
                mAnimatorRotate.start();
            }
        });

        movedown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAnimatorDown.setDuration(1000);
                mAnimatorDown.start();
            }
        });

    }
}