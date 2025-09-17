package tp1 ;
public class Compte {
        float solde ;
        int nc ;
        public Compte(int numc , float soldec ) {
            solde = soldec ;
            nc = numc ;
        }
        public void finalize(){
            System.out.println("Destruction d'un compte *****************") ;
        }
        public void deposer(float x) {
            solde += x;
        }

        public void retrait(float x) {
            if (x <= solde) {
                solde -= x;
            } else {
                System.out.println("Solde insuffisant");
            }
        }

        public void consulterSolde() {
            System.out.println("Votre Solde est : " + solde);
        }

        public void virer(Compte ac, float x) {
            if (x <= solde) {
                retrait(x);
                ac.deposer(x);
            } else {
                System.out.println("Solde insuffisant pour le virement");
            }
        }
}
