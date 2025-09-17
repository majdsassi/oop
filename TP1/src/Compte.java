package TP1 ;
public class Compte {
        float solde ;
        int nc ;
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