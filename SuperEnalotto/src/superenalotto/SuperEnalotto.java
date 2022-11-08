package superenalotto;

import java.util.ArrayList;
import java.util.*;

public class SuperEnalotto {

	static ArrayList<Integer>numeri = new ArrayList<Integer>();
	static ArrayList<Integer>numeriScelti = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("scegli il primo numero: ");
		numeriScelti.add(scanner.nextInt());
		
		System.out.println("scegli il secondo numero: ");
		numeriScelti.add(scanner.nextInt());
		
		System.out.println("scegli il terzo numero: ");
		numeriScelti.add(scanner.nextInt());
		
		System.out.println("scegli il quarto numero: ");
		numeriScelti.add(scanner.nextInt());
		
		System.out.println("scegli il quinto numero: ");
		numeriScelti.add(scanner.nextInt());
		
		System.out.println("scegli il sesto numero: ");
		numeriScelti.add(scanner.nextInt());
		
		for(int i=0;i<numeriScelti.size();i++) {
			Collections.sort(numeriScelti);	
		}
		System.out.println(numeriScelti);
		System.out.println();
		
		Random r = new Random();
		while (numeri.size() < 6) { 
	        int a = r.nextInt(1, 91);
	        if (!numeri.contains(a)) {
	            numeri.add(a);
	        }
		}	
		Collections.sort(numeri);
		System.out.println(numeri);
		
		numeri.retainAll(numeriScelti);
		System.out.println(numeri);
	}
}
