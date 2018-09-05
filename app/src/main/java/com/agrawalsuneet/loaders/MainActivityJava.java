package com.agrawalsuneet.loaders;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;

import com.agrawalsuneet.loaderspack.loaders.CircularSticksLoader;
import com.agrawalsuneet.loaderspack.loaders.ClockLoader;
import com.agrawalsuneet.loaderspack.loaders.MultipleRippleLoader;

/**
 * Created by suneet on 10/31/17.
 */

public class MainActivityJava extends AppCompatActivity {

    LinearLayout container;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_clock);


        //Clock Loader
        ClockLoader clockLoader = new ClockLoader(this);
        clockLoader.setOuterCircleBorderWidth(8.0f);
        clockLoader.setBigCircleRadius(150.0f);
        clockLoader.setMinuteHandLength(120.0f);
        clockLoader.setHourHandLength(80.0f);
        clockLoader.setInnerCircleRadius(15.0f);

        clockLoader.setOuterCircleBorderColor(ContextCompat.getColor(this, R.color.colorAccent));
        clockLoader.setBigCircleColor(ContextCompat.getColor(this, R.color.colorPrimary));
        clockLoader.setInnerCircleColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        clockLoader.setHourHandColor(ContextCompat.getColor(this, R.color.colorAccent));
        clockLoader.setMinuteHandColor(ContextCompat.getColor(this, R.color.colorAccent));

        clockLoader.setAnimSpeedMultiplier(2.0f);

        container.addView(clockLoader);

        //RotatingCircularSticksLoader
        /*RotatingCircularSticksLoader loader = new RotatingCircularSticksLoader(this,
                16, 100f, 50f,
                ContextCompat.getColor(this, R.color.blue),
                ContextCompat.getColor(this, android.R.color.white));

        loader.setAnimDuration(5000);
        container.addView(loader);*/


        //CircularSticksLoader
        CircularSticksLoader loader = new CircularSticksLoader(this, 16,
                200f, 100f,
                ContextCompat.getColor(this, R.color.blue),
                ContextCompat.getColor(this, R.color.red),
                ContextCompat.getColor(this, android.R.color.white));

        loader.setShowRunningShadow(true);
        loader.setFirstShadowColor(ContextCompat.getColor(this, R.color.green));
        loader.setSecondShadowColor(ContextCompat.getColor(this, R.color.yellow));
        loader.setAnimDuration(100);

        container.addView(loader);


        //MultipleRippleLoader
        MultipleRippleLoader multipleRippleLoader = new MultipleRippleLoader(this,
                40,
                ContextCompat.getColor(this, R.color.blue),
                2);

        multipleRippleLoader.setFromAlpha(0.9f);
        multipleRippleLoader.setToAlpha(0.2f);
        multipleRippleLoader.setAnimationDuration(2000);
        multipleRippleLoader.setInterpolator(new LinearInterpolator());


        container.addView(multipleRippleLoader);

        String str = new String("asd");
    }


}
