package entreprise;
import java.util.*;

public class Entreprise {
	
	private String raisonSociale;
	private String raisonCommerciale;
	public static int NB_MAX_SALAIRIES = 100;
	private Vector<Salaire> list_Salaire;


	public Entreprise(String rS,String rC){
		this.raisonSociale = rS;
		this.raisonCommerciale = rC;
		list_Salaire = new Vector<Salaire>(NB_MAX_SALAIRIES);
	}
	
	public void afficher(){
		System.out.println("Raison Sociale : "+raisonSociale+"\t Raison Commerciale : "+raisonCommerciale);
		for(int i=0;i<list_Salaire.size();i++){
			Salaire S = list_Salaire.elementAt(i);
			S.afficher();
		}
			
	}
	
	public void ajouter(Salaire S){
		if(list_Salaire.size() < NB_MAX_SALAIRIES)
			list_Salaire.add(S);
	}
	public int rechercher(Salaire S){
		boolean b = false;
		int i = 0;
		while(i<list_Salaire.size() && !b){
			if(list_Salaire.elementAt(i) == S)
				b = true;
			else
				i++;
		}
		if(b)
			return i;
		else
			return -1;
	}
	public void supprimer(Salaire S){
		boolean b = false;
		int i = 0;
		while(i<list_Salaire.size() && !b){
			Salaire s1 = list_Salaire.elementAt(i);
			if(S == s1){
				list_Salaire.removeElement(S);
				NB_MAX_SALAIRIES --;
				b = true;
			}
			else
				i++;
		}
		if(b)
			System.out.println("Cadre Supprimer avec succes");
		else
			System.out.println("Cadre non trouver Suppression impossible");
	}
	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getRaisonCommerciale() {
		return raisonCommerciale;
	}

	public void setRaisonCommerciale(String raisonCommerciale) {
		this.raisonCommerciale = raisonCommerciale;
	}

	public void supprimerTout(){
		list_Salaire.removeAllElements();
	}
	
	public float getSommeSalaireBrut(){
		int i=0;
		float som = 0;
		while(i<list_Salaire.size()){
			// ou on recupere lobjet dans un new variable apres faire la sommation.
			som+=list_Salaire.elementAt(i).getSalaireBrute();
		}
		return som;
	}
	public float getSommeSalaireNet(){
		int i=0;
		float som = 0;
		while(i<list_Salaire.size()){
			som+=list_Salaire.elementAt(i).getSalaireNet();
		}
		return som;
	}

}
