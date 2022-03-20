package Assosiation;
import java.util.*;

class Body{
    private String gameName;
    
    public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	@Override 
    public String toString(){
        return gameName;
    } 
}

class Type{
    private String typeGame;
    
    private List<Body> types;

    public String getTypeGame() {
        return typeGame;
    }

    public void setTypeGame(String typeGame) {
        this.typeGame = typeGame;
    }

    public List<Body> getTypes() {
        return types;
    }
    
    public void setState(List<Body> types){
        this.types = types;
    }   
}