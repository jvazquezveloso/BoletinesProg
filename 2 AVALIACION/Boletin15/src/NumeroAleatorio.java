public class NumeroAleatorio {
    public void crearArray(){
        Integer[]a=new Integer[7];
        for (int i = 0; i < 8; i++) {
            a[i]= (int)(Math.round(Math.random()));
        }
    }
}
