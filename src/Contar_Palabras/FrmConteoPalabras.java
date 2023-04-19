package Contar_Palabras;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JFrame;

public class FrmConteoPalabras extends JFrame {
    DefaultTableModel model = new DefaultTableModel();
    Map<String, Integer> frecuencias = new HashMap<>();

    //Se declara el constructor del formulario
    public  FrmConteoPalabras() {
        initComponents();
        crearMapa();
        llenarTabla();
    }
    private void crearMapa() {
        String enunciado = "mapa mapa zona";
        //divide el enunciado en tokens
        String[] tokens = enunciado.split("");

        //procesamiento de texto
        for (String token : tokens) {
            String palabra = token.toLowerCase();
            if (frecuencias.containsKey(palabra)) {
                int cuenta = frecuencias.get(palabra);
                frecuencias.put(palabra, cuenta + 1);
            } else {
                frecuencias.put(palabra, 1);
            }
        }
    }
    private void llenarTabla(){
        //se pasan los datos
        Object[] fila= new Object[2];
        Set<String> claves = frecuencias.keySet();

        TreeSet<String> clavesOrdenadas = new TreeSet<>(claves);
        for(String clave : clavesOrdenadas){
            fila[0]=clave;
            fila[1]=frecuencias.get(clave);
            model.addRow(fila);
        }
    }
    private void initComponents(){
        JPanel panel = new JPanel(new BorderLayout());
        //Crea una tabla
        JTable table = new JTable(model);
        model.addColumn("Palabra");
        model.addColumn("No. de ocurrencias");
        panel.add(table.getTableHeader(), BorderLayout.NORTH);

        panel.add(table, BorderLayout.NORTH);
        setContentPane(panel);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);

        setTitle("Frecuiencia de palabras de un archivo de texto");
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        new FrmConteoPalabras().setVisible(true);
    }

}
