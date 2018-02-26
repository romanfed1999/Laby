package org.lab1.sample;

public class Main {

	public static void main(String[] args) {
		DytiaczyjManez manez1 = new DytiaczyjManez();
		DytiaczyjManez manez2 = new DytiaczyjManez(9900, 2017, 1248);
		DytiaczyjManez manez3 = new DytiaczyjManez(15000, 2018, 1300, 65, "Fisher-Price");
		System.out.println(manez1.toString());
		System.out.println(manez2.toString());
		System.out.println(manez3.toString());
		DytiaczyjManez.printStaticSum();
		manez1.printSum();
	}

}
