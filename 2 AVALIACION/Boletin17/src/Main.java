public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("A","Juan Perez", "ABC123", 40f,20);
        Libro l2 = new Libro("B","Juan Perez", "ABC123", 40f,20);
        Libro l3 = new Libro("C","Juan Perez", "ABC123", 40f,0);
        Libro l4 = new Libro("D","Juan Perez", "ABC123", 40f,20);
        Libro l5 = new Libro("E","Juan Perez", "ABC123", 40f,20);

        Libreria lib1 = new Libreria();
        lib1.engadirLibro(l5);
        lib1.engadirLibro(l4);
        lib1.engadirLibro(l3);
        lib1.engadirLibro(l2);
        lib1.engadirLibro(l1);

        lib1.verLibro();
        lib1.limpiarVacios();
        System.out.println("\n");
        lib1.verLibro();
        System.out.println("\n");
        lib1.consultarLibro(l4);
    }
}
