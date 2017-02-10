package com.example.gs.pc11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by GS on 19-10-2016.
 */
public class Menu_contacts extends AppCompatActivity {

    TextView contact_director;
    TextView contact_dfa;
    TextView contact_dsa;
    TextView contact_daa;
    TextView contact_dispensary;
    TextView contact_counselor;
    TextView contact_tpo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_contacts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_menu_contacts);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
    @Override
    protected void onStart(){
        super.onStart();
        DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReferenceFromUrl("https://pecconnect-d2c5f.firebaseio.com");
        DatabaseReference message1Ref= mRootRef.child("contact_director");
        DatabaseReference message2Ref= mRootRef.child("contact_dfa");
        DatabaseReference message3Ref= mRootRef.child("contact_dsa");
        DatabaseReference message4Ref= mRootRef.child("contact_daa");
        DatabaseReference message5Ref= mRootRef.child("contact_dispensary");
        DatabaseReference message6Ref= mRootRef.child("contact_counselor");
        DatabaseReference message7Ref= mRootRef.child("contact_tpo");

        contact_director = (TextView) findViewById(R.id.contact_director);
        contact_dfa = (TextView) findViewById(R.id.contact_dfa);
        contact_dsa = (TextView) findViewById(R.id.contact_dsa);
        contact_daa = (TextView) findViewById(R.id.contact_daa);
        contact_dispensary = (TextView) findViewById(R.id.contact_dispensary);
        contact_counselor = (TextView) findViewById(R.id.contact_counselor);
        contact_tpo = (TextView) findViewById(R.id.contact_tpo);

        message1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                contact_director.setText(message);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                contact_dfa.setText(message);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                contact_dsa.setText(message);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message4Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                contact_daa.setText(message);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message5Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                contact_dispensary.setText(message);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message6Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                contact_counselor.setText(message);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message7Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message=dataSnapshot.getValue(String.class);
                contact_tpo.setText(message);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}