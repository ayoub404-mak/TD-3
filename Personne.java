class Personne{
 private String nom;
 private int age ;
 private String ville;

 Personne(String nom,int age,String ville){
    this.nom=nom;
    this.age=age;
    this.ville=ville;
 }

 Personne(Personne pi3)
    {nom=pi3.nom;
    age=pi3.age;
    ville=pi3.ville;
    }
    public String toString(){ 
        return "nom :"+nom+"|age :"+age+"|ville :"+ville;

        
    }
    public boolean equals(Personne p){
        if ( p.nom.equals(nom) && p.ville.equals(ville))
         return true;
        else return false;
    }
}