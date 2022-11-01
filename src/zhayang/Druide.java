package zhayang;

import  java.util.*;


/**
 * @author HP
 *
 */
public class Druide {
	private String nom;
	private int effetPotionMin ; 
	private int effetPotionMax ;
	private int effetPotion = 1 ;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "+ effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}
	public int getEffetPotion() {
		return effetPotion;
		
	}
	 
	 
	 
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}
	
	public void preparePotion() {
		parler(" Je vais aller préparer une petite potion...");
		Random random=new Random();
		this.effetPotion=random.nextInt(effetPotionMax-effetPotionMin+1)+effetPotionMin;
		if (effetPotion>7) {
			parler("J'ai préparé une super potion de force " + effetPotion);
			
		}
		else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " +effetPotion );
			
		}
	}
	public void booster(Gaulois gaulois){
			if (gaulois.getNom()=="Obélix") {
				parler("  Non, Obélix !... Tu n’auras pas de potion magique ! ");
				gaulois.parler("Par Bélénos, ce n'est pas juste !");
			}
			
			else {
				
				gaulois.boirePotion(effetPotion);
			}
	}
	
	
		
	
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public static void main(String[] args) {
		//creat a druide and test
		Druide druide=new Druide("Panoramix" , 5 , 10 );
		
		druide.preparePotion();
		System.out.println(druide.getEffetPotion());
		System.out.println(druide.getEffetPotion());
		System.out.println(druide.getEffetPotion());
		
		
		
		
		
	}
}


