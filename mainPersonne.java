public class mainPersonne {
    public static void main(String[] args)
    {
    Personne p1=new Personne("omar", 23, "casa");
    Personne p2=new Personne(p1);
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    Personne p3 = new Personne("Halima", 23, "Settat");
    Personne p4 = new Personne("Halima", 3, "Settat");
    System.out.println(p3.equals(p4)); // true
    }
    
}
