package fr.diginamic.banque.entites;

public abstract class Operation {
	
	protected String date;
	protected double montant;
	
	public String getDate() {
		return date;
	}
	
	public double getMontant() {
		return montant;
	}
	
	public Operation() {}
	
	public Operation(String date, double montant) {
		this.date = date;
		this.montant = montant;
	}
	
	public String toString() {
		return "la date de l’opération : " + this.getDate() + "\nle montant de l’opération : " + this.getMontant();
	}
	
	public abstract String getType();

}
