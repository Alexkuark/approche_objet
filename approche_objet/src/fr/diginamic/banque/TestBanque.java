package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte = new Compte("ABC1", 30.00);
		
		CompteTaux compteTaux = new CompteTaux("ABC2", 30.00, 15.0);
		
		Compte[] tab = {compte, compteTaux};
		
		for (Compte i : tab) {
			System.out.println(i);
		}
	}

}
