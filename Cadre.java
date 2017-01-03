package entreprise;

public class Cadre extends Salaire {
	
	private String diplome;
	private float prime;
	private float primeDeplacement;
	private float primeEnfant;
	
	
	public Cadre(String n,String p,String e,float sb,float ti,String d,float pr,float prD,float prE){
		super(n,p,e,sb,ti);
		this.diplome = d;
		this.prime = pr;
		this.primeDeplacement = prD;
		this.primeEnfant = prE;
	}
	
	public void afficher(){
		super.afficher();
		System.out.println("Diplome :"+diplome+"\n Prime : "+prime+"\n Prime deplacement : "+primeDeplacement+"\n Prime Enfant :"+primeEnfant);
	}
	
	public float getSalaireBrute(){
		float salaireBrute = salaireBase + (prime+primeDeplacement+primeEnfant);
		return salaireBrute;
	}
	
	public float getSalaireNet(){
		float impot = getSalaireBrute() * tauxImpot;
		float salaireNet = getSalaireBrute()-impot;
		return salaireNet;
	}
}
