package srl.neotech.corsojava.albero;

public class Startup {

	public static void main(String[] args) {
		
		Albero albero1 = new Albero(13,1.6,0.5,true);
		Albero albero2 = new Albero(12,1.7,0.5,false);
		Albero albero3 = new Albero(6,2.3,0.4,true);
		Albero albero4 = new Albero(4,1.98,0.3,true);
		
		System.out.println(albero1.isRaccoglibile());
		System.out.println(albero2.isRaccoglibile());
		System.out.println(albero3.isRaccoglibile());
		System.out.println(albero4.isRaccoglibile());
		
	}

}
