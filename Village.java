package zhayang;

public class Village {
	//les attibuts
	private String nom;
	private Chef chef;
	private Gaulois[] villageois = {};
	private int nbVillageois = 0;
	
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois=new Gaulois[nbVillageoisMaximum];
		this.nbVillageois=nbVillageoisMaximum;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois,int place,int nbVillageois) {
		if (place>nbVillageois) {
			System.err.println("n'a pas assez de villageois");
		}
		villageois[place-1]=gaulois;
		
	}
	public Gaulois trouverHabitant(int num) {
		return villageois[num-1];
		
	}
	public void afficherVillageois(Chef chef,Gaulois villageois[]) {
		
		System.out.println("Dans village du chef "+chef.getNom()+" vivent les legendaires gaulois:\n" );
		for (int i = 0; i < this.villageois.length; i++) {
			System.out.println("- "+(villageois[i].getNom())+" \n");
			
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// 1 : creat a village 
		Village village=new Village("Village des Irr¨¦ductibles", 30);
		
		//village.ajouterHabitant(new Gaulois("a", 1), 30 , 30);
		
		//on n'a pas ajoute les habitants
		//Gaulois gaulois = village.trouverHabitant(30);
		//System.out.println(gaulois);
		
		
		Chef chef = new Chef("Abraracourcix", 6 , village);
		Gaulois gaulois = new Gaulois("Ast¨¦rix", 8);
		Gaulois gaulois2 = new Gaulois("Obelix", 25);
		village.ajouterHabitant(gaulois, 1 , 30);
		village.ajouterHabitant(gaulois2, 2, 30);
		
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//Sortie : NULL
		//POURQUOI:  On n'ajoute rien dans le tableau villageois,du coup il y a pas de gaulois dans le village
		
		village.afficherVillageois(chef,village.villageois);
		
		
		
		

	
	
	}
	
	
	
}
   