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
		this.numRue = numRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = nomVille;
	}

}
