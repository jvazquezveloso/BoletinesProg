public class Main {
    public static void main(String[] args) {
        Coche coc1 = new Coche("123ABC");
        Coche coc2 = new Coche("1234ABC");
        Coche coc3 = new Coche("12345ABC");
        Coche coc4 = new Coche("123456ABC");
        Coche coc5 = new Coche("12ABC");
        Coche coc6 = new Coche("1ABC");
        Garaxe gar1 = new Garaxe();
        gar1.setCoche(coc1);
        gar1.rexistroCoche();
        gar1.verFactura(5,20);
        gar1.setCoche(coc2);
        gar1.rexistroCoche();
        gar1.setCoche(coc3);
        gar1.rexistroCoche();
        gar1.setCoche(coc4);
        gar1.rexistroCoche();
        gar1.setCoche(coc5);
        gar1.rexistroCoche();
        gar1.setCoche(coc6);
        gar1.rexistroCoche();
    }
}
