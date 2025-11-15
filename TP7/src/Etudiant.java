import java.util.*;
public class Etudiant implements Comparable<Etudiant> {
    private int mat;
    private String nom;
    private int age;
    public Etudiant(int mat, String nom, int age) {
        this.mat = mat;
        this.nom = nom;
        this.age = age;
    }
    public int getMat() { return mat; }
    public String getNom() { return nom; }
    public int getAge() { return age; }

    public String toString() {
        return "Mat: " + mat + " | Nom: " + nom + " | Age: " + age;
    }
    public int compareTo(Etudiant autre) {
        return this.nom.compareTo(autre.nom);
    }
}