
package boletin4_1;

public class Libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    
    
    public Libro(){   
    }
    
    public Libro(String tit, String aut, int anos, short pag, float val){
        titulo = tit;
        autor = aut;
        ano = anos;
        numPaginas = pag;
        valoracion = val;
    }
    
    
   
    public void setTitulo(String tit){
        titulo = tit;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setAutor(String aut){
        autor = aut;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAno(int anos){
        ano = anos;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setPaginas(short pag){
        numPaginas = pag;
    }
    
    public short getPaginas(){
        return numPaginas;
    }
    
    public void setValoracion(float val){
        valoracion = val;
    }
    
    public float getValoracion(){
        return valoracion;
    }
    
    public void amosar(){
        System.out.println(titulo+","+autor+"( "+ano+","+numPaginas+" páxinas,"+valoracion+"/10)");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
