abstract class   TableauTrie {
        protected Object[] tableau;
        protected int taille;
        protected int compteur;

        public TableauTrie(int taille) {
            this.taille = 30;
            this.tableau = new Object[taille];
            this.compteur = 0;
        }

        public abstract boolean plusGrand(Object x, Object y);


        public void insert(Object x) {
            if (compteur >= taille) {
                System.out.println("Tableau plein !");
                return;
            }

            int position = 0;

            while (position < compteur && plusGrand(x, tableau[position])) {
                position++;
            }


            for (int i = compteur; i > position; i--) {
                tableau[i] = tableau[i - 1];
            }


            tableau[position] = x;
            compteur++;
        }
        public String toString() {
            String result = "[";
            for (int i = 0; i < compteur; i++) {
                result += tableau[i];
                if (i < compteur - 1) {
                    result += ", ";
                }
            }
            result += "]";
            return result;
        }

        public int getCompteur() {
            return compteur;
        }

        public int getTaille() {
            return taille;
        }
    }