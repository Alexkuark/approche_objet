package fr.diginamic.banque.entites;

public class Compte {
	
	protected String numCompte;
	protected double solde;
	
	public String getNumCompte() {
		return this.numCompte;
	}
	
	public double getSolde() {
		return this.solde;
	}
	
	public void setSolde(double montant) {
		this.solde = montant;
	}
	
	public Compte() {}
	
	public Compte(String numero, double montant) {
		this.numCompte = numero;
		this.solde = montant;
	}
	
	public String toString() {
		return "Compte " + this.getNumCompte() + "\nSolde : " + this.getSolde();
	}

}
