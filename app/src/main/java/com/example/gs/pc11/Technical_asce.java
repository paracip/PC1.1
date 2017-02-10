package com.example.gs.pc11;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by GS on 12-10-2016.
 */
public class Technical_asce extends AppCompatActivity{
    TextView asce_content;
    TextView asce_contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.technical_asce);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_asce);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }

    @Override
    protected void onStart() {
        super.onStart();
        DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReferenceFromUrl("https://pecconnect-d2c5f.firebaseio.com");
        DatabaseReference message1Ref = mRootRef.child("asce_content");
        DatabaseReference message2Ref = mRootRef.child("asce_contact");

        asce_content = (TextView) findViewById(R.id.asce_content);
        asce_contact = (TextView) findViewById(R.id.asce_contact);

        message1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message = dataSnapshot.getValue(String.class);
                asce_content.setText(message);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message = dataSnapshot.getValue(String.class);
                asce_contact.setText(message);

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