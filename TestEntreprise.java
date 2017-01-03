package entreprise;

public class TestEntreprise {

	public static void main(String[] args) {
		
		Cadre C1 = new Cadre("Amadou","Ibrahim","Directeur",3000F,0.2F,"Doctorat",200,300,250);
		Cadre C2 = new Cadre("Ahmed","Trad","Ingenieur",1500F,0.2F,"Bac",200,300,250);
		
		Ouvrier O1 = new Ouvrier("Mohamed","Dhhieb","Ouvrier",500F,0.2F,10,50);
		Ouvrier O2 = new Ouvrier("Raj","Fakh","Ouvrier",500F,0.2F,8,50);
		
		Entreprise E = new Entreprise("STEG","Societe Tunisien de l'Electricite et de Gaz");
		E.ajouter(C1);
		E.ajouter(C2);
		E.ajouter(O1);
		E.ajouter(O2);
		E.afficher();
		
		
		System.out.println("Le salaire Brute de Amadou est :"+C1.getSalaireBrute());
		System.out.println("Le salaire Net de Amadou est :"+C1.getSalaireNet());

	}

}
