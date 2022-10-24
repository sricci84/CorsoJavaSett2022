package srl.neotech.corsojava.arraylist01;

import java.util.ArrayList;

public class Arr {
	
	static ArrayList <String> alberi= new ArrayList <String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final ArrayList <String> alberi= new ArrayList <String>();
		for(int i=0;i<200;i++) {
			Albero albero = new Albero();
			if((i%2)!=0) {
			albero.altezza=50;
			alberi.add("albero "+i+" alto "+albero.altezza);
			}
			else alberi.add("albero "+i);
		}
		alberi.set(170, "albero 170 alto 400");
		for(int k=0;k<alberi.size();k++) {
			System.out.println(alberi.get(k));
		}
		
		
}}