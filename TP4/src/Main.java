//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Employe e1 = new Employe("Majd" , "Sassi") ;
    Patron p1 = new Patron("Sassi" , "Majd" , 4000.0F) ;
    TravailleurCommission tc1 = new TravailleurCommission("Sassi","Majd" ,5.5F , 1000.0F , 20) ;
    TravailleurHoraire th1 = new TravailleurHoraire("Sassi","Majd",50.7F , 192) ;
    System.out.println(e1);
    System.out.println(p1);
    System.out.println(tc1);
    System.out.println(th1);

}
