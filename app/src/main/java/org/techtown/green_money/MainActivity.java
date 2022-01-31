package org.techtown.green_money;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ImageView> cl = new ArrayList<ImageView>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btclick(View v){

        FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        cl.add(new ImageButton(this));
        cl.get(cl.size()-1).setImageResource(R.drawable.apple);
        fl1.addView(cl.get(cl.size()-1), 300,300);
        cl.get(cl.size()-1).setX((float) (Math.random() * (fl1.getWidth()) / 1.5));
        cl.get(cl.size()-1).setY((float) (Math.random() * (fl1.getHeight() / 2)));
    }

    public void remove(View v){

        for(int i = 0; i < cl.size(); i++){
                cl.remove(i);
        }
    }
}


