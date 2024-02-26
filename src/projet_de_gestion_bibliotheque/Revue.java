package projet_de_gestion_bibliotheque;

public class Revue extends Document {
	private int mois;
	private int annee;

	public Revue(int pNumeroEnregistrement, String pTitre, int pMois, int pAnnee) {
		super(pNumeroEnregistrement, pTitre);
		this.mois = pMois;
		this.annee = pAnnee;
	}
	
	

	@Override
	public String toString() {
		return "Revue [ Numero d enregistrement " + numeroEnregistrement+ ", Titre " + titre + " Date parution "+mois+"-"+annee+"]";
	}

	

	/**
	 * @return the mois
	 */
	public int getMois() {
		return mois;
	}

	/**
	 * @param mois the mois to set
	 */
	public void setMois(int mois) {
		this.mois = mois;
	}

	/**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}
}
