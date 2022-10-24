package srl.neotech.corsojava.arraylist01;

import java.util.ArrayList;
import java.util.Arrays;

public class AlberoList {

	public static void main(String[] args) {
		int altezza=50;
		int altezza2=400;
		
	ArrayList <String> alberi= new ArrayList <String>();
	for(int i=0;i<200;i++) {
		if(i%2==0) {
		alberi.add("albero "+i);
		//System.out.println(alberi.get(i));
	}else {
		alberi.add("albero "+i+" alto "+altezza);
		}
	}
	alberi.set(170,"albero 170 alto "+altezza2);
	for(int j=0;j<alberi.size();j++) {
		System.out.println(alberi.get(j));
		}
	}
}
