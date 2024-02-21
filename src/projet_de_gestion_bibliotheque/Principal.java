package projet_de_gestion_bibliotheque;

public class Principal {

	public static void main(String[] args) {
		Bibliothèque B1 = new Bibliothèque(5);
		Livre L1 = new Livre(01, "Mandat", "Seydou Badian", 150);
		B1.ajouterDocument(L1);	
		System.out.println("Le nouveau document est :");
		B1.afficherDocuments();

	}

}
