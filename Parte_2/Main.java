package Parte_2;

public class Main
{
    public static void main(String[] args)
    {
        //Instancia

        Coche miCoche = new Coche();

        miCoche.incrementarNumeroDePuertas();
        miCoche.incrementarNumeroDePuertas();
        miCoche.incrementarNumeroDePuertas();

        System.out.println("Numero de puertas de tu coche es : "+miCoche.numeroDePuertas);

    }
}

 class Coche
{
    int numeroDePuertas;

    public void incrementarNumeroDePuertas()
    {
        numeroDePuertas++;
    }
}
