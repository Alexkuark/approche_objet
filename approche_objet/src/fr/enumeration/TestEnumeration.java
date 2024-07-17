package fr.enumeration;

public class TestEnumeration {

	public static void main(String[] args) {

		Saison[] saisons = Saison.values();
		for(Saison saison : saisons) {
			System.out.println(saison);
		}
		
		String nom = "ETE";
		Saison saison = Saison.valueOf(nom);
		System.out.println(saison.getLibelle());
		
		String libelle = "Hiver";
		System.out.println(Saison.getSaisonByLibelle(libelle));

	}

}
