package fr.enumeration;

import java.util.ArrayList;

import fr.listes.Ville;

import fr.enumeration.Continent;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		
		ArrayList<Ville> villes = new ArrayList<Ville>();
		villes.add(new Ville("New York", 8804190, Continent.AMERIQUES));
		villes.add(new Ville("Paris", 2133111, Continent.EUROPE));
		villes.add(new Ville("Pékin", 21893095, Continent.ASIE));
		villes.add(new Ville("Moscou", 13104177, Continent.ASIE));
		villes.add(new Ville("Berlin", 3677472, Continent.EUROPE));
		villes.add(new Ville("Sydney", 5312163, Continent.AUSTRALIE));
		villes.add(new Ville("Sao Paulo", 12396372, Continent.AMERIQUES));
		villes.add(new Ville("Dakar", 1250000, Continent.AFRIQUE));
		
		for(Ville ville : villes) {
			System.out.println(ville);
		}

	}

}
