public class Artigos {
    private int vendas;
    public void verTipo(){
        if (vendas<=100&&vendas>=0){
            System.out.println("O artigo é de baixo consumo.");
        }
        else if (vendas<=500){
            System.out.println("O artigo é de media necesidade.");
        }
        else if (vendas <= 1000) {
            System.out.println("O artigo é de alta necesidade.");
        }
        else{
            System.out.println("O artigo é de primeira necesidade.");
        }


    }
    public void setVendas(int vendas){
        this.vendas=vendas;
    }
}
