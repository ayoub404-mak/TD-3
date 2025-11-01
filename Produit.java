public class Produit {
    private String nom;
    private double prix;
    private double  quantite;
//CONSTRIVTURS

    Produit() {

    }
    Produit(String nom ,double prix){
        set_nom(nom);
        set_prix(prix);
    }
    //there is also the possibilite of reference th econstructure to him self 
    Produit(String nom,double prix,double quantite){
        set_nom(nom);
        set_prix(prix);
        set_quantite(quantite);
    }
//SETTERS

    public void set_nom(String nom){
        this.nom=nom;
    }
    public void set_prix(double prix){
        this.prix=prix;
    }
    public void set_quantite(double quantite){
        this.quantite=quantite;
    }

//GETTERS

    public String get_nom(){
        return nom;
    }
    public double get_prix (){
        return prix;
    }
    public double get_quantite(){
        return quantite;
    }

//METHODES

    public double valeurStock(){
        return prix*quantite;
    }

    public String toSting(){
        return "Nom : "+nom+" | prix : "+prix+" | quantite : "+quantite +"| valeur Stock : "+ valeurStock();
    }

    
}
