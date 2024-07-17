package fr.listes;

import java.util.ArrayList;

import fr.listes.Ville;

public class TestVille2 {

	public static void main(String[] args) {
		
		ArrayList<Ville> villes = new ArrayList<Ville>();
		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850700));
		villes.add(new Ville("Tarbes", 40600));
		
		Ville shortestVille = null;
		Ville largestVille = null;
		
		for(Ville ville : villes) {
			
			if(shortestVille == null || ville.getNbHabitants() < shortestVille.getNbHabitants()) {
				shortestVille = ville;
			}
			if(largestVille == null || ville.getNbHabitants() > largestVille.getNbHabitants()) {
				largestVille = ville;
			}
			if(ville.getNbHabitants() > 100000) {
				ville.setNom(ville.getNom().toUpperCase());
			}
			
		}
		System.out.println(largestVille);
		villes.remove(shortestVille);
		
		for(Ville ville : villes) {
			System.out.println(ville);
		}
		
	}

}
