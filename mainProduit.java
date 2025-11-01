
import java.util.Scanner;
public class mainProduit {
    public static void main (String [] args)
    {
        Scanner scanner =new Scanner(System.in);

        Produit prod1 =new Produit();

        System.out.print("donner nom produit: ");
        prod1.set_nom(scanner.nextLine());
        System.out.print("donner prix  produit: ");
        prod1.set_prix(scanner.nextDouble());
        System.out.print("donner quantite produit: ");
        prod1.set_quantite(scanner.nextDouble());

        System.out.print("les info produit: "+ prod1.toSting());
        
        scanner.close();
    }

}
