class TableauTriEntier extends TableauTrie
{
    public TableauTriEntier(int taille) {
        super(taille);
    }
    public void insert(int x) {
        insert(Integer.valueOf(x));
    }
    public boolean plusGrand(Object x, Object y) {
        return (Integer) x > (Integer) y;
    }
}
