package com.example.metronom;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private float speed ;
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp= MediaPlayer.create(MainActivity.this,R.raw.music);
    }

    public void play100(View view) {
        if (mp.isPlaying()){
            mp.stop();
        }
        speed=1f;
        mp.setPlaybackParams(mp.getPlaybackParams().setSpeed(speed));
        mp.start();
    }

    public void play150(View view) {
        if (mp.isPlaying()){
            mp.stop();
        }
        speed=1.5f;
        mp.setPlaybackParams(mp.getPlaybackParams().setSpeed(speed));
        mp.start();
    }

    public void play200(View view) {
        if (mp.isPlaying()){
            mp.stop();
        }
        speed=2f;
        mp.setPlaybackParams(mp.getPlaybackParams().setSpeed(speed));
        mp.start();
    }


    public void stop(View view) {
        mp.stop();
    }
}