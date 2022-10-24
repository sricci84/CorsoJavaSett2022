package srl.neotech.corsojava.arraylist02;

import java.util.ArrayList;

public class GiocattoliList {

	public static void main(String[] args) {
		ArrayList<String>giocattoli=new ArrayList<>();
		for(int i=0;i<800;i++) {
			Giocattolo giocattolo = new Giocattolo();
			if(i<=100) {
				giocattoli.add("giocattolo di "+giocattolo.materiale+' '+i+' '+giocattolo.colore1);
			}else if(i>100 && i<=200) {
				giocattoli.add("giocattolo di "+giocattolo.materiale+' '+i+' '+giocattolo.colore2);
			}else if(i>200 && i<=300) {
				giocattoli.add("giocattolo di "+giocattolo.materiale+' '+i+' '+giocattolo.colore3);
			}else if(i>300 && i<=400) {
				giocattoli.add("giocattolo di "+giocattolo.materiale+' '+i+' '+giocattolo.colore4);
			}else
				giocattoli.add("giocattolo di "+giocattolo.materiale+' '+i+' '+giocattolo.colore5);

			}
	
	for(String g:giocattoli) {
		System.out.println(g);
		
	}
}
}
