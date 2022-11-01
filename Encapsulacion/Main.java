package Encapsulacion;

public class Main
{
    public static void main(String[] args)
    {
        Persona persona = new Persona();

        persona.setNombre("Jonatan");
        persona.setEdad(23);
        persona.setTelefono("3015354620");


        System.out.println("Nombre: "+persona.getNombre()+" | Edad: "+persona.getEdad()
                +" | Telefono: "+persona.getTelefono());

    }
}
