package Herencia;

public class Trabajador extends Persona
{
    private double salario;

    public Trabajador(String nombre , int edad , String telefono, double salario)
    {
        setNombre(nombre);
        setEdad(edad);
        setTelefono(telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
