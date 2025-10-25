public class ParcoursTableau {
    private int[] tab ;
    public ParcoursTableau(int n ) {
        tab = new int[n] ;
    }
    public void remplir() {
        for(int i = 0 ; i<tab.length ; i++) {
            tab[i] = (int) (Math.random() * 100);
        }
    }
    public int somme(){
        int s = 0 ;
        for(int i = 0 ; i<tab.length ; i++) {
            s+=tab[i] ;
        }
        return s ;
    }
    public float moyenne() {
        return this.somme() / tab.length ;
    }
    public int Min() {
        int min = tab[0] ;
        for(int i = 1 ; i<tab.length; i++) {
            if( tab[i] < min) {
                min = tab[i] ;
            }
        }
        return min ;
    }
    public int Max() {
        int max = tab[0] ;
        for(int i = 1 ; i<tab.length; i++) {
            if( tab[i] >  max) {
                max = tab[i] ;
            }
        }
        return max ;
    }
    public int recherche(int x ) {
        int i = 0 ;
        while (i < tab.length && tab[i] != x) {
            i++ ;
        }
        return x == tab[i-1] ? i : -1 ;
    }
    public void affiche(){
        for (int nombre : tab ) {
            System.out.println(nombre);
        }
    }


}
