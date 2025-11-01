package ex2;

public class CompteBancaire {
        private String numeroCompte ;
        private String titulaire;
        private double solde ;
//---------------------------------------------CONSTRACTEURS
        public CompteBancaire(){
 
        }
//-------------------------------------------------METHODES
        public void deposer (double montant){
            if( montant>0)// you forget to 
            solde=solde+montant;

        }

        public void retirer (double montant){
            if(solde >=montant) solde=solde-montant;
            else System.out.println("votre solde est insuffisant");

        }

        public double consulteSolde(){
            return solde;

        }

        // ---------------------------------------------------SETTERS 
        public  void set_numeroCompte(String numeroCompte){
            this.numeroCompte=numeroCompte;
        }
        public void set_titulaire(String titulaire){
            this.titulaire=titulaire;
        }
        public void set_solde(double solde){
            
            this.solde=solde;
        }
        //--------------------------------------------------GETTERS 
        public String get_numeroCompte(){
            return numeroCompte;
        }
        public String get_titulaire(){
            return titulaire;
        }
        //--------------------------------------------------TO STRING

        public String toString(){

            return "Nom : "+titulaire+" | numeroCompte : "+numeroCompte+" | Solde : "+solde+" DH";
        }
    
}