public class PileTab {
    private int[] t;
    private int sommet;
    private int tailleMax;

    public PileTab(int taille) {
        tailleMax = taille;
        t = new int[tailleMax];
        sommet = -1;
    }


    public void empiler(int val) {
        if (sommet < tailleMax - 1) {
            sommet++;
            t[sommet] = val;
        } else {
            System.out.println("Pile pleine !");
        }
    }

    public int depiler() {
        if (!estVide()) {
            int val = t[sommet];
            sommet--;
            return val;
        } else {
            System.out.println("Pile vide !");
            return -1;
        }
    }

    public int sommet() {
        if (!estVide()) {
            return t[sommet];
        } else {
            System.out.println("Pile vide !");
            return -1;
        }
    }

    public boolean estVide() {
        return sommet == -1;
    }
}
