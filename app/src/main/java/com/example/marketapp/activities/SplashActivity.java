package com.example.marketapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.marketapp.R;

public class SplashActivity extends AppCompatActivity {

    // The Activity Has different Theme
    // The Theme configured without Action Bar and Title Bar
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        int delaySec = 3000;
        TextView wellcome=(TextView)findViewById(R.id.wellcomTxt);


        //region Open in Full Screen
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
                );
        //endregion

        //region Close the Activity after 3 sec and open Main Activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent = new Intent(SplashActivity.this,
                        MainActivity.class);
                startActivity(splashIntent);
                finish();
            }
        },delaySec);
        //endregion

    }
}