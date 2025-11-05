import java.util.Vector;

public class PileVector {
    Vector v ;
    public PileVector() {
        this.v = new Vector() ;
    }
    public void empiler( Object o ) {
        v.addElement(o);
    }
    public Object depiler(){
        Object temp = v.lastElement() ;
        v.removeElement(temp);
        return temp ;
    }
    public Object entente() {
        return v.firstElement() ;
    }
    public boolean estVide() {
        return v.isEmpty() ? true : false ;
    }
    public void empiler(PileVector p ) {
       while (!p.estVide()){
           this.empiler(p.depiler());
       }
    }
}
