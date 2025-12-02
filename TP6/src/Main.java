import java.util.Vector;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    PileVector pile = new PileVector();

    System.out.println("emplier elements: A, B, C");
    pile.empiler("A");
    pile.empiler("B");
    pile.empiler("C");

    System.out.println("les tete element (entente): " + pile.entente());


    System.out.println("Depilation : " + pile.depiler());
    System.out.println("New Tete : " + pile.entente());


    System.out.println("est vide ? " + pile.estVide());

    System.out.println("\ntest Empliation (PileVector)");
    PileVector p2 = new PileVector();
    p2.empiler(1);
    p2.empiler(2);
    p2.empiler(3);

    System.out.println("ajouter les elements de pile 2 dans pile 1 ...");
    pile.empiler(p2);

    while (!pile.estVide()) {
        System.out.println("-> " + pile.depiler());
    }

    System.out.println("Is empty now? " + pile.estVide());
}

