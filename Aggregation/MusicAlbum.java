package Aggregation;
import java.io.*;
import java.util.*;

class MusicAlbum {
	private String albumName;
	int id;
	private String singer;
	
	MusicAlbum(String albumName, int id, String singer){
		this.albumName=albumName;
		this.id=id;
		this.singer=singer;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
}


class Singer {
	String name;
	private List<MusicAlbum> album;
	Singer(String name, List<MusicAlbum> album){
		this.name = name;
		this.album = album;
	}
	public List<MusicAlbum> getAlbum(){
		return album;
	}
}


class Label{
	private String labelName;
	private List<Singer> labels;
	
	public String getLabelName() {
		return this.labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	Label(String labelName, List<Singer> labels){
		this.labelName = labelName;
		this.labels = labels;
	}
	
	public void getAlbumsInLabel() {
		List<MusicAlbum> albums;
		for(Singer sing : labels) {
			albums = sing.getAlbum();
			for(MusicAlbum s : albums) {
				System.out.println("Album Name  : " + s.getAlbumName());
				System.out.println("Singer      : " + s.getSinger());
				System.out.println("+==================================+\n");
			}
		}
	}
}