//implements IDistributeur;
class DistributeurCafe  implements IDistributeur{
   private  double prixCafeCourt;
   private  double prixCafeLong;

   private  double VCafeCourt;
   private  double VCafeLong;

   private  int cpDosettes;
   private int nbDosettes;

   private  int cpReservoir;
   private double vReservoir;

   private int sommeArgent;

   public  DistributeurCafe(double prixCafeCourt,double prixCafeLong,double VCafeCourt , double VCafeLong, int cpDosettes,int nbDosettes , int cpReservoir , int sommeArgent , double vReservoir){
    this.VCafeCourt = VCafeCourt;
    this.VCafeLong = VCafeLong;

    this.cpDosettes = cpDosettes;
    this.nbDosettes = nbDosettes;

    this.cpReservoir = cpReservoir;
    this.vReservoir = vReservoir;

    this.prixCafeCourt = prixCafeCourt;
    this.prixCafeLong = prixCafeLong;

    this.sommeArgent = sommeArgent;

   }

   public DistributeurCafe(){
    this.VCafeCourt = 10;
    this.VCafeLong = 25;

    this.cpDosettes = 0;
    this.nbDosettes = 10;

    this.cpReservoir = 2;
    this.vReservoir = 0;

    this.prixCafeCourt = 0.5;
    this.prixCafeLong = 0.7;

    this.sommeArgent = 0;
   }

   public  double getVCafeLong(){
    return this.getVCafeLong();
   }
   public double getVCafeCourt(){
    return this.VCafeCourt;
   }
   public double getPrixCafeCourt(){
    return prixCafeCourt;
   }
   public double getPrixCafeLong(){
    return prixCafeLong;
   }
   public int getSomme(){
    return sommeArgent;
   }
   public int getnNbDosettes(){
    return nbDosettes;
   }
   public int getCpDosettes(){
    return this.cpDosettes;
   }

   public double getVReservoir(){
    return vReservoir;
   }

   public int cpReservoir (){
    return cpReservoir;
   }

   public double boireCafeCourt(double somme){
    sommeArgent+=prixCafeCourt;
    return  somme - prixCafeCourt;
   }

   public double boireCafeLong(double somme){
    sommeArgent+=prixCafeLong;
    return  somme - prixCafeLong;
   }

}