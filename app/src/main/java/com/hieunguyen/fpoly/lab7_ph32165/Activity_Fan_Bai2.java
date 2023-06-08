package com.hieunguyen.fpoly.lab7_ph32165;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;

public class Activity_Fan_Bai2 extends AppCompatActivity {
    ImageView imageView;

    Animation fanAnimation;
    Animation fanMedium;
    Animation fanSlow;
    Animation fanOff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fan_bai2);

        Button fast = findViewById(R.id.fast_mode);
        Button medium = findViewById(R.id.medium_mode);
        Button slow = findViewById(R.id.slow_mode);
        Button off = findViewById(R.id.off_mode);
        imageView = findViewById(R.id.fan_img);

        fanAnimation();
        fanMedium();
        fanSlow();
        fanOff();

        fast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(fanAnimation);
            }
        });
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(fanMedium);
            }
        });
        slow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(fanSlow);
            }
        });
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(fanOff);
            }
        });
    }

    private void fanOff() {
        fanOff = AnimationUtils.loadAnimation(this, R.anim.anim_off);
    }

    private void fanSlow() {
        fanSlow = AnimationUtils.loadAnimation(this, R.anim.anim_slow);
    }

    private void fanMedium() {
        fanMedium = AnimationUtils.loadAnimation(this, R.anim.anim_medium);
    }

    private void fanAnimation() {
        fanAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_fan);
    }

}