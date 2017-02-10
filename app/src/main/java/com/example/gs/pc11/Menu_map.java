package com.example.gs.pc11;

import android.content.Intent;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;


/**
 * Created by GS on 19-10-2016.
 */

public class Menu_map extends AppCompatActivity {
    Matrix matrix = new Matrix();
    Float scale = 1f;
    ScaleGestureDetector GS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_map);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_maped);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        GS = new ScaleGestureDetector(this, new ScaleListener());
        //final Animation zoomAnimation = AnimationUtils.loadAnimation(this, R.anim.zoom);
        //zoom.startAnimation(zoomAnimation);
    }
    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            ImageView image1 = (ImageView) findViewById(R.id.imageView10);
            scale = scale * detector.getScaleFactor();
            scale = Math.max(0.1f, Math.min(scale, 5f));
            matrix.setScale(scale, scale);
            image1.setImageMatrix(matrix);
            return true;
        }
    }
    @Override
    public  boolean onTouchEvent(MotionEvent event){
        GS.onTouchEvent(event);
        return true;
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
    public void pecmarket(View a){
        ImageView image1 = (ImageView) findViewById(R.id.imageView10);
        if(a.getId() == R.id.imageView10){
            Intent sched1 = new Intent(Menu_map.this, Menu_map_pecmarket.class);
            startActivity(sched1);
        }
    }
}