package fr.listes;

import java.util.ArrayList;

public class FusionListe {

	public static void main(String[] args) {
		
		ArrayList<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		ArrayList<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		ArrayList<String> liste3 = fusionListe(liste1, liste2);
		for(String couleur : liste3) {
			System.out.println(couleur);
		}
		
	}
	
	public static ArrayList<String> fusionListe(ArrayList<String> liste1, ArrayList<String> liste2) {
		ArrayList<String> liste3 = new ArrayList<String>();
		for(String couleur : liste1) {
			liste3.add(couleur);
		}
		for(String couleur : liste2) {
			if (!liste3.contains(couleur)) {
				liste3.add(couleur);
			}
		}
		return liste3;
		
	}

}
