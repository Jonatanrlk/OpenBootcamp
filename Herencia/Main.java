package Herencia;

public class Main
{
    public static void main(String[] args)
    {
        Cliente cliente ;

        cliente = new Cliente("Jonatan", 33, "30288392", 1000);

        System.out.println("nombre: "+cliente.getNombre()+" edad: "+cliente.getEdad()+
                " telefono: "+cliente.getTelefono()+" credito: "+cliente.getCredito());


        System.out.println("-----------------------");

        Trabajador empleado ;

        empleado = new Trabajador("Javier", 23, "4920834", 1.500);

        System.out.println("nombre: "+empleado.getNombre()+" edad: "+empleado.getEdad()+" telefono: "+empleado.getTelefono()+
                " salario: "+empleado.getSalario());
    }
}
