package fr.listes;

import fr.enumeration.Continent;

public class Ville implements Comparable<Ville> {
	
	protected String nom;
	protected int nbHabitants;
	protected Continent continent;
	
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
	
	private Continent getContinent() {
		return this.continent;
	}

	
	public Ville(String nom, int population) {
		this.setNom(nom);
		this.setNbHabitants(population);
	}
	
	public Ville(String nom, int population, Continent continent) {
		this.setNom(nom);
		this.setNbHabitants(population);
		this.continent = continent;
	}
	
	public String toString() {
		return this.getNom() + " (" + this.getContinent() + ")\nPopulation : " + this.getNbHabitants() + " habitants";
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

	@Override
	public int compareTo(Ville o) {
		if (this.nbHabitants > o.getNbHabitants()) {
			return 1;
		}
		else if (this.nbHabitants < o.getNbHabitants()) {
			return -1;
		}
		else {
			return 0;
		}
		
	}

}
