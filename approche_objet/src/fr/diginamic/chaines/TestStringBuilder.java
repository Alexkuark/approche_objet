package fr.diginamic.chaines;

public class TestStringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder chaine = new StringBuilder();
		
		long debut = System.currentTimeMillis();

		for(int i=1; i<=100000; i++) {
			chaine.append(i);
		}
		
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
		
		String chaine2 = "";
		
		debut = System.currentTimeMillis();

		for(int i=1; i<=100000; i++) {
			chaine2 += i;
		}
		
		fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
	}

}
