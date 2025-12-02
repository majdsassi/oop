import java.util.Arrays;

public class TablePile implements Pile {

    private Object[] table;
    private int sommet;

    public TablePile(int capacite) {
        table = new Object[capacite];
        sommet = -1;
    }


    public void Empiler(Object o) {
        if (sommet == table.length - 1) {

            table = Arrays.copyOf(table, table.length * 2);
        }
        table[++sommet] = o;
    }


    public void Depiler() {
        if (!Vide()) {
            table[sommet] = null;
            sommet--;
        }
    }


    public Object Entete() {
        if (!Vide())
            return table[sommet];
        return null;
    }


    public boolean Vide() {
        return sommet == -1;
    }
}
