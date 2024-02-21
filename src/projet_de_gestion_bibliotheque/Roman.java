package projet_de_gestion_bibliotheque;

public class Roman extends Livre {
	private int prixLitteraire;
	
	public Roman(int pNumeroEnregistrement, String pTitre, String pAuteur, int pNbPages, int pPrixLitteraire) {
		super(pNumeroEnregistrement, pTitre, pAuteur, pNbPages);
		this.prixLitteraire = pPrixLitteraire;
	}

	@Override
	public String toString() {

		return super.toString() + "prixLitteraire=" + prixLitteraire;
	}
	public int getPrixLitteraire() {
		return prixLitteraire;
	}
	

}
