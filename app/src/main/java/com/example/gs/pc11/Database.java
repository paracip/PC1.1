package com.example.gs.pc11;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by GS on 10-01-2017.
 */

public class Database {

    private static FirebaseDatabase mDatabase;

    public Database() {
        if (mDatabase == null) {
            mDatabase = FirebaseDatabase.getInstance();
            mDatabase.setPersistenceEnabled(true);
        }
        return;
    }
}