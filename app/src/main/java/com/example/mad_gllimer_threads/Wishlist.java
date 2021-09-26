package com.example.mad_gllimer_threads;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Wishlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);

        getSupportActionBar().setTitle("WISHLIST");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}