package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.LivretA;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte = new Compte("ABC1", 30.00);
		System.out.println(compte);
		
		LivretA livret = new LivretA("ABC2", 30.00, 15.0);
		System.out.println(livret);
	}

}
