public class Garaxe{

    private int numeroCoches = 0;
    private float tempo;
    private Coche coche;


    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public void rexistroCoche(){
        if (numeroCoches<5){
            System.out.println("PLAZAS DISPOÑIBLES");
            numeroCoches = numeroCoches+1;
        }else{
            System.out.println("COMPLETO");
        }
    }
    public void verFactura(float tempo,float saldo){
        float prezo = 0;
        if (tempo<=3){
            prezo = tempo*1.5f;
        }else{
            prezo = (3*1.5f)+((tempo-3)*0.2f);
        }
        float saldorestante = saldo-prezo;
        System.out.println("FACTURA \nMATRICULA COCHE :"+coche.getMatriculaCoche()+
                "\nTEMPO :"+tempo+"\nPREZO :"+prezo+"\nCARTOS RECIBIDOS :"+saldo+
                "\nCARTOS DEVOLTOS :"+saldorestante+"\nGRAZAS POR USAR O NOSO APARCADOIRO");
    }
}

