package zhayang;



/**
 * @author HP
 *
 */

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement=new Equipement[2];
	private int nbEquipement = 0;
	
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
	public int getNbEquipement(){
		return nbEquipement;
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
	
	
	public void sEquiper(Equipement equipement, int nbEquipement) {
		
		
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat "+ nom +" est déjà bien protégé ! " );
			break;
		
		case 1:
			if (this.equipement[0]==equipement) {
				System.out.println("Le soldat "+ nom +"  possède déjà "+equipement.getNom());
			}
			else {
				this.equipement[1]=equipement;
				this.nbEquipement=nbEquipement+1;
				System.out.println("Le soldat "+nom+" s’équipe avec un "+equipement.getNom());
				System.out.println("Le soldat "+ nom +" est déjà bien protégé ! " );
			}
			break;
		default:
			this.equipement[0]=equipement;
		 	this.nbEquipement=nbEquipement+1;
		 	System.out.println("Le soldat "+nom+" s’équipe avec un "+equipement.getNom());
		 	break;
			
		
		}
		
	}
	
	
	

	

	
	public static void main(String[] args) {
		//creat a romain 
		Romain romain=new Romain("Minus", 6);
		//test for methodes
		//System.out.println(minus.prendreParole());
		romain.parler("un gau un gaugau");
		romain.recevoirCoup(8);
		//System.out.println(Equipement.CASQUE);
		//romain.sEquiper(Equipement.CASQUE,romain.getNbEquipement());System.out.println(Equipement.BOUCLIER);
		
		// test
		romain.sEquiper(Equipement.CASQUE,romain.getNbEquipement());
		romain.sEquiper(Equipement.CASQUE,romain.getNbEquipement());
		romain.sEquiper(Equipement.BOUCLIER,romain.getNbEquipement());
		
		
	}
}



