package projet_de_gestion_bibliotheque;
public class Livre extends Document {
	protected String auteur;
	protected int nbPages;

	public Livre(int pNumeroEnregistrement, String pTitre, String pAuteur, int pNbPages) {
		super(pNumeroEnregistrement,pTitre);
		this.auteur = pAuteur;
		this.nbPages = pNbPages;
		}
		
	

	@Override
	public String toString() {
		return super.toString() + "auteur=" + auteur + ", nbPages=" + nbPages;
	}



	/**
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/**
	 * @return the nbPages
	 */
	public int getNbPages() {
		return nbPages;
	}

	/**
	 * @param nbPages the nbPages to set
	 */
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
		
	}


