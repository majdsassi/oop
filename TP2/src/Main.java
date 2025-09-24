import tp2.Date;
public static void main(String[] args) {
    Date aujourdhui = new Date();
    aujourdhui.GetDate();
    System.out.println("----------------------------------------------------") ;
    Date dateValide = new Date(15, 5, 2024);
    dateValide.GetDate();
    System.out.println("Date valide: " + dateValide.DateValid()); // Date S7i7a
    System.out.println("----------------------------------------------------") ;
    Date demain = dateValide.Demain(); // Ghodwa Mt3 el date el S7I7a
    System.out.print("Demain sera: ");
    demain.GetDate();
    System.out.println("----------------------------------------------------") ;
    Date finAnnee = new Date(31, 12, 2024); // E5er nhar fil 3am
    Date nouvelAn = finAnnee.Demain();
    nouvelAn.GetDate();
    System.out.println("----------------------------------------------------") ;
    Date finFevrier = new Date(29, 2, 1956); // E5ER nhar fi فيفري
    Date mars = finFevrier.Demain();
    mars.GetDate();
    System.out.println("----------------------------------------------------") ;
    ///////////////////////////////////////////////////////////////////////////
    System.out.println("Test  Les Setters et  Les Getter Methodes") ;
    mars.SetJour(20); // kent le 1er Mars En pricnipe twali 20 Mars
    System.out.printf("%d\n" ,mars.GetJour()) ;
    System.out.printf("%d\n" ,mars.GetMois()) ;
    System.out.printf("%d\n" ,mars.GetAnnee()) ;
    ///////////////////////////////////////////////////////////////////////////




}