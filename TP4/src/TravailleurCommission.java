public class TravailleurCommission extends Employe  {
    private float Salaire ;
    private float Commission ;
    private int NombreArticle ;
    public TravailleurCommission(){
        super();
        this.Commission = 0.0F;
        this.Salaire = 0.0F ;
        this.NombreArticle = 0 ;
    }
    public TravailleurCommission(String Nom , String Prenom , float Commission , float Salaire , int NombreArticle){
        super(Prenom,Nom);
        this.Commission = Commission;
        this.Salaire = Salaire;
        this.NombreArticle = NombreArticle ;
    }

    public float getSalaire() {
        return Salaire;
    }

    public float getCommission() {
        return Commission;
    }

    public int getNombreArticle() {
        return NombreArticle;
    }

    public void setSalaire(float salaire) {
        Salaire = salaire;
    }

    public void setCommission(float commission) {
        Commission = commission;
    }

    public void setNombreArticle(int nombreArticle) {
        NombreArticle = nombreArticle;
    }
    public String toString(){
        return super.toString() + " Salaire : "+this.Salaire + " Commision : " + this.Commission + " Nombre Article : "+NombreArticle ;
    }
    public float Gains(){return this.Salaire ;}
}
