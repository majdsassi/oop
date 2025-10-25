public class Main { //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public static void main (String[] args) {
    ParcoursTableau t1 = new ParcoursTableau(5);
    t1.remplir();
    t1.affiche();
    System.out.println("Max : "+t1.Max());
    System.out.println("Min : "+t1.Min());
    System.out.println("Somme : "+t1.somme());
    System.out.println("Moyenne :"+t1.moyenne());
    System.out.println(t1.recherche(56));

}
}
