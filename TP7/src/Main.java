//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.* ;
void main() {
 Etudiant e0 = new Etudiant(1, "majd" , 20) ;
 Etudiant e1 = new Etudiant(2,"kais",21) ;
 Etudiant e2 = new Etudiant(3,"zak",34) ;
 Couple c1 = new Couple(2,3) ;
 Couple c = new Couple(1 , 1) ;
 Couple c2 = new Couple(2,1) ;

 TableauTriCouple tc = new TableauTriCouple(3) ;
 TableauTriEtudiant te = new TableauTriEtudiant(3) ;
 tc.insert(c);
 tc.insert(c1);
 tc.insert(c2);
 te.insert(e1);
 te.insert(e0);
 te.insert(e2);
 System.out.println(tc);
 System.out.println(te);
    Vector<Etudiant> etudiants = new Vector<>();
    etudiants.add(new Etudiant(103, "Ahmed", 20));
    etudiants.add(new Etudiant(101, "Majd", 22));
    etudiants.add(new Etudiant(105, "Kais", 19));

    Collections.sort(etudiants);

    System.out.println("tri par nom:");
    for (Etudiant e : etudiants) {
        System.out.println(e);
    }
    Vector<Integer> entiers = new Vector<>() ;
    entiers.add(10) ;
    entiers.add(20) ;
    entiers.add(5) ;
    entiers.add(24) ;
    Collections.sort(entiers);
    for (Integer i : entiers) {
        System.out.println(i);
    }
    Object[] arrayTab = entiers.toArray() ;


}
