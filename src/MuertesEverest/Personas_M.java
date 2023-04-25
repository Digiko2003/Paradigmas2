package MuertesEverest;

public class Personas_M {

    public String Nombre;
    public String Fecha;
    public double Edad;
    public String Expedicion;
    public String CausaDeMuerte;
    public String Ubicacion;


    public Personas_M(String nombre, String fecha, double edad, String expedicion, String causaDeMuerte, String ubicacion) {
        Nombre = nombre;
        Fecha = fecha;
        Edad = edad;
        Expedicion = expedicion;
        CausaDeMuerte = causaDeMuerte;
        Ubicacion = ubicacion;
    }


    public String getNombre() {
        return Nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public double getEdad() {
        return Edad;
    }

    public String getExpedicion() {
        return Expedicion;
    }

    public String getCausaDeMuerte() {
        return CausaDeMuerte;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public void setEdad(double edad) {
        Edad = edad;
    }

    public void setExpedicion(String expedicion) {
        Expedicion = expedicion;
    }

    public void setCausaDeMuerte(String causaDeMuerte) {
        CausaDeMuerte = causaDeMuerte;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }
}
