package Aggregation;

import java.util.ArrayList;
import java.util.List;

public class mainAlbum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicAlbum s1 = new MusicAlbum("Gabriel",1,"Keshi");
		MusicAlbum s2 = new MusicAlbum("Sour",2,"Olivia Rodrigo");
		MusicAlbum s3 = new MusicAlbum("=",3,"Ed Sheeran");
		MusicAlbum s4 = new MusicAlbum("Happier Than Ever",4,"Billie Eilish");
		
		List<MusicAlbum> album = new ArrayList<MusicAlbum>();
		album.add(s1);
		album.add(s2);
		album.add(s3);
		album.add(s4);
		
		Singer albums = new Singer("Albums", album);
		
		List <Singer> singer = new ArrayList<Singer>();
		singer.add(albums);
		
		Label label = new Label("        Falia Music Label", singer);
		System.out.println(label.getLabelName());
		System.out.println("+==================================+\n");
		label.getAlbumsInLabel();

	}

}
