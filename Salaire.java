package entreprise;

public abstract class Salaire implements Calculs {
	
	private String nom;
	private String prenom;
	private String echelon;
	protected float salaireBase;
	protected float tauxImpot;
	
	public Salaire(String n,String p,String e,float sb,float ti){
		this.nom = n;
		this.prenom = p;
		this.echelon = e;
		this.salaireBase = sb;
		this.tauxImpot = ti;
	}
	
	public float getTauxImpot() {
		return tauxImpot;
	}

	public void setTauxImpot(float tauxImpot) {
		this.tauxImpot = tauxImpot;
	}

	public void setSalaireBase(float salaireBase) {
		this.salaireBase = salaireBase;
	}

	public void afficher(){
		System.out.println("Nom :"+nom+"\n Prenom : "+prenom+"\n Echelon "+echelon+"\n Salaire de base : "+salaireBase);
	}
	
	public float getSalaireBase(){
		return salaireBase;
	}

}
