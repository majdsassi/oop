public class CompteBancaire
{
    protected int nc ;
    protected  float solde ;
    public  CompteBancaire(int nc , float solde ) {
        this.nc = nc ;
        this.solde = solde ;
    }
    public String toString(){
        return "numero de compte "+nc+" solde "+solde+" TND " ;
    }

}
