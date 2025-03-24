package animalerie;
import java.utils.IOException;


public  class Zoo implements IZoo{
     private Animal [] Animal;

     public void ajouterAnimal(Animal a, int i) throws IOException {
        if(i < 10 || i > 20){
            throw new IOException ("Nombre invalid");
        }
        this.Animal[i] = a;
     };
     public Animal getAnimal(int i){
        return Animal[i];
     };
     public void supprimerAnimal(int i){
        Animal[i] = null;
     };
     public void faireCrier(){
        for (int i = 0; i < Animal.length ; i++){
            Animal[i].crier();
        }
     };
     public String toString(){};
}
