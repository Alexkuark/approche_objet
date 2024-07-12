package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int y = array.length;
		System.out.println("Affichage du contenu du tableau :");
		for(int i = 0; i < y; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Affichage inverse du contenu du tableau :");
		for(int i = y-1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		
		System.out.println("Copie du tableau :");
		int[] arrayCopy = new int[y];
		for(int i = 0; i < y; i++) {
			arrayCopy[i] = array[i];
		}
	}

}
