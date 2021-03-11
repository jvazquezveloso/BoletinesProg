import java.util.ArrayList;

public class Libreria {
    private ArrayList<Libro> listaLibros = new ArrayList<Libro>();

    public void engadirLibro(Libro l){
        listaLibros.add(l);
    }
    public void borrarLibro(Libro l){
        if (l.getUnidades()<1){
            System.out.println("O número de unidades xa é 0.");
        }else{
            l.setUnidades(l.getUnidades()-1);
            System.out.println("Libro vendido/borrado.");
        }
    }

    private void intercambiar(int a , int b){
        Libro temp = listaLibros.get(a);
        listaLibros.set(a,listaLibros.get(b));
        listaLibros.set(b,temp);
    }
    private void ordenarLibro(){
        for (int i = 1; i <listaLibros.size() ; i++) {
            if (listaLibros.get(i).getTitulo().compareToIgnoreCase(listaLibros.get(i-1).getTitulo())<0){
                intercambiar(i,i-1);
            }
        }
    }

    public void verLibro(){
        for (int i = 0; i < listaLibros.size(); i++) {
            ordenarLibro();
        }
        for (int i = 0; i < listaLibros.size(); i++) {
            System.out.println(listaLibros.get(i).toString());
        }
    }
    public void limpiarVacios(){
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getUnidades()<1){
                listaLibros.remove(i);
            }

        }

    }
    public void consultarLibro(Libro l){
        System.out.println(l.toString());
    }

}
