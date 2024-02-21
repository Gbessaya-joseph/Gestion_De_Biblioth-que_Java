package projet_de_gestion_bibliotheque;

public class Dictionnaire extends Document {
	private String langue;

	public Dictionnaire(int pNumeroEnregistrement, String pTitre, String pLangue) {
		super(pNumeroEnregistrement, pTitre);
		this.langue = pLangue;
	}

		
	@Override
	public String toString() {
		return super.toString() + "langue=" + langue;
	}
	
	public String getLangue() {
		return langue;
	}

}
