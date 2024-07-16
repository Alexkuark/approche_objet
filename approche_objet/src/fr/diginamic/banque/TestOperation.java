package fr.diginamic.banque;

import fr.diginamic.banque.entites.Operation;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;

public class TestOperation {

	public static void main(String[] args) {

		Credit credit1 = new Credit("18-07-2023", 1000);
		Debit debit1 = new Debit("21-10-2023", 250);
		Credit credit2 = new Credit("11-11-2023", 5000);
		Debit debit2 = new Debit("24-12-2023", 10000);
		
		Operation[] tab = {credit1, debit1, credit2, debit2};
		double montantGlobal = 0;
		
		for(Operation operation : tab) {
			System.out.println(operation.getType() + "\n" + operation);
			if(operation.getType()=="DEBIT") {
				montantGlobal += operation.getMontant();
			}
			else {
				montantGlobal -= operation.getMontant();
			}
		}
		System.out.println("le montant global est égal à " + montantGlobal);

	}

}
