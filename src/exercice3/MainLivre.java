package exercice3;

public class MainLivre {

	public static void main(String[] args) {
		Livre[] table = new Livre[3];
		
		table[0] = new Livre("L\'alchimiste","Coelho",225);
		table[1] = new Livre("La Tunisie","",508);
		table[2] = new Livre("Harry Potter","JK Rowling");
		
		for(int i = 0 ; i< 3; i++)
		{
			System.out.println("titre : "+table[i].getTitre());
			System.out.println("Auteur : "+table[i].getAuteur());
			System.out.println("nombre de page : "+table[i].getNbPages());
			
			System.out.println("\n");
			
		}
		table[1].setAuteur("Paulo Coelho");
		table[2].setNbPages(461);
		for(int i = 0 ; i< 3; i++)
		{
			table[i].decrire();
		}
		
	}

}
