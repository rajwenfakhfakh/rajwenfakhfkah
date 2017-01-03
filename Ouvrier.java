package entreprise;

public class Ouvrier extends Salaire {
	
	private int nbHeureSupp;
	private float prixHeureSupp;

	
	
	public void afficher(){
		super.afficher();
		System.out.println("Nombre Heure Spplementaire :"+nbHeureSupp);
	}
	
	public float getSalaireBrute(){
		float salaireBrute;
		salaireBrute = getSalaireBase()+(nbHeureSupp*prixHeureSupp);
		return salaireBrute;
	}
	public float getSalaireNet(){
		float impot = getSalaireBrute() * tauxImpot;
		float salaireNet = getSalaireBrute()-impot;
		return salaireNet;
	}
	

}
