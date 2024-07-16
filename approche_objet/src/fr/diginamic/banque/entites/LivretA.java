package fr.diginamic.banque.entites;

public class LivretA extends Compte {
	
	protected double taux;
	
	public String getNumCompte() {
		return super.getNumCompte();
	}
	
	public double getSolde() {
		return super.getSolde();
	}
	
	public double getTaux() {
		return this.taux;
	}
	
	public void setSolde(double montant) {
		super.setSolde(montant);;
	}
	
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	public LivretA() {}
	
	public LivretA(String numero, double montant, double taux) {
		super(numero, montant);
		this.setTaux(taux);
	}
	
	public String toString() {
		return super.toString() + "\nTaux : " + this.getTaux();
	}

}
