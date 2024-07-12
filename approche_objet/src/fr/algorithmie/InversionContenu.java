package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		System.out.println("Copie du tableau :");
		int y = array.length;
		String a1 = "tableau array :", a2 = "tableau arrayCopy :";
		int[] arrayCopy = new int[y];
		for(int i = 0; i < y; i++) {
			arrayCopy[i] = array[y-i-1];
			a1 = a1 + ", "+ array[i];
			a2 = a2 + ", "+ arrayCopy[i];
		}
		System.out.println(a1);
		System.out.println(a2);
	}

}
