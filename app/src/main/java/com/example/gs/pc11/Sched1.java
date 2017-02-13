package com.example.gs.pc11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.widget.TabHost;
import android.widget.TextView;

import static com.example.gs.pc11.R.id.tabHost;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.iid.FirebaseInstanceId;

/**
 * Created by GS on 29-09-2016.
 */
public class Sched1 extends AppCompatActivity {


    TextView Day15pm;
    TextView Day16pm;
    TextView Day25pm;
    TextView Day26pm;
    TextView Day35pm;
    TextView Day36pm;
    TextView Day45pm;
    TextView Day46pm;
    TextView Day55pm;
    TextView Day56pm;
    private static FirebaseDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sched);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_sched);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TabHost host = (TabHost) findViewById(tabHost);
        host.setup();
        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Tab One");
        spec.setContent(R.id.DAY1);
        spec.setIndicator("Day 1");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Tab Two");
        spec.setContent(R.id.DAY2);
        spec.setIndicator("Day 2");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Tab Three");
        spec.setContent(R.id.DAY3);
        spec.setIndicator("Day 3");
        host.addTab(spec);

        //Tab 4
        spec = host.newTabSpec("Tab Four");
        spec.setContent(R.id.DAY4);
        spec.setIndicator("Day 4");
        host.addTab(spec);

        //Tab 5
        spec = host.newTabSpec("Tab Five");
        spec.setContent(R.id.DAY5);
        spec.setIndicator("Day 5");
        host.addTab(spec);

    }
    public static FirebaseDatabase getDatabase() {
        if (mDatabase == null) {
            mDatabase = FirebaseDatabase.getInstance();
            mDatabase.setPersistenceEnabled(true);
        }
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        return mDatabase;
    }
    @Override
    protected void onStart(){
        super.onStart();
        DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReferenceFromUrl("https://pecconnect-d2c5f.firebaseio.com");
        DatabaseReference message1Ref= mRootRef.child("Day15");
        DatabaseReference message2Ref= mRootRef.child("Day16");
        DatabaseReference message3Ref= mRootRef.child("Day25");
        DatabaseReference message4Ref= mRootRef.child("Day26");
        DatabaseReference message5Ref= mRootRef.child("Day35");
        DatabaseReference message6Ref= mRootRef.child("Day36");
        DatabaseReference message7Ref= mRootRef.child("Day45");
        DatabaseReference message8Ref= mRootRef.child("Day46");
        DatabaseReference message9Ref= mRootRef.child("Day55");
        DatabaseReference message10Ref= mRootRef.child("Day56");

        Day15pm = (TextView) findViewById(R.id.day16);
        Day16pm = (TextView) findViewById(R.id.Nday16);
        Day25pm = (TextView) findViewById(R.id.day26);
        Day26pm = (TextView) findViewById(R.id.Nday26);
        Day35pm = (TextView) findViewById(R.id.day36);
        Day36pm = (TextView) findViewById(R.id.Nday36);
        Day45pm = (TextView) findViewById(R.id.day46);
        Day46pm = (TextView) findViewById(R.id.Nday46);
        Day55pm = (TextView) findViewById(R.id.day56);
        Day56pm = (TextView) findViewById(R.id.Nday56);

        message1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                Day15pm.setText(message);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                Day16pm.setText(message);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                Day25pm.setText(message);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message4Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                Day26pm.setText(message);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message5Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                Day35pm.setText(message);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message6Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                Day36pm.setText(message);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message7Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                Day45pm.setText(message);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message8Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                Day46pm.setText(message);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message9Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                Day55pm.setText(message);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message10Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                Day56pm.setText(message);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}