public class ConversorTemperaturas {
    private static final float TEMPERATURA = 80;


    public float centigradosAFahrenheit(float tempcentigrados)throws TemperaturaErradaExcepcion{
        if (tempcentigrados<80){
            throw new TemperaturaErradaExcepcion("A temperatura indicada é menor a 80 grados centígrados.");
        }else{
            float tempfahrenheit = (tempcentigrados*9/5+32);
            return tempfahrenheit;
        }
    }
    public float centigradosAReamur(float tempcentigrados)throws TemperaturaErradaExcepcion{
        if (tempcentigrados<80){
            throw new TemperaturaErradaExcepcion("A temperatura indicada é menor a 80 grados centígrados.");
        }else {
            float tempreamur = (tempcentigrados * 0.8f);
            return tempreamur;
        }
    }
}
