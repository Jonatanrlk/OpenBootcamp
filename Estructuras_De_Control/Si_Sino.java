package Estructuras_De_Control;

/**
 * Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
 * Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
 */

public class Si_Sino
{
    public static void main(String[] args)
    {
        int numeroIf= 0;

        if(numeroIf > 0)
        {
            System.out.println("Es positivo");
        }else if(numeroIf < 0)
        {
            System.out.println("Es negativo");
        }else
        {
            System.out.println("Es cero");
        }
    }
}
