public class TacheElemntaire implements Tache , Comparable<Tache> {
    private String nom ;
    private int cout ;
    public TacheElemntaire( String nom , int cout){
        this.cout = cout ;
        this.nom = nom ;

    }

    public String getNom() {
        return this.nom;
    }
    //


    public int getCout() {
        return this.cout;
    }

    public int compareTo(Tache o ) {
        return this.cout - o.getCout() ;
    }


    public String toString() {
        return "Le nom de la Tache est : " +this.nom+ " Ca coute : " +this.cout+"\n";
    }
}
