package Assosiation;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	        Type type = new Type();
	        type.setTypeGame("Mobile Phone");
	        
	        Body game = new Body();
	        game.setGameName("Mobile Legend");
	        Body game2 = new Body();
	        game2.setGameName("PUBG Mobile");
	        
	        List<Body>empList = new ArrayList<Body>();
	        empList.add(game);
	        empList.add(game2);
	        
	        type.setState(empList);
	        
	        System.out.println(type.getTypes()+" are games in the "+ type.getTypeGame());

	}

}
