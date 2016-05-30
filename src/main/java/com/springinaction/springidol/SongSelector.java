package com.springinaction.springidol;

public class SongSelector {
	public SongSelector(){
		
	}
	private String[] songs={"a","b","c"};

	public String[] getSongs() {
		return songs;
	}

	public void setSongs(String[] songs) {
		this.songs = songs;
	}
	public String selectSong(){
		if(songs.length>0){
			return songs[0];
		}
		return null;
	}
	
}
