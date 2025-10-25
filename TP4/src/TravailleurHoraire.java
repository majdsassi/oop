public class TravailleurHoraire extends Employe{
    private float Rémunération ;
    private int  NombreHeures ;
    public TravailleurHoraire(){
        super();
        this.NombreHeures = 0 ;
        this.Rémunération = 0.0F ;

    }
    public TravailleurHoraire(String Nom, String Prenom, float Remunération, int NombreHeures) {
        super(Prenom , Nom);
        this.Rémunération = Remunération ;
        this.NombreHeures = NombreHeures ;
    }

    public float getRémunération() {
        return Rémunération;
    }

    public int getNombreHeures() {
        return NombreHeures;
    }

    public void setNombreHeures(int nombreHeures) {
        NombreHeures = nombreHeures;
    }

    public void setRémunération(float rémunération) {
        Rémunération = rémunération;
    }
    public String toString(){
        return super.toString() + " Nombre Heure : " +this.NombreHeures + " Salaire/H : " +this.Rémunération ;
    }
    public float Gains(){
        return this.Rémunération * this.NombreHeures ;
    }
}
