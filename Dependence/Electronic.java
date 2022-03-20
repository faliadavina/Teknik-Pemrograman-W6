package Dependence;
import java.io.*;

public class Electronic {
	private String nameofElec;

	public String getNameofElec() {
		return nameofElec;
	}

	public void setNameofElec(String nameofElec) {
		this.nameofElec = nameofElec;
	}
	Electronic(String name){
		this.nameofElec = name;
	}
}


class Human{
	private String nameofHuman;

	public String getNameofHuman() {
		return nameofHuman;
	}

	public void setNameofHuman(String nameofHuman) {
		this.nameofHuman = nameofHuman;
	}
	Human(String name){
		this.nameofHuman = name;
	}
	
	public void usingA(Electronic use) {
		System.out.println(" is using a "+use.getNameofElec());
	}
}
