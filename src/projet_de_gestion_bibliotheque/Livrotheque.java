package projet_de_gestion_bibliotheque;

/**dont 
les instances ont les mêmes fonctionnalités que les Bibliotheques 
mais 
sont 
Comment 
entièrement 
constituées 
de 
livres. 
optimiser dans la classe Livrotheque la méthode 
afficherAuteurs ? */
public class Livrotheque {
    //la classe Livrotheque est une sous-classe de la classe Bibliotheque
    private Livre[] livres;
    private int nbLivres;

    public Livrotheque(int pTaille) {
        super(); // Call to the superclass constructor
        this.livres = new Livre[pTaille];
        this.nbLivres = 0;
    }

    public void ajouterLivre(Livre pLivre) {
        this.livres[this.nbLivres] = pLivre;
        this.nbLivres++;

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


}
