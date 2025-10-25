public class Pile {
    private int[] elements;
    private int sommet;

    public Pile(int taille) {
        elements = new int[taille];
        sommet = -1;
    }

    public void empile(int e) {
        if (pilePleine()) {
            System.out.println("La pile est pleine !");
        } else {
            sommet++;
            elements[sommet] = e;
            System.out.println(e + " empilé dans la pile.");
        }
    }

    public void depile() {
        if (pileVide()) {
            System.out.println("La pile est vide !");
        } else {
            System.out.println(elements[sommet] + " dépilé de la pile.");
            sommet--;
        }
    }

    public void affiche() {
        if (pileVide()) {
            System.out.println("La pile est vide !");
        } else {
            System.out.print("Contenu de la pile : ");
            for (int i = 0; i <= sommet; i++) {
                System.out.print(elements[i] + " ");
            }
            System.out.println();
        }
    }

    private boolean pilePleine() {
        return sommet == elements.length - 1;
    }

    private boolean pileVide() {
        return sommet == -1;
    }
}