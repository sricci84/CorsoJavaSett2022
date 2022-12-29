package srl.neotech.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;


import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

@Component
public class Autosalone {

	private ArrayList<Automobile> automobili=new ArrayList<Automobile>();
	Random r = new Random();
	Faker f = new Faker();
	
	
	//Verrà chiamato da Spring, quando verrà avviata l'applicazione,  perchè è un Bean Component
	public Autosalone() {
		//popolare la lista delle autos...
		for(int i =0;i<10;i++) {
		Automobile primaAuto=new Automobile();
		primaAuto.setId(i+1);
		primaAuto.setTarga(f.numerify("AD###RR"));
		primaAuto.setColore(EColore.values()[r.nextInt(EColore.values().length)]);
		primaAuto.setAlimentazione(EAlimentazione.values()[r.nextInt(EAlimentazione.values().length)]);
		primaAuto.setAnnoCostruzione(r.nextInt(1999, 2022));
		primaAuto.setCostruttore(ECostruttore.values()[r.nextInt(ECostruttore.values().length)]);
		primaAuto.setModello(f.animal().name());
		primaAuto.setCosto(new BigDecimal(BigInteger.valueOf(r.nextInt(6000000, 35000000)), 2));
		
		Accessorio cerchiLega=new Accessorio();
		cerchiLega.setClasse(EClasseAccessorio.values()[r.nextInt(EClasseAccessorio.values().length)]);
		cerchiLega.setTipologia(ETipologiaAccessorio.values()[r.nextInt(ETipologiaAccessorio.values().length)]);
		cerchiLega.setCosto(new BigDecimal(BigInteger.valueOf(r.nextInt(60000, 350000)), 2));
		
		primaAuto.getAccessori().add(cerchiLega);
		automobili.add(primaAuto);
		}
	}

	
	public ArrayList<Automobile> getAutomobili() {
		return automobili;
	}

	public void setAutomobili(ArrayList<Automobile> automobili) {
		this.automobili = automobili;
	}
	
	
	
	
}
