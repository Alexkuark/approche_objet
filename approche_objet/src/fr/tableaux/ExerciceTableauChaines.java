package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		String[] myTab = {"Toulouse", "Carcassonne", "Bézier", "Montpellier", "Avignon"};
		System.out.println(myTab[0]);
		System.out.println(myTab[1]);
		System.out.println(myTab[2]);
		System.out.println(myTab[3]);
		System.out.println(myTab[4]);
		
		myTab[3] = "Renne";
		System.out.println(myTab[0]);
		System.out.println(myTab[1]);
		System.out.println(myTab[2]);
		System.out.println(myTab[3]);
		System.out.println(myTab[4]);

	}

}
