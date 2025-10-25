public class TableauTrie {
    private int[] tableau;
    private int taille;

    public TableauTrie(int capacite) {
        tableau = new int[capacite];
        taille = 0;
    }

    public TableauTrie() {
        this(10);
    }

    public void inserer(int entier) {
        if (taille == tableau.length) {
            System.out.println("Tableau plein, impossible d'insérer " + entier);
            return;
        }

        int i = taille - 1;

        while (i >= 0 && tableau[i] > entier) {
            tableau[i + 1] = tableau[i];
            i--;
        }

        tableau[i + 1] = entier;
        taille++;
    }

    public void retirer(int entier) {
        int index = -1;
        for (int i = 0; i < taille; i++) {
            if (tableau[i] == entier) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("L'entier " + entier + " n'existe pas dans le tableau.");
            return;
        }

        for (int i = index; i < taille - 1; i++) {
            tableau[i] = tableau[i + 1];
        }

        taille--;
    }

    public void afficher() {
        System.out.println("Ceci est un nouveau affichage :");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();
    }
}