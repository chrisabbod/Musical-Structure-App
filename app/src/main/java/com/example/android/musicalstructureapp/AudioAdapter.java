package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AudioAdapter extends ArrayAdapter<Audio>{

    public AudioAdapter(Activity context, ArrayList<Audio> audio){
        //Initialize the ArrayAdapter's internal storage for the context and the list.
        //The second argument is used when the ArrayAdapter is populating a single TextView.
        //Because this is a custom adapter for two TextViews the adapter is not
        //going to use this second argument, so it can be any value (0).
        super(context, 0, audio);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Audio currentAudio = getItem(position);

        TextView audioTitleTextView = (TextView)listItemView.findViewById(R.id.audio_title);
        audioTitleTextView.setText(currentAudio.getAudioTitle());

        TextView artistNameTextView = (TextView)listItemView.findViewById(R.id.artist_name);
        artistNameTextView.setText(currentAudio.getArtistName());

        return listItemView;
    }
}
