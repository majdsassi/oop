public class TestPile {
    public static void main(String[] args) {

        Pile pile = new Pile(10);

        pile.empile(5);
        pile.empile(12);
        pile.empile(8);
        pile.affiche();

        pile.depile();
        pile.affiche();

        for (int i = 0; i < 5; i++) {
            pile.depile();
        }
    }
}