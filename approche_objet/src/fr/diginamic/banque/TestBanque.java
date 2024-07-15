package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte = new Compte("ABC1", 30.00);
		System.out.println(compte);
	}

}
