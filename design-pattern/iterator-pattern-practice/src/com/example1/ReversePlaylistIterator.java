package com.example1;

public class ReversePlaylistIterator implements Iterator<String>{

	private Playlist playList;
	private int index;
	
	public ReversePlaylistIterator(Playlist playlist) {
		this.playList = playlist;
		this.index = playlist.getSize()-1;
	} 
	
	@Override
	public boolean hasNext() {
		return index >= 0;
	}

	@Override
	public String next() {
		return playList.getSongAt(index--);
	}

}
