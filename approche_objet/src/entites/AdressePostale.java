package entites;

public class AdressePostale {
	
	protected int numRue;
	protected String libelleRue;
	protected String codePostal;
	protected String ville;
	
	public int getNumRue() {
		return numRue;
	}
	
	public String getLibelleRue() {
		return libelleRue;
	}
	
	public String getCodePostal() {
		return codePostal;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}
	
	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}
	
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	
	public void setVille(String nomVille) {
		this.ville = nomVille;
	}

	public AdressePostale() {}
	
	public AdressePostale(int numRue, String libelleRue, String codePostal, String nomVille) {
		this();
		this.setNumRue(numRue);
		this.setLibelleRue(libelleRue);
		this.setCodePostal(codePostal);
		this.setVille(nomVille);
	}
	
	public AdressePostale(AdressePostale adresse) {
		this(adresse.getNumRue(), adresse.getLibelleRue(), adresse.getCodePostal(), adresse.getVille());
	}
	
	public String toString() {
		return this.getNumRue() + " " + this.getLibelleRue() + ", " + this.getCodePostal() + " " + this.getVille();
	}
	
	public void afficher() {
		System.out.println(this);

}
