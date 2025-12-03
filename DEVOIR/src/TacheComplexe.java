import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TacheComplexe implements Tache , Comparable   {
    private  ArrayList<Tache> tabTache = new ArrayList<Tache>() ;
    private String nom ;
    public TacheComplexe(String nom ) {
        this.nom = nom ;
    }

    public void ajout(Tache t) throws TacheNullException {
        if(t == null) {
            throw new TacheNullException("interdit d'ajouter un null") ;
        }
        tabTache.add(t) ;
    }
    public void supprimer(Tache t ) throws TacheNullException {
        if (tabTache.indexOf(t) == -1) {
            throw new TacheNullException("Element not Found ") ;
        }
        tabTache.remove(t) ;
    }
    public int getCout(){
        int s = 0 ;
        for(Tache  t : tabTache) {
            s = s + t.getCout() ;
        }
        return s ;
    }


    public String getNom() {
        return nom;
    }

    public int compareTo(Object o) {
        return 0;
    }

    public void tri(){
        Object[] temp = new Object[tabTache.size()] ;
        temp = tabTache.toArray() ;
        Arrays.sort(temp);
        tabTache.clear();
        for(Object  t : temp) {
            tabTache.add((Tache) t) ;
        }

    }

    public String toString() {
        String Res = "" ;
        for(Tache  t : tabTache) {
            Res = Res + t.toString() ;
        }

        return Res;
    }
}
