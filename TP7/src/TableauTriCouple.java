public class TableauTriCouple extends TableauTrie{
    public TableauTriCouple(int taille) {
        super(taille);
    }
    public void insert(Couple x) {
        insert((Object) x);
    }

    public boolean plusGrand(Object x, Object y) {
        boolean conX = ((Couple)x).x == ((Couple) y).x ? false : ((Couple)x).x > ((Couple) y).x ? true : false ;
        boolean conY = ((Couple)x).y > ((Couple) y).y ? true : false ;
        return  conX ? true : conY ;
    }
}
