package td;

// what the DRY ???
public class Gaulois {
	// attributs
	private String nom;
	private int force;
	private int effetPotion = 1; // valeur par défaut

	// constructeur
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		// effetPotion = 1;
		parler("J'arrive ! ");
	}

	// methodes
	public String getNom() {
		return nom;
	}

	public String prendreParole() {
		return "Le Gaulois " + getNom() + ":";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + texte); // DRY
	}

	public void frapper(Romain romain) {
		parler("Prends ça " + romain.getNom());
		romain.recevoirCoup(force);
	}

	public static void main(String[] args) {
		System.out.println("début programme");
		Gaulois g = new Gaulois("Asterix", 8);
		g.parler("Hello, folks");

		Romain cible = new Romain("Cible", 10);
		cible.parler("Ave jeunes gens");

		g.frapper(cible);
		g.frapper(cible);
		g.frapper(cible);
		g.frapper(cible);
		g.frapper(cible);

	}

}
