package entites2;

public class TestPersonne {

	public static void main(String[] args) {
		Personne personne = new Personne("Pierre", "Jean");
		personne.setAdresse(123, "Rue Bidon", "0", "Springfield");
		personne.afficher();

	}

}
