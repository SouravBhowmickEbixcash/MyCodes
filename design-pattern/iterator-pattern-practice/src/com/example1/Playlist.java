package com.example1;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IterableCollection<String>{
	
	private List<String> songs;
	
	public Playlist() {
		this.songs = new ArrayList<>();
	}
	
	public void addSong(String song) {
		this.songs.add(song);
	}
	
	public String getSongAt(int index) {
		return this.songs.get(index);
	}
	
	public int getSize() {
		return this.songs.size();
	}

	@Override
	public Iterator<String> createIterator() {
		return new ReversePlaylistIterator(this);
	}

}
