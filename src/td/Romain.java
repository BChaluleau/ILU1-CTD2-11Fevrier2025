package td;

public class Romain {
	// attributs
	private String nom;
	private int force;

	// methodes
	public String getNom() {
		return nom;
	}

	public String prendreParole() {
		return "Le romain " + getNom() + ":";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + texte); // DRY
	}

	public void recevoirCoup(int forceCoup) {
		force -= forceCoup; // effet 1
		if (force > 0) {
			parler("Aïe"); // effet 2
		} else {
			parler("J'abandonne");
		}
	}

}
