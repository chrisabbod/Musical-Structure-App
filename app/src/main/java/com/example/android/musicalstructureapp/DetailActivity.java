package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String audioTitle = intent.getStringExtra("Audio Title");
        String artistName = intent.getStringExtra("Artist Name");

        TextView titleTextView = (TextView)findViewById(R.id.detail_title);
        TextView artistTextView = (TextView)findViewById(R.id.detail_artist);

        titleTextView.setText(audioTitle);
        artistTextView.setText(artistName);
    }
}
