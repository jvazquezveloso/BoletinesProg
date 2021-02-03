public class Main {
    public static void main(String[] args) {
        ConversorTemperaturas Con1 = new ConversorTemperaturas();
        try{
            System.out.println("A temperatura é de "+Con1.centigradosAFahrenheit(81)+" graos Fahrenheit.");
            System.out.println("A temperatura é de "+Con1.centigradosAFahrenheit(82)+" graos Fahrenheit.");
            System.out.println("A temperatura é de "+Con1.centigradosAReamur(81)+" graos Reamur.");
            System.out.println("A temperatura é de "+Con1.centigradosAReamur(79)+" graos Reamur.");
        }catch (TemperaturaErradaExcepcion e){
            System.out.println(e.getMessage());
        }
    }
}
