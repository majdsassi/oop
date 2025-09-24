package tp2 ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date {
        private int jj;
        private int mm;
        private int aaaa;
        private int Input (String msg ) {
            try {
                BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
                System.out.printf("%s : ", msg);
                String ch = clavier.readLine();
                //System.out.printf("\n");
                return Integer.parseInt(ch);
            }catch (IOException e ){
                System.out.println(e.getMessage()) ;

            }
            return 0 ;

        }
        public Date() {
            aaaa = Input("Donner L'annee") ;
            mm = Input("Donner le mois") ;
            jj = Input("Donner Le jour ") ;

        }

        public Date(int j, int m, int a) {
            jj = j;
            mm = m;
            aaaa = a;
        }

        public Date Demain() {
            if (jj == nbJours(mm)) {
                if (mm == 12) {
                    return new Date(1, 1, aaaa + 1);
                } else {
                    return new Date(1, mm + 1, aaaa);
                }
            }
            return new Date(jj + 1, mm, aaaa);
        }

        private boolean EstBisextille() {
            return (aaaa % 4 == 0 && aaaa % 100 != 0) || (aaaa % 400 == 0);
        }

        private int nbJours(int mm) {
            int t30jour[] = {4, 6, 9, 11};
            if (Existe(t30jour, mm)) {
                return 30;
            }
            if (mm == 2) {
                return EstBisextille() ? 29 : 28; // operateur ternaire kimma mt3 el c
            }
            return 31;
        }

        private boolean Existe(int[] arr, int x) {
            for (int element : arr) {
                if (element == x) {
                    return true;
                }
            }
            return false;
        }

        public boolean DateValid() {
            if (mm < 1 || mm > 12) {
                return false;
            }
            if (jj < 1 || jj > nbJours(mm)) {
                return false;
            }
            return true;
        }
        // Geters Methodes
        public void GetDate() {
            System.out.printf("Aujourd'hui est le %d mois %d l'annee %d%n", jj, mm, aaaa);
        }
        public int GetJour(){
            return jj ;
        }
        public int GetMois(){
            return mm ;
        }
        public int GetAnnee(){
            return aaaa ;
        }
        // Setters Methodes
        public void SetJour(int x) {
                jj = x ;

        }
        public void SetMois(int x) {
            mm = x ;

        }
        public void SetAnnee(int x) {
            aaaa = x ;

        }

    }
    //