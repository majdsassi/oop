import tp2.Date;
public static void main(String[] args) {
    Date aujourdhui = new Date();
    aujourdhui.GetDate();

    Date dateValide = new Date(15, 5, 2024);
    dateValide.GetDate();
    System.out.println("Date valide: " + dateValide.DateValid()); // Date S7i7a

    Date dateInvalide = new Date(32, 13, 2024); // Date Ghalta
    dateInvalide.GetDate();
    System.out.println("Date valide: " + dateInvalide.DateValid());

    Date demain = dateValide.Demain(); // Ghodwa Mt3 el date el S7I7a
    System.out.print("Demain sera: ");
    demain.GetDate();

    Date finAnnee = new Date(31, 12, 2024); // E5er nhar fil 3am
    Date nouvelAn = finAnnee.Demain();
    nouvelAn.GetDate();

    Date finFevrier = new Date(28, 2, 2023); // E5ER nhar fi فيفري
    Date mars = finFevrier.Demain();
    mars.GetDate();
}