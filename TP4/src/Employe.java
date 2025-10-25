public class Employe {
    private String Nom ;
    private String Prenom ;
    private static int nbEmploye  = 0 ;
    public  Employe(){
        this.Nom = "" ;
        this.Prenom = "" ;
        nbEmploye++ ;
        System.out.printf("Nombre Employe : %d \n" ,nbEmploye);
    }
    public  Employe(String Nom , String Prenom) {
        this.Prenom = Prenom ;
        this.Nom = Nom ;
        nbEmploye++ ;
        System.out.println(nbEmploye);

    }
    public void setNom(String nom){
       this.Nom = nom ;

    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public int gains() {return 0 ;}
    public String toString() {
        return "Le nom de l'employe est : "+Prenom+" " +Nom ;
    }
}
