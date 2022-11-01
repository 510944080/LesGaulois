package zhayang;

import java.io.ObjectInputStream.GetField;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	
	
	
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getEffetPotion() {
		return effetPotion;
	}
	
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "+ romain.getNom());
		romain.recevoirCoup((force / 3)*this.effetPotion);
	}
	public void boirePotion(int effetPotion){
		this.effetPotion=effetPotion;
		parler("  Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
			
	}
	
	
	
	
	@Override 
	public String toString() { 
	
		return "Gaulois [nom=" + nom + ", force=" + force+ ", effetPotion=" + effetPotion + "]"; }
	 
	public static void main(String[] args) {
		//TODO créer un main permettant de tester la classe Gaulois
		//creat a gaulois who named asterix
		Gaulois gaulois=new Gaulois("Asterix", 8);
		Romain romain = new Romain("Minus", 6);
		Druide druide = new Druide("1", 5, 10);
		
		//System.out.println(asterix);
		
		//obtenir le nom de l'objet
		//System.out.println(asterix.getNom());
		//System.out.println(asterix.getForce());
		//System.out.println(asterix.getEffetPotion());
		//test of methodes
		//System.out.println(asterix.prendreParole());
		gaulois.parler("Bonjour a tous");
		romain.parler("UN GAU UN GAUGAU...");
		
		
		//gaulois.boirePotion(gaulois.effetPotion);
		
		//System.err.println(gaulois.getEffetPotion());
		
		while (romain.getForce()>0) {
			gaulois.frapper(romain);
		}
	
		//System.out.println(gaulois);
	}
}
    
