import java.util.Scanner;

public class mainVoiture {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        Voiture voitr1 =new Voiture();

        System.out.print("vous accelerer a: ");
        voitr1.accelerer(scanner.nextDouble());
        System.out.print("vous ralentir a : ");
        voitr1.ralentir(scanner.nextDouble());
        System.out.println(voitr1.afficherEtat());
        scanner.close();
    }
}
