package animalerie;

/**
 * Interface IZoo devant être implémentée par la classe Zoo
 * @author Cyril Rabat
 * @version 03/02/2019
 */
public interface IZoo {

    /**
     * Ajoute un animal dans une cage du zoo
     * @param a l'animal a ajouter
     * @param i le numero de la cage
     */
    public void ajouterAnimal(Animal a, int i);

    /**
     * Récupère un animal dans une des cages du zoo
     * @param i le numero de la cage
     * @return l'animal present dans la cage
     */
    public Animal getAnimal(int i);

    /**
     * Supprime l'animal situé dans une cage
     * @param i le numero de la cage
     */
    public void supprimerAnimal(int i);

    /**
     * Fait crier tous les animaux du zoo
     */
    public void faireCrier();

    /**
     * Convertit tout le zoo en chaine de caractères
     * @return une chaine de caracteres
     */
    public String toString();

}
