package entites;

public class AdressePostale {
	
	protected int numRue;
	protected String libelleRue;
	protected int codePostal;
	protected String ville;
	
	public int getNumRue() {
		return numRue;
	}
	
	public String getLibelleRue() {
		return libelleRue;
	}
	
	public int getCodePostal() {
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
	
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
	public void setVille(String nomVille) {
		this.ville = nomVille;
	}

	public AdressePostale() {}
	
	public AdressePostale(int numRue, String libelleRue, int codePostal, String nomVille) {
		this.setNumRue(numRue);
		this.setLibelleRue(libelleRue);
		this.setCodePostal(codePostal);
		this.setVille(nomVille);
	}
	
	public AdressePostale(AdressePostale adresse) {
		this.setNumRue(adresse.getNumRue());
		this.setLibelleRue(adresse.getLibelleRue());
		this.setCodePostal(adresse.getCodePostal());
		this.setVille(adresse.getVille());
	}

}
