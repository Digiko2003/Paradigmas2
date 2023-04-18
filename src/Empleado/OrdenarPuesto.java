package Empleado;
//By Diego Arturo Enriquez mercado
import java.util.Comparator;
public class OrdenarPuesto implements Comparator <Empleado> {
    @Override
    public int compare(Empleado Empleado1, Empleado Empleado2) {
        return Empleado1.getPuesto().compareTo(Empleado2.getPuesto());
    }
}

