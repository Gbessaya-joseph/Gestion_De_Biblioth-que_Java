package projet_de_gestion_bibliotheque;

public class Bibliothèque {
    private Document[] documents;
    private int nbDocuments;
    
    public Bibliothèque(int pTaille) {
        this.documents = new Document[pTaille];
        this.nbDocuments = 0;
    }
    
    public void ajouterDocument(Document pDocument) {
        this.documents[this.nbDocuments] = pDocument;
        this.nbDocuments++;
        //afficher un message si  le document est bien ajouter
        if (this.nbDocuments == this.documents.length) {
            System.out.println("La bibliothèque est pleine");
        }else {
            System.out.println("Le document a bien été ajouté");
        }

    }

    // methode qui renvoie le ième document, ou null si le document n'existe pas
    public Document getDocument(int i) {
        if (i < 0 || i >= this.nbDocuments) {
            return null;
        }
        return this.documents[i];
    }
    
    public void afficherDocuments() {
        for (int i = 0; i < this.nbDocuments; i++) {
            System.out.println("Document n°" + (i + 1) + " : " + this.documents[i]);
        }
    }

    public void supprimerDocument(Document pDocument) {
        int i = 0;
        while (i < this.nbDocuments && this.documents[i] != pDocument) {
            i++;
        }
        if (i < this.nbDocuments) {
            for (int j = i; j < this.nbDocuments - 1; j++) {
                this.documents[j] = this.documents[j + 1];
            }
            this.nbDocuments--;
            System.out.println("Le document a bien été supprimé");
        }
    
         
    }

    public void afficherAuteurs() {
        for (int i = 0; i < this.nbDocuments; i++) {
            if (this.documents[i] instanceof Livre) {
                Livre l = (Livre) this.documents[i];
                System.out.println(l.getAuteur());
            }
        }
    }
    
    /* 
    public void afficherDocumentsParType(String pType) {
        for (int i = 0; i < this.nbDocuments; i++) {
            if (this.documents[i].getClass().getSimpleName().equals(pType)) {
                System.out.println(this.documents[i]);
            }
        }
    }
    
    public void afficherDocumentsParAuteur(String pAuteur) {
        for (int i = 0; i < this.nbDocuments; i++) {
            if (this.documents[i] instanceof Livre) {
                Livre l = (Livre) this.documents[i];
                if (l.getAuteur().equals(pAuteur)) {
                    System.out.println(this.documents[i]);
                }
            }
        }
    }
    
    public void afficherDocumentsParLangue(String pLangue) {
        for (int i = 0; i < this.nbDocuments; i++) {
            if (this.documents[i] instanceof Dictionnaire) {
                Dictionnaire d = (Dictionnaire) this.documents[i];
                if (d.getLangue().equals(pLangue)) {
                    System.out.println(this.documents[i]);
                }
            }
        }
    }
    
    public void afficherDocumentsParNiveauScolaire(int pNiveauScolaire) {
        for (int i = 0; i < this.nbDocuments; i++) {
            if (this.documents[i] instanceof Manuel) {
                Manuel m = (Manuel) this.documents[i];
            }

}
}*/
}
