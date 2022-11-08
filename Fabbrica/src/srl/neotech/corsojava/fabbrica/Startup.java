package srl.neotech.corsojava.fabbrica;

import java.util.ArrayList;

public class Startup {
	
	static ArrayList<Cisterna> cisterne = new ArrayList<Cisterna>();
	static final int THRESHOLD=50;

	public static void main(String[] args) {
		
		for(int i =0;i<3;i++) {
		
			Cisterna cisterna = new Cisterna();
			cisterna.setQuantita();
			cisterna.setEvapPerDay();
			cisterna.setLivelloGas();
			cisterna.setMaterialeCisterna();
			cisterne.add(cisterna);
		}
		
		int sum=0;
		for(Cisterna c : cisterne) {
			
			if(c.getLivelloGas()>=THRESHOLD) {
				
				sum +=c.getQuantita();
				System.out.println("Quantita: "+c.getQuantita()+" EvapPerDay: "+c.getEvapPerDay()+" LivelloGas: "+c.getLivelloGas()+" MaterialeCisterna: "
						+c.getMaterialeCisterna()+" BibitaVendibile: "+sum);
			}else
			
			System.out.println("Quantita: "+c.getQuantita()+" EvapPerDay: "+c.getEvapPerDay()+" LivelloGas: "+c.getLivelloGas()+" MaterialeCisterna: "
			+c.getMaterialeCisterna());
		}
		System.out.println("Quantita totale bibita vendibile al momento: "+sum);
		System.out.println("Numero totale cisterne: "+cisterne.size());
		
		int sum2=0;
			for(Cisterna c : cisterne) {
				Integer livello=c.getLivelloGas();
				Integer evap=c.getEvapPerDay();
				int risultato=livello-(evap*7);
				
				if(risultato<THRESHOLD) {
					sum2+=c.getQuantita();	
			}
		}
			System.out.println("Dopo 7 giorni "+ sum2 +" litri non sono  piu vendibile");
			
			
			int giorni=0;
			int i =1;
			 
			for(Cisterna c : cisterne) {
				Integer livello=c.getLivelloGas();
				Integer evap=c.getEvapPerDay();
				
				
				while((livello-(evap*i))>=THRESHOLD){
					i++;
					giorni+=1;	
				}
			}
			
			System.out.println("Al giorno numero: "+giorni+" non ci sarà neanche una bibita vendibile");
				
			}
			
		}
	
		
	


