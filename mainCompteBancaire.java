package ex2;

import java.util.Scanner;

public class mainCompteBancaire {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);

        CompteBancaire compt1 = new CompteBancaire();

        System.out.print("donner numero de compt: "); 
        compt1.set_numeroCompte(scanner.nextLine());

        System.out.print("donner titulaire de compt: "); 
        compt1.set_titulaire(scanner.nextLine());

        System.out.print("donner solde de compt: "); 
        compt1.set_solde(scanner.nextDouble());


            int i;
            System.out.println("quelle service vous besoin de faire :");
            System.out.println("taper 1 : voir le solde ");
            System.out.println("taper 2 : retirer le solde ");
            System.out.println("taper 3 : deposer le solde ");
            System.out.println("taper 4 : voir les info de solde ");

            i=scanner.nextInt();
            if      (i==1)    System.out.print("votre solde : "+ compt1.consulteSolde());
            else if (i==2) {  System.out.print("monton retrai : ");compt1.retirer(scanner.nextDouble());}
            else if (i==3) {  System.out.print("monton deposer : ");compt1.deposer(scanner.nextDouble());}
            else if (i==4) {  System.out.print("info compt : "+compt1.toString());}

            
            
        scanner.close();
    }
}
