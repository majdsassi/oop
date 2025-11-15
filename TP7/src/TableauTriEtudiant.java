class TableauTriEtudiant extends  TableauTrie{
    public TableauTriEtudiant(int taille) {
        super(taille);
    }
    public void insert(Etudiant x) {
        insert((Object) x);
    }
    public boolean plusGrand(Object x, Object y) {
        return ((Etudiant)x).getAge()  >  ((Etudiant) y).getAge() ;
    }

}
