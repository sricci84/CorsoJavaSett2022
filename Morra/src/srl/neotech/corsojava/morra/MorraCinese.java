package srl.neotech.corsojava.morra;

import java.util.Random;
import java.util.Scanner;

public class MorraCinese {

	public static void main(String[] args) {
		
		final String[] scelta = {"carta","forbice","sasso"};
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Per giocare a morra cinese scegliete tra: sasso, carta, forbice");
		
		System.out.println("Giocatore 1");
		String name=scanner.nextLine();
		
		System.out.println("Giocatore 2");
		String name2 = scelta[r.nextInt(3)];
		System.out.println(name2);
		
		if (name.equals("forbice") && name2.equals("carta")
			||name.equals("carta") && name2.equals("sasso")
			||name.equals("sasso") && name2.equals("forbice")){
			System.out.println("vince giocatore 1");
		}else if(name.equals(name2)){
			System.out.println("pareggio");
			
		}else System.out.println("vince giocatore 2");
		scanner.close();
		
	}		
}
