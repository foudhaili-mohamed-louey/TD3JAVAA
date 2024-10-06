package exercice4;
public class mainLivre {

	public static void main(String[] args) {
		Livre[] table = new Livre[5];
		
		table[0] = new Livre("L\'alchimiste","Coelho",225);
		table[1] = new Livre("La Tunisie","",508);
		table[2] = new Livre("Harry Potter","JK Rowling");
		table[3] = new Livre("Le Petit Prince","Antoine",96,10.2f);
		table[4] = new Livre("etranger","Albert Camus",185);
		for(int i = 0 ; i< 5; i++)
		{
			System.out.println("titre : "+table[i].getTitre());
			System.out.println("Auteur : "+table[i].getAuteur());
			System.out.println("nombre de page : "+table[i].getNbPages());
			
			System.out.println("\n");
			
		}
		table[1].setAuteur("Paulo Coelho");
		table[2].setNbPages(461);
		for(int i = 0 ; i< 5; i++)
		{
			table[i].decrire();
		}
		System.out.println("\n\n");
		table[0].setPrix(7.2f);
		for(int i = 0 ; i< 5; i++)
		{
			table[i].decrire();
		}
		System.out.println("\n\n");
		table[0].setPrix(7.7f);
		
	}

}
