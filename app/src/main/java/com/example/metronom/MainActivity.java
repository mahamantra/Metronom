package com.example.metronom;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playBtn = (Button) findViewById(R.id.buttonPlay);
        playBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.music);
                mp.setLooping(true);
                mp.start();
            }
        });

        Button stopBtn = (Button) findViewById(R.id.buttonStop);
        stopBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
            }
        });
    }


    public void play100(View view) {
        if (mp != null) {
            mp.setPlaybackParams(mp.getPlaybackParams().setSpeed(1f));
        }
    }

    public void play150(View view) {
        if (mp != null) {
            mp.setPlaybackParams(mp.getPlaybackParams().setSpeed(1.5f));
        }
    }

    public void play200(View view) {
        if (mp != null) {
            mp.setPlaybackParams(mp.getPlaybackParams().setSpeed(2f));
        }
    }

}