package fr.enumeration;

public enum Saison {
	
	PRINTEMPS("Printemps", 1),
	ETE("Eté", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);

	private String libelle;
	
	private int index;
	
	private Saison(String nom, int i) {
		this.setLibelle(nom);
		this.setIndex(i);
	}

	public int getIndex() {
		return index;
	}

	private void setIndex(int index) {
		this.index = index;
	}

	public String getLibelle() {
		return libelle;
	}

	private void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public static Saison getSaisonByLibelle(String nom) {
		Saison[] saisons = Saison.values();
		int i = saisons.length;
		do {
			i--;
		}
		while(i > 0 && saisons[i].getLibelle() != nom);
		if(i > 0) {
			return saisons[i];
		}
		else {
			return null;
		}
	}

}
