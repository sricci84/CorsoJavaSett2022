package srl.neotech.corsojava.calcoloesame;

import java.util.ArrayList;

public class CalcoloEsame {
	
	static ArrayList<Studente>voti=new ArrayList<Studente>();

	public static void main(String[] args) {
		
		Studente studente=new Studente(17,8);
		if(studente.getVotoScritto()<0 || studente.getVotoScritto()>25 || studente.getVotoOrale()<-9 || studente.getVotoOrale()>9) {
			System.out.println("inserire i dati correttamente:voto scritto tra 0 e 24 - voto orale tra -8 e 8 ");
			
		}else {
		voti.add(studente);
		
		Integer risultatoFinale=studente.getVotoScritto()+studente.getVotoOrale();
		if (studente.getVotoScritto()<0 && risultatoFinale>18) {
			System.out.println("bocciato "+risultatoFinale);
		}else if(studente.getVotoScritto()<0 && studente.getVotoOrale()<18) {
			System.out.println("bocciato "+risultatoFinale);	
		}else if(studente.getVotoScritto()>0 && risultatoFinale<18) {
			System.out.println("bocciato "+risultatoFinale);
		}else if(risultatoFinale==31 || risultatoFinale==32) {
			System.out.println("congratulazioni 30 e lode");
		}else {
			System.out.println("promosso "+risultatoFinale);
			}
		}
	}
}

