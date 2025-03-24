package animalerie;

public class Animal implements IAnimal{
    private Nom nom;
    private int NbPattes;

    public  Animal(Nom nom , int nbPattes){
        this.nom = nom ;
        this.nbPattes = nbPattes;
    };

    public Animal ()  {
        nom = "Milou";
        nbPattes = 4;
    };
    public Nom getNom () {
        return this.nom;
    };
    public int getNbPattes (){
        return this.nbPattes;
    };

    public void setNom (Nom nom){
        this.nom = nom;
    };

    public void crier(){
        System.out.println("hmmm hmmm");
    };

    public String toString (){
        return  nom +  " " + nbPattes + " pattes ";
    }

};
