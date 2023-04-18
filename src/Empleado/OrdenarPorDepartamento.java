//By Diego Arturo Enriquez mercado
package Empleado;
import java.util.Comparator;
public class OrdenarPorDepartamento implements Comparator <Empleado> {

    @Override
    public int compare(Empleado Empleado1, Empleado Empleado2) {
        return Empleado1.getDepartamento().compareTo(Empleado2.getDepartamento());
    }


    }

