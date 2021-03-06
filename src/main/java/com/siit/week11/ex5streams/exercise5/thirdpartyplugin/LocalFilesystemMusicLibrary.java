package com.siit.week11.ex5streams.exercise5.thirdpartyplugin;

import com.siit.week11.ex5streams.exercise5.musicplayer.MusicLibrary;
import com.siit.week11.ex5streams.exercise5.musicplayer.Song;

import java.util.*;

public class LocalFilesystemMusicLibrary implements MusicLibrary {


    private final Set<Song> allSongs;

    public LocalFilesystemMusicLibrary(Song... allSongs) {
        this.allSongs = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(allSongs)));
    }

    @Override
    public Collection<Song> allSongs() {
        return allSongs;
    }

    @Override
    public int timesPlayed(Song song) {
        // Could read a local database file to find the number of times played
        return 4;
    }
}
