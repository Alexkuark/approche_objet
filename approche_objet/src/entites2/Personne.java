package entites2;
import entites.AdressePostale;

public class Personne {
	
	protected String nom;
	protected String prenom;
	protected AdressePostale adresse;
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public AdressePostale getAdresse() {
		return adresse;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setAdresse(AdressePostale adressePostale) {
		this.adresse = adressePostale;
	}
	
	public void setAdresse(int numRue, String libelleRue, String codePostal, String nomVille) {
		this.setAdresse(new AdressePostale(numRue, libelleRue, codePostal, nomVille));
	}
	
	public Personne() {}
	
	public Personne(String nom, String prenom) {
		this();
		this.setNom(nom);
		this.setPrenom(prenom);
	}
	
	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		this(nom, prenom);
		this.setAdresse(adressePostale);
	}
	
	public Personne(String nom, String prenom, int numRue, String libelleRue, String codePostal, String nomVille) {
		this(nom, prenom, new AdressePostale(numRue, libelleRue, codePostal, nomVille));
	}
	
	public Personne(Personne personne) {
		this(personne.getNom(), personne.getPrenom(), new AdressePostale(personne.getAdresse()));
	}
	
	public String toString() {
		return this.getNom().toUpperCase() + " " + this.getPrenom();
	}
	
	public void afficher() {
		System.out.println(this);
	}

}
