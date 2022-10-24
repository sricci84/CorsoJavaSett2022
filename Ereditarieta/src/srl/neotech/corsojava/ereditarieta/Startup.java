package srl.neotech.corsojava.ereditarieta;

import java.util.ArrayList;

public class Startup {
	
	public static ArrayList<Prodotto> catalogo = new ArrayList<Prodotto>();

	public static void main(String[] args) {
		
		for(int i=0;i<200;i++) {
			if(i<100) {
		
		Alimentare alimentare=new Alimentare();
		alimentare.setCodiceBarre("1236534");
		alimentare.setDescrizione("Panino");
		alimentare.setPrezzoUnitario(10);
		alimentare.setData("10/10/2023");
		alimentare.applicaSconto(10);
		
		catalogo.add(alimentare);
		System.out.println();

			}else {
		NonAlimentare nonAlimentare = new NonAlimentare();
		nonAlimentare.setCodiceBarre("3446788");
		nonAlimentare.setDescrizione("giocattolo");
		nonAlimentare.setMateriale("plastica");
		nonAlimentare.setPrezzoUnitario(20);
		nonAlimentare.applicaSconto(20);
		
		catalogo.add(nonAlimentare);
		System.out.println();
			}
		}
		System.out.println("Numero prodotti totali: "+catalogo.size());
	}
}
