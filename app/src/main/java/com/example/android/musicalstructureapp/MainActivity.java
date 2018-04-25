package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Audio> audioArrayList = new ArrayList<Audio>();

        audioArrayList.add(new Audio("Stairway to Heaven", "Led Zeppelin"));
        audioArrayList.add(new Audio("Born to Be Wild", "Steppenwolf"));
        audioArrayList.add(new Audio("Hound Dog", "Elvis Presley"));
        audioArrayList.add(new Audio("Somebody to Love", "Jefferson Airplane"));
        audioArrayList.add(new Audio("What a Wonderful World", "Louis Armstrong"));
        audioArrayList.add(new Audio("Pretty Woman", "Roy Orbison"));
        audioArrayList.add(new Audio("Here Comes the Sun", "The Beatles"));
        audioArrayList.add(new Audio("I Wanna Be Sedated", "Ramones"));
        audioArrayList.add(new Audio("Hey Jude", "The Beatles"));
        audioArrayList.add(new Audio("Blackbird", "The Beatles"));
        audioArrayList.add(new Audio("(Don't Fear) The Reaper", "Blue Oyster Cult"));
        audioArrayList.add(new Audio("Break On Through (to the Other Side)", "The Doors"));
        audioArrayList.add(new Audio("Dancing Days", "Led Zeppelin"));
        audioArrayList.add(new Audio("Carpet Crawlers", "Genesis"));
        audioArrayList.add(new Audio("Turn! Turn! Turn!", "The Byrds"));

        AudioAdapter adapter = new AudioAdapter(this, audioArrayList);
        ListView listView = (ListView)findViewById(R.id.audio_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent detailActivityIntent = new Intent(MainActivity.this, DetailActivity.class);
                detailActivityIntent.putExtra("Audio Title", audioArrayList.get(i).getAudioTitle());
                detailActivityIntent.putExtra("Artist Name", audioArrayList.get(i).getArtistName());
                startActivity(detailActivityIntent);
            }
        });
    }
}
