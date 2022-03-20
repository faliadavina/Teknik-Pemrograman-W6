package Dependence;

public class MainElec {

	public static void main(String[] args) {
		Electronic e1 = new Electronic("Fan");
		Electronic e2 = new Electronic("Washing Machine");
		Electronic e3 = new Electronic("Television");
		
		Human h1 = new Human("Falia");
		Human h2 = new Human("Aini");
		Human h3 = new Human("Amel Dew");
		
		System.out.print(h1.getNameofHuman());
		h1.usingA(e1);
		System.out.println();
		System.out.print(h2.getNameofHuman());
		h2.usingA(e2);
		System.out.println();
		System.out.print(h3.getNameofHuman());
		h3.usingA(e3);
		System.out.println();
		

	}

}
