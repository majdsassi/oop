public class Compte {
    float solde ;
    int nc ;
    public void Deposer(float x ) {
        solde += x ;
    }
    public void Retrait(float x ) {
        if (x > solde) {
            solde -= x ;
        }
        else{
            System.out.Println("Solde inssufucsant ") ;
        }
    }
    public ConsulterSolde(){
        System.out.Println("Votre Solde est : ", solde) ;
    }
    public void Verier(Compte ac, float x ) {
        Retrait(x) ;
        ac.Deposer(x)
    
    }

}