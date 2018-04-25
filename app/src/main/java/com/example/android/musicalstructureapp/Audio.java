package com.example.android.musicalstructureapp;

public class Audio {
    private String audioTitle;
    private String artistName;

    public Audio(String title, String artist){
        audioTitle = title;
        artistName = artist;
    }

    public String getAudioTitle() {
        return audioTitle;
    }

    public void setAudioTitle(String audioTitle) {
        this.audioTitle = audioTitle;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
