//By Diego Arturo Enriquez mercado
package Empleado;

public class Empleado {
    private String nombre;
    private int numeroDeIdentificacion;
    private String Departamento;
    private String Puesto;
    private double Salario;



    //---------------------------------------
    public Empleado(String nombre, int numeroDeIdentificacion,String Departamento, String Puesto, double Salario) {
        this.nombre = nombre;
        this.numeroDeIdentificacion=numeroDeIdentificacion;
        this.Departamento=Departamento;
        this.Puesto=Puesto;
        this.Salario=Salario;

        //-----------------------------------
    }
    public String getNombre() {
        return nombre;
    }

    public int getNumeroDeIdentificacion() {
        return numeroDeIdentificacion;
    }

    public String getDepartamento(){return  Departamento;}

    public String getPuesto(){return Puesto;}

    public double getSalario(){return Salario;}

    //-----------------------------------
    @Override
    public String toString() {
        return "Ordenamiento.Persona{" +
                "nombre='" + nombre + '\'' +
                ", numeroDeIdentificacion='" + numeroDeIdentificacion + '\'' +
                ", departamento='" + Departamento + '\'' +
                ", puesto='" + Puesto + '\'' +
                ", salario=" + Salario +
                '}';
    }
}



