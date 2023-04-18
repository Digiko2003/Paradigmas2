package EmpleadoTxt;

public class Empleado {
    public static double getSalario;
    private String primerNombre;
    private String apellidoPaterno;
    private double salario;
    private  String departamento;

    public Empleado(String primerNombre, String apellidoPaterno, double salario, String departamento) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }


    public String formatoArchivo() {return primerNombre + "|" + apellidoPaterno + "|" + salario + "|" + departamento;}

    @Override
    public String toString() {
        return String.format("%-12s %-12s %12.2f %12s",
                primerNombre, apellidoPaterno, salario, departamento);

    }
    //Devuerve el primer nombre y apellido
    public  String obtenerNombreCompleto(){
        return  String.format("%s %s", primerNombre, apellidoPaterno);
    }
}
