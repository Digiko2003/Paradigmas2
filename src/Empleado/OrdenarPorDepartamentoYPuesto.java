package Empleado;
//By Diego Arturo Enriquez mercado
import java.util.Comparator;
public class OrdenarPorDepartamentoYPuesto implements Comparator<Empleado> {
    @Override
    public int compare(Empleado Empleado1, Empleado Empleado2){
        if(Empleado1.getDepartamento().compareTo(Empleado2.getDepartamento()) !=0){
            return Empleado1.getDepartamento().compareTo(Empleado2.getDepartamento());
        }
            return Empleado1.getPuesto().compareTo(Empleado2.getPuesto());
        }
    }
