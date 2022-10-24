package srl.neotech.corsojava.random2;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		Random random = new Random();
		int valore;
		
		do {
			valore=random.nextInt(1, 11);
			System.out.println(valore);
		}while((valore%3)!=0);
	}
}
