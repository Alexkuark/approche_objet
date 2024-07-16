package fr.listes;

import fr.listes.Ville;

public class TestVille {

	public static void main(String[] args) {

		Ville ville1 = new Ville("Carcassonne", 47800);
		Ville ville2 = new Ville("Carcassonne", 47800);
		Ville ville3 = new Ville("Carcassonne", 47800);
		
		System.out.println(ville1.equals(ville2));
		ville2.setNom("Nice");
		System.out.println(ville1.equals(ville2));
		ville3.setNbHabitants(343000);
		System.out.println(ville1.equals(ville3));

	}

}
