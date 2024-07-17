package fr.listes;

import java.util.ArrayList;

public class TestListeString {
	
	public static void main(String[] args) {
		
		ArrayList<String> villes = new ArrayList<String>();
		villes.add("Nice");
		villes.add("Carcassonne");
		villes.add("Narbonne");
		villes.add("Lyon");
		villes.add("Foix");
		villes.add("Pau");
		villes.add("Marseille");
		villes.add("Tarbes");
		
		int longest = 0;
		String LongestVille = "";
		
		for(String ville : villes) {
			
			if(ville.length() > longest) {
				LongestVille = ville;
				longest = ville.length();
			}
			
		}
		System.out.println(LongestVille);
		
		ArrayList<String> villes2 = new ArrayList<String>();
		for(String ville : villes) {
			villes2.add(ville.toUpperCase());
		}
		villes = villes2;
		
		int i = 0;
		while(i < villes.size()) {
			if(villes.get(i).charAt(0)=='N') {
				villes.remove(villes.get(i));
			}
			else {
				i++;
			}
		}
		for(String ville : villes) {
			System.out.println(ville);
		}
		
	}

}
