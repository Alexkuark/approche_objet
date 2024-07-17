package fr.enumeration;

public enum Continent {
	
	AFRIQUE("Afrique"),
	AMERIQUES("Ameriques"),
	ANTARTIQUE("Antartique"),
	ASIE("Asie"),
	AUSTRALIE("Australie"),
	EUROPE("Europe");

	private String libelle;

	Continent(String nom) {
		this.setLibelle(nom);
	}

	public String getLibelle() {
		return libelle;
	}

	private void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public String toString() {
		return this.getLibelle();
	}

}
