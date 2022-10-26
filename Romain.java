package zhayang;

/**
 * @author HP
 *
 */
/**
 * @author HP
 *
 */
public class Romain {
	private String nom;
	private int force;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		assert (force>0):"force error!";
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	public int getForce() {
		
		return force;
	}
	
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		int force1=force;//un variable locale pour stocker le valeur de force
		
		assert (force>0):"force n'est pas positive!";
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
	} 
		else {
			parler("J'abandonne...");
		}
		
		assert (force1>force):"force n'a pas diminue";
	
	}

	

	
	public static void main(String[] args) {
		//creat a romain 
		Romain minus=new Romain("Minus", 6);
		//test for methodes
		//System.out.println(minus.prendreParole());
		minus.parler("un gau un gaugau");
		minus.recevoirCoup(8);
		
	}
}



