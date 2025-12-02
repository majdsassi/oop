public interface Pile {
    void Empiler(Object o);   // push
    void Depiler();           // pop
    Object Entete();          // top
    boolean Vide();           // isEmpty
}
