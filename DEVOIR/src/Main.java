//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Devoir TP 1er Semestre
/**
 @author : Majd Sassi
 **/
void main() {
    /*TacheComplexe tA = new TacheComplexe("A") ;
    TacheComplexe tE = new TacheComplexe("Exercice 5") ;
    tA.ajout(new TacheElemntaire("A1",10));
    tA.ajout(new TacheElemntaire("A2",20));
    System.out.println(tA.getCout());
    tE.ajout(new TacheElemntaire("B1",10));
    tE.ajout(new TacheElemntaire("B2",6));
    tE.ajout(new TacheElemntaire("B3" , 8));
    tE.tri();
    System.out.println(tE);*/
    TacheComplexe t6 = new TacheComplexe("Exercice 6") ;
    try {
        t6.ajout(null);

    }
    catch (TacheNullException e) {
        System.out.println(e.getMessage());
    }
    try {
        t6.supprimer(new TacheElemntaire("Test" , 0));

    }
    catch (TacheNullException e) {
        System.out.println(e.getMessage());
    }



}