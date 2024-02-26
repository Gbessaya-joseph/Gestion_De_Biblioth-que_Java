package projet_de_gestion_bibliotheque;
import java.util.ArrayList;
//la classe Livrotheque est une sous-classe de la classe Bibliotheque
public class Livrotheque extends Bibliothèque {
    //la classe Livrotheque est une sous-classe de la classe Bibliotheque
	//tableau à taille fixe
    private Livre[] livres;
    //déclarer un tableau dynamiqque
    private ArrayList<Livre> livres3= new ArrayList<Livre>();
    private int nbLivres;
    public Livrotheque(int pTaille) {
        super(pTaille); // Call to the superclass constructor
        this.livres = new Livre[pTaille];
        //this.livres2 = new Livre[pTaille];
        this.livres3 = new ArrayList<Livre>();
        this.nbLivres = 0;
    }

    public void ajouterLivre(Livre pLivre) {
       //ajouter un livre , un roman , un manuel à la bibliotheque
       //verifier que le livre n'existe pas dans la bibliotheque
        this.livres[this.nbLivres] = pLivre;
        this.nbLivres++;
       
        //vérifier que le livre n'existe pas dans la bibliotheque

    }

    public void afficherLivres() {
        for (int i = 0; i < this.nbLivres; i++) {
            System.out.println(this.livres[i]);
        }
    }

    public void afficherAuteurs() {
        for (int i = 0; i < this.nbLivres; i++) {
            System.out.println(this.livres[i].getAuteur());
        }
    }

    public void supprimerLivre(Livre pLivre) {
        int i = 0;
        while (i < this.nbLivres && this.livres[i] != pLivre) {
            i++;
        }
        if (i < this.nbLivres) {
            for (int j = i; j < this.nbLivres - 1; j++) {
                this.livres[j] = this.livres[j + 1];
            }
            this.nbLivres--;
            System.out.println("Le livre a bien été supprimé");
        }

    }

    public Livre getLivre(int i) {
        if (i < 0 || i >= this.nbLivres) {
            return null;
        }
        return this.livres[i];
    }

    public int getNbLivres() {
        return this.nbLivres;
    }

    public void ajouterLivre3(Livre pLivre) {
        this.livres3.add(pLivre);
        this.nbLivres++;
        
    }
    public void afficherLivres3() {
        for (int i = 0; i < this.nbLivres; i++) {
            System.out.println(this.livres3.get(i));
        }
    }

}
