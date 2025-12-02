import java.util.ArrayList;

public class ListePile implements Pile {

    private ArrayList<Object> liste;

    public ListePile() {
        liste = new ArrayList<>();
    }


    public void Empiler(Object o) {
        liste.add(o);
    }


    public void Depiler() {
        if (!Vide()) {
            liste.remove(liste.size() - 1);
        }
    }


    public Object Entete() {
        if (!Vide())
            return liste.get(liste.size() - 1);
        return null;
    }
    public boolean Vide() {
        return liste.isEmpty();
    }
}
