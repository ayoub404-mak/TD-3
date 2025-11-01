public class Voiture {

    private String marque;
    private int modele; 
    private double vitesseActuelle;
    private double vitesseMax;

    Voiture (){
        marque="toyota";
        modele=1998;
        vitesseMax=100;
        vitesseActuelle=0;
    }
    // BADE VERY BADE STRUCTURE OF CODE 
    public void accelerer(double v){
        if(v<=vitesseMax) vitesseActuelle=v;
        else  System.out.println("tu passer la limite de vitesse");
    }
    public void ralentir(double v){
        if(v>0) vitesseActuelle=v;
        else    System.out.println("invalide inpute");
    }
    public String afficherEtat(){
        return "marque : "+marque+" | modele : "+modele+" | vitesse Actuelle : "+vitesseActuelle+" Km";
    }

}