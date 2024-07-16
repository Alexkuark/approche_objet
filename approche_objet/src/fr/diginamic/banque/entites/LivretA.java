package fr.diginamic.banque.entites;

public class LivretA extends CompteTaux {
	
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
		super.setTaux(taux);;
	}
	
	public LivretA() {}
	
	public LivretA(String numero, double montant, double taux) {
		super(numero, montant, taux);
	}

}
