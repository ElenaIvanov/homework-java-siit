package com.siit.week11.ex5streams.exercise5.musicplayer;

public class Song {
    private final String title;
    private final String artist;

    public Song(String title, String artist) {

        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
