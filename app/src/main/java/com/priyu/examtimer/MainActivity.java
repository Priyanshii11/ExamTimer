package com.priyu.examtimer;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer m1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView number = findViewById(R.id.done);
        final TextView done = findViewById(R.id.textView3);

        m1 = MediaPlayer.create(MainActivity.this,R.raw.eighth);

        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                number.setText("Timer = " + String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                done.setText("donee!!!!!!");
                m1.start();
            }
        }.start();

    }
}