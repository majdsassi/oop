public class EssaiTableauTrie {
    public static void main(String[] args) {

        TableauTrie tab = new TableauTrie(10);

        tab.inserer(1);
        tab.inserer(3);
        tab.inserer(4);

        tab.afficher();

        tab.inserer(2);

        tab.afficher();

        tab.inserer(0);

        tab.afficher();

        tab.inserer(1);

        tab.afficher();

        tab.retirer(1);

        tab.afficher();

        tab.retirer(0);

        tab.afficher();

        tab.retirer(4);

        tab.afficher();
    }
}