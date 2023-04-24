package EmpleadosProcesamiento;

public class Empleado_P {
    private String primerNombre;
    private String segundoNombre;
    private double salario;
    private String departamento;

    public Empleado_P(String primerNombre, String segundoNombre, double salario, String departamento) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.salario = salario;
        this.departamento = departamento;
    }


    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    @Override
    public String toString() {return String.format("%-12s %-12s %12.2f %12s",primerNombre, segundoNombre, salario, departamento);}
// Devuelve primer nombre y apellido combinados del Empleado
public String obtenerNombreCompleto() {return String.format("%s %s", primerNombre, segundoNombre);}}