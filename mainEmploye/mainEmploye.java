import java.util.*;

public class mainEmploye {    
public static void main (String [] args){
    Scanner scanner = new  Scanner(System.in);
    System.out.print("donner un nom : ");
    String nom = scanner.nextLine();
    System.out.print("donner un poste : ");
    String poste =  scanner.nextLine();
    System.out.print("donner un salaire : ");
    int salaire =  scanner.nextInt();

    Employe e1 = new Employe(nom,poste,salaire);
    e1.afficherInfos();
        Employe e2 = new Employe();

    scanner.close();


}
}
