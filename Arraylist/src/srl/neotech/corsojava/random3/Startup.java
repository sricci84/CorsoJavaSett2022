package srl.neotech.corsojava.random3;

import java.util.ArrayList;
import java.util.Random;

public class Startup {
	
	public static ArrayList <Double> randomNumber = new ArrayList<Double>();

	public static void main(String[] args) {
		
		Random random = new Random();
		
		for(int i=0;i<10;i++) {
			randomNumber.add(random.nextDouble(1, 2));
			System.out.println(randomNumber.get(i));
		}
	}
}
