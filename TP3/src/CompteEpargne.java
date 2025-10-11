public class CompteEpargne extends CompteBancaire {
    private double taux ;
    public  CompteEpargne(int nc , float solde , double taux ) {
        super(nc,solde);
        this.taux = taux ;
    }
    public String toString(){
        return super.toString()+" Taux d'intérêt "+taux+"%" ;
    }
}
