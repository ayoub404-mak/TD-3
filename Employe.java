

class Employe{

    private String nom ;
    private String poste;
    private int salaire;
    // can i divise this code into 2 files and what is diffrents 

    public Employe ( String nom,String poste,int salaire){

        Set_nom(nom);
        Set_poste(poste);
        Set_salaire(salaire);
    }


   public void Set_nom(String nom){
    if (nom.equals(null))
    System.out.println("invalide inpute");
    else 
    this.nom=nom;
    }

   public void Set_poste( String poste){
    

    this.poste=(poste.equals(null)) ? "Non défini":poste;
   }

   public void Set_salaire(int salaire){
    if  (salaire>2500)
    this.salaire= salaire;
    else {
    System.out.println("invalide inpute ");}
   }
    
   public String get_nom(){
    return nom;
   }
   public String get_poste(){
    return poste;
   }
   public int get_salaire(){
    return salaire;
   }
   public void afficherInfos(){
    System.out.println(
        "Nom: "+get_nom()+
        "|Poste: "+get_poste()+
        "|Salaire: "+get_salaire()+
        "DH"
    );

   }
}