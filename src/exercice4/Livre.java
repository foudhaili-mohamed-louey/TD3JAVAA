package exercice4;

public class Livre {
	private String titre;
	private String auteur;
	private int nbPages;
	private float prix = 0;
	private boolean prixFixe = false;
	

public Livre(String auteur , String titre) {
		this.auteur = auteur;
		this.titre = titre;
	}
public Livre() {
		this.nbPages = 0;
	}

public Livre(String ch, int x) {
		this.titre = ch;
		this.nbPages = x;
	}

public Livre(String ch1, String ch2, int x) 
	{
		this.auteur = ch1;
		this.titre = ch2;
		this.nbPages = x;
	}
public Livre(String ch1, String ch2, int x, float y)
{
	this.titre = ch1;
	this.auteur = ch2;
	this.nbPages = x;
	setPrix(y);
}
public String getAuteur() 
	{
		return auteur;
	}
public String getTitre() {
		return titre;
	}
	
public int getNbPages() {
		return nbPages;
	}
	
	
public void setNbPages(int nb) {
		if(nb > 20) {
			nbPages = nb;
		} else {
			System.out.println("Le nombre de pages indiqué est trop faible !!!");
		}
	}
public void setAuteur(String ch) {
		this.auteur = ch;
	}
public void setTitre(String ch) {
		this.titre = ch;
	}
public String toString() {
		return "Livre " + this.titre + " de " + this.auteur + ", contenant " + this.nbPages + " pages et le prix = "+ this.prix;
	}

public void decrire() {
		System.out.println(this.toString());
	}
public double getPrix() {
		return this.prix;
	}
public void setPrix(float x) {
		if(this.prixFixe == false) {
			this.prix = x;
			this.prixFixe = true;
		} else {
			System.out.println("Erreur : le prix ne peut être fixé qu'une seule fois !!!");
		}
	}
public boolean testPrix() {
		return this.prixFixe;
	}
}
