package Empleado;
//By Diego Arturo Enriquez mercado
import java.util.Comparator;
    public class OrdenarPorSalario implements Comparator <Empleado> {
    @Override
    public int compare(Empleado Empleado1, Empleado Empleado2) {
        if(Empleado1.getSalario()==Empleado2.getSalario()){
        return 0;
    }else if(Empleado1.getSalario()>Empleado2.getSalario()){
            return 1;
        }else {
            return -1;
        }
        }
}

