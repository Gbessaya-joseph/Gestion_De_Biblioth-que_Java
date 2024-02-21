package projet_de_gestion_bibliotheque;

public class Manuel extends Livre {
	private int niveauScolaire;
	
	public Manuel(int pNumeroEnregistrement, String pTitre, String pAuteur, int pNbPages, int pNiveauScolaire) {
		super(pNumeroEnregistrement, pTitre, pAuteur, pNbPages);
		this.niveauScolaire = pNiveauScolaire;
	}

	@Override
	public String toString() {
		return super.toString() + "niveauScolaire=" + niveauScolaire;
	}
	public int getNiveauScolaire() {
		return niveauScolaire;
	}
	

}
