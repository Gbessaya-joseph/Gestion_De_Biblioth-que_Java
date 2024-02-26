package projet_de_gestion_bibliotheque;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Bibliothèque B1 = new Bibliothèque(5);
		Livre L1 = new Livre(01, "Mandat", "Seydou Badian", 150);
		Roman R = new Roman(01, "Symphonie pastorale", "André Gide", 150, 100000000);
		B1.ajouterDocument(L1);	
		B1.ajouterDocument(R);
		System.out.println("Le nouveau document est :");
		B1.afficherDocuments();
		Revue R1 = new Revue(02, "Mandat", 01, 2019);
		B1.ajouterDocument(R1);
		System.out.println("Le nouveau document est :");
		B1.afficherDocuments();
		//B1.supprimerDocument(L1);
		System.out.println("Le nouveau document est :");
		Livrotheque Livrotheque = new Livrotheque(5);
		Livrotheque.ajouterLivre3(L1);
		System.out.println("Le nouveau livre est :");
		Livrotheque.afficherLivres3();
		B1.afficherTousLesAuteurs();
		//Donner la main à l'utilisateur pour pouvoir ajouter des documents
		//Donner la main à l'utilisateur pour pouvoir supprimer des documents
		Scanner clavier = new Scanner(System.in);
		System.out.println("Voulez-vous ajouter un document ?");
		String reponse = clavier.nextLine();
		if (reponse.equals("oui")) {
			System.out.println("Quel type de document voulez-vous ajouter ?");
			String type = clavier.nextLine();
			if (type.equalsIgnoreCase("livre")) {
				System.out.println("Quel est le titre ?");
				String titre = clavier.nextLine();
				System.out.println("Quel est l'auteur ?");
				String auteur = clavier.nextLine();
				System.out.println("Quel est le nombre de pages ?");
				int pages = clavier.nextInt();
				Livre L3 = new Livre(03, titre, auteur, pages);
				B1.ajouterDocument(L3);
				Livrotheque.ajouterLivre3(L3);

			}
			else if (type.equalsIgnoreCase("revue")) {
				System.out.println("Quel est le titre ?");
				String titre = clavier.nextLine();
				System.out.println("Quel est le numéro ?");
				int numero = clavier.nextInt();
				System.out.println("Quelle est l'année ?");
				int annee = clavier.nextInt();
				Revue R2 = new Revue(04, titre, numero, annee);
				B1.ajouterDocument(R2);
			}
			else if(type.equalsIgnoreCase("Roman")) {
				System.out.println("Quel est le titre ?");
				String titre = clavier.nextLine();
				System.out.println("Quel est l'auteur ?");
				String auteur = clavier.nextLine();
				System.out.println("Quel est le nombre de pages ?");
				int pages = clavier.nextInt();
				System.out.println("Quel est le prix littéraire ?");
				int prix = clavier.nextInt();
				Roman R3 = new Roman(05, titre, auteur, pages, prix);
				Livrotheque.ajouterLivre3(R3);
			}
			else if(type.equalsIgnoreCase("Manuel")) {
				System.out.println("Quel est le titre ?");
				String titre = clavier.nextLine();
				System.out.println("Quel est l'auteur ?");
				String auteur = clavier.nextLine();
				System.out.println("Quel est le nombre de pages ?");
				int pages = clavier.nextInt();
				System.err.println("Quel le niveau scolaire de ce manuel ?");
				int niveauScolaire = clavier.nextInt();
				Manuel M1 = new Manuel(06, titre, auteur, pages, niveauScolaire);
				Livrotheque.ajouterLivre3(M1);
			}
			else if(type.equalsIgnoreCase("Dictionnaire")) {
				System.out.println("Quel est le titre ?");
				String titre = clavier.nextLine();
				System.out.println("Quel est la langue du dictionnaire ?");
				String langue = clavier.nextLine();
				Dictionnaire D1 = new Dictionnaire(07,titre, langue);
				B1.ajouterDocument(D1);
				B1.afficherDocuments();
			}
			else {
				System.out.println("Ce type de document n'existe pas");
				
			}
			B1.afficherDocuments();
		}else {
			B1.afficherDocuments();
		}
		clavier.close();
	}

}
