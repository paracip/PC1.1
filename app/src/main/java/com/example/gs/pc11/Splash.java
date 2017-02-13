package com.example.gs.pc11;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;
import android.os.Handler;

public class Splash extends AppCompatActivity {
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash1);
        videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splash2));
        videoView.start();

       new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(Splash.this, MainActivity.class);
                Splash.this.startActivity(mainIntent);
                Toast.makeText(getApplicationContext(), "Handler", Toast.LENGTH_SHORT).show();
                Splash.this.finish();
            }
        }, 4000);

    /*    videoView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent culturalin = new Intent(Splash.this, Login.class);
                startActivity(culturalin);
                return false;
            }
        });
    */}
}
