public class Patron extends Employe {
    private float Salaire ;
    public Patron(){
        super();
    }
    public Patron(String Nom , String Prenom , float Salaire){
        super(Nom , Prenom);
        this.Salaire = Salaire ;
    }

    public float getSalaire() {
        return Salaire;
    }

    public void setSalaire(float salaire) {
        Salaire = salaire;
    }
    public String toString(){
        return super.toString() + " Salaire : "+this.Salaire ;
    }
    public float Gains(){return this.Salaire ;}
}
