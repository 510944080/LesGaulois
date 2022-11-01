package zhayang;



public enum Equipement {
	CASQUE("casque"),BOUCLIER("bouclier");//Í·¿ø£¬¶ÜÅÆ
	
	private String nom;
	private Equipement(String nom) {
		this.nom=nom;
	}
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom=nom;
		
	}
	
	public String toString() {
		return "nom d'Equipement "+CASQUE.getNom();
		
	}
}
