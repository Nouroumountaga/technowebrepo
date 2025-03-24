/**
 * Classe <b>Toutou</b>
 * Cette classe permet de repr&eacute;senter un chien qui est caract&eacute;ris&eacute; uniquement par son nom, sa robe et son nombre de puce.
 * @see Robe
 * @author Jessica Jonquet
 * @version 13/03/2025
 */
public class Toutou {
	
	/**
	 * Le nom du chien
	 */
	private String nom;

	/**
	 * La robe du chien
	 * @see Robe
	 */
	private Robe robe;

	/**
	 * Le nombre de puces du chien
	 */
	private int nbPuces;

	/**
	 * Constructeur par défaut de la classe <b>Toutou</b>.
	 */
	public Toutou(){
		nom = "SnoopyX";
		robe = Robe.BLANCHE;
		nbPuces = 0;
	}

	/**
	 * Constructeur par initialisation de la classe <b>Toutou</b>.
	 * @param n le nom du chien
	 * @param r la robe du chien
	 * @param nb le nombre de puce du chien (positif)
	 * @see Robe
	 */
	public Toutou (String n, Robe r, int nb){
		nom = n;
		if(nb>0)
			nbPuces = nb;
		robe = r;
	}

	/**
      * Retourne le nom du chien
      * @return le nom du chien
      */
	public String getNom(){return nom;}

	/**
      * Retourne le nombre de puces du chien
      * @return le nombre de puces du chien
      */
	public int getNbPuces(){return nbPuces;}

	/**
      * Retourne la robe du chien
      * @see Robe
      * @return la robe du chien
      */
	public Robe getRobe(){return robe;}

	/**
	 * Modifie le nombre de puces du chien.
	 * @param nb le nombre de puce (positif)
	 */
	public void setNbPuces(int nb) {
		if (nb > 0)
			nbPuces = nb;
	}

	/**
	 * M&eacute;thode toString pour la classe <b>Toutou</b>.
	 * @return une chaîne de caractères représentant le chien
	 */
	public String toString() {
		return nom + " de robe "+ robe +" a " + nbPuces + " puce(s).";
	}

	/**
	 * M&eacute;thode egalA pour la classe <b>Toutou</b> pour comparer deux chiens.
	 * Ils sont &eacute;gaux si tous leurs attributs sont &eacute;gaux.
	 * @param t le chien &egrave; comparer
	 * @return si les chiens sont &eacute;gaux
	 */
	public boolean egalA(Toutou t){
		return nom.equals(t.nom) && robe == t.robe && nbPuces == t.nbPuces;
	}
}