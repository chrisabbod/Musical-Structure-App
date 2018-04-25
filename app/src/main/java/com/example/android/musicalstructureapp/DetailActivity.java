package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String audioTitle = intent.getStringExtra("Audio Title");
        String artistName = intent.getStringExtra("Artist Name");

        ImageView audioImageView = (ImageView)findViewById(R.id.detail_image);
        TextView titleTextView = (TextView)findViewById(R.id.detail_title);
        TextView artistTextView = (TextView)findViewById(R.id.detail_artist);

        ImageButton skipPreviousButton = (ImageButton)findViewById(R.id.skip_previous_button);
        ImageButton stopButton = (ImageButton)findViewById(R.id.stop_button);
        ImageButton pauseButton = (ImageButton)findViewById(R.id.pause_button);
        ImageButton playButton = (ImageButton)findViewById(R.id.play_button);
        ImageButton skipNextButton = (ImageButton)findViewById(R.id.skip_next_button);

        skipPreviousButton.setImageResource(R.drawable.ic_skip_previous_button);
        stopButton.setImageResource(R.drawable.ic_stop_button);
        pauseButton.setImageResource(R.drawable.ic_pause_button);
        playButton.setImageResource(R.drawable.ic_play_button);
        skipNextButton.setImageResource(R.drawable.ic_skip_next_button);

        titleTextView.setText(audioTitle);
        artistTextView.setText(artistName);

        switch(audioTitle){
            case "Stairway to Heaven":
                audioImageView.setImageResource(R.drawable.stairway_to_heaven);
                break;
            case "Born to Be Wild":
                audioImageView.setImageResource(R.drawable.born_to_be_wild);
                break;
            case "Hound Dog":
                audioImageView.setImageResource(R.drawable.hound_dog);
                break;
            case "Somebody to Love":
                audioImageView.setImageResource(R.drawable.somebody_to_love);
                break;
            case "What a Wonderful World":
                audioImageView.setImageResource(R.drawable.what_a_wonderful_world);
                break;
            case "Pretty Woman":
                audioImageView.setImageResource(R.drawable.pretty_woman);
                break;
            case "Here Comes the Sun":
                audioImageView.setImageResource(R.drawable.here_comes_the_sun);
                break;
            case "I Wanna Be Sedated":
                audioImageView.setImageResource(R.drawable.i_wanna_be_sedated);
                break;
            case "Hey Jude":
                audioImageView.setImageResource(R.drawable.hey_jude);
                break;
            case "Blackbird":
                audioImageView.setImageResource(R.drawable.blackbird);
                break;
            case "(Don't Fear) The Reaper":
                audioImageView.setImageResource(R.drawable.fear_the_reaper);
                break;
            case "Break On Through (to the Other Side)":
                audioImageView.setImageResource(R.drawable.break_on_through);
                break;
            case "Dancing Days":
                audioImageView.setImageResource(R.drawable.dancing_days);
                break;
            case "Carpet Crawlers":
                audioImageView.setImageResource(R.drawable.carpet_crawlers);
                break;
            case "Turn! Turn! Turn!":
                audioImageView.setImageResource(R.drawable.turn_turn_turn);
                break;
        }
    }
}