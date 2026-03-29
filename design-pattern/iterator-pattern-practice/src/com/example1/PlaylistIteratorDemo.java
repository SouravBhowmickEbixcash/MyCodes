package com.example1;

public class PlaylistIteratorDemo {

	public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Shape of You");
        playlist.addSong("Bohemian Rhapsody");
        playlist.addSong("Blinding Lights");
        
        ReversePlaylistIterator reverse = new ReversePlaylistIterator(playlist);
        System.out.println("Reverse Playlist:");
        while (reverse.hasNext()) {
            System.out.println("  " + reverse.next());
        }

	}

}
