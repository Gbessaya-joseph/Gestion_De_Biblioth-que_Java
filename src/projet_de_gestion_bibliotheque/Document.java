package projet_de_gestion_bibliotheque;

public class Document {
	protected int numeroEnregistrement;
	protected String titre;

	public Document(int pNumeroEnregistrement, String pTitre) {
		this.numeroEnregistrement = pNumeroEnregistrement;
		this.titre = pTitre; 
	}

	public String toString() {
		return "Document [numeroEnregistrement=" + numeroEnregistrement + ", titre=" + titre + "]";
	}

	/**
	 * @return the numeroEnregistrement
	 */
	public int getNumeroEnregistrement() {
		return numeroEnregistrement;
	}

	/**
	 * @param numeroEnregistrement the numeroEnregistrement to set
	 */
	public void setNumeroEnregistrement(int numeroEnregistrement) {
		this.numeroEnregistrement = numeroEnregistrement;
	}

	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
		
}


