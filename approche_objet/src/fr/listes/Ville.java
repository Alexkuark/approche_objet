package fr.listes;

public class Ville {
	
	protected String nom;
	protected int nbHabitants;
	
	public Ville() {}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getNbHabitants() {
		return this.nbHabitants;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setNbHabitants(int population) {
		this.nbHabitants = population;
	}
	
	public Ville(String nom, int population) {
		this.setNom(nom);
		this.setNbHabitants(population);
	}
	
	public boolean equals(Object another) {
		if(another instanceof Ville) {
			Ville otherVille = (Ville) another;
			return otherVille.getNom() == this.getNom() && otherVille.getNbHabitants() == this.getNbHabitants();
		}
		else {
			return false;
		}
	}

}
