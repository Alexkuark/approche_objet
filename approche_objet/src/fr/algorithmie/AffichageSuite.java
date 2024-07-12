package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		System.out.println("tous les nombres de 1 à 10 inclus :");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("tous les nombres pairs de 0 à 10 inclus :");
		for(int i=0;i<=10;i=i+2) {
			System.out.println(i);
		}
		System.out.println("tous les nombres impairs de 1 à 9 inclus :");
		for(int i=1;i<10;i=i+2) {
			System.out.println(i);
		}
		
		System.out.println("tous les nombres de 1 à 10 inclus :");
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("tous les nombres pairs de 0 à 10 inclus :");
		i=0;
		while(i<=10) {
			System.out.println(i);
			i=i+2;
		}
		System.out.println("tous les nombres impairs de 1 à 9 inclus :");
		i=1;
		while(i<10) {
			System.out.println(i);
			i=i+2;
		}
	}

}
