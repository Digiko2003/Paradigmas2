package Primer.ArrayList;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author Issa
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class FrmArrayListPeliculas extends JFrame {
    DefaultListModel modelo = new DefaultListModel();
    ArrayList <String> listaPeliculas = new ArrayList<>();

    //Peliculas
    public FrmArrayListPeliculas() {
        initComponents();
        listaPeliculas.add("Alberto");
        listaPeliculas.add("María");
        listaPeliculas.add("Antonio");
        listaPeliculas.add("Juan");
        listaPeliculas.add("Rosario");
        llenarJListPeliculas();
    }

    // Metodos que ocupará el formulario
    public void llenarJListPeliculas() {
        modelo.removeAllElements();
        for (int i = 0; i < listaPeliculas.size(); i++) {
            modelo.addElement(listaPeliculas.get(i));
        }
    }

    // Metodo
    private void initComponents() {
        lblTitulo = new JLabel();
        // Caracteristicas de la ventana
        getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        // Establecer Layout
        setLayout(new GridLayout(2,1,20,20));
        // Caracteristicas del titulo
        lblTitulo.setFont(new Font("Dialog", 0, 48));
        lblTitulo.setText("Peliculas");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setPreferredSize(new Dimension(300,60));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo);

        JList<Object> JListPeliculas = new JList<>();
        JListPeliculas.setPreferredSize(new Dimension(60,30));
        JListPeliculas.setVisibleRowCount(5); // 5 filas
        JListPeliculas.setModel(modelo);

        panelParteInferior = new JPanel();
        panelParteInferior.setBackground(Color.black);
        panelParteInferior.setLayout(new GridLayout(1,2,20,20));
        add(panelParteInferior);
        panelParteInferior.add(add(new JScrollPane(JListPeliculas)));

        // Panel de los botones
        panelBotones = new JPanel();
        panelBotones.setBackground(Color.black);
        panelBotones.setLayout(new GridLayout(4,1,10,10));
        panelParteInferior.add(panelBotones);

        // establecen botones
        btnAgregar = new JButton("Agregar");
        btnBuscar = new JButton("Buscar");
        btnBorrar = new JButton("Borrar");
        btnSalir = new JButton("Salir");

        // eventos
        btnAgregar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        btnAgregarActionPerformed(event);
                    }
                }
        );
        btnBuscar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        btnBuscarActionPerformed(event);
                    }
                }
        );
        btnBorrar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        btnBorrarActionPerformed(event);
                    }
                }
        );
        btnSalir.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        btnSalirActionPerformed(event);
                    }
                }
        );

        panelBotones.add(btnAgregar);
        panelBotones.add(btnBuscar);
        panelBotones.add(btnBorrar);
        panelBotones.add(btnSalir);
    }

    // Listado de eventos
    public void btnAgregarActionPerformed(ActionEvent event) {
        String nombrePelicula = JOptionPane.showInputDialog("Escribe la pelicula: ");
        if (nombrePelicula.equals("") || nombrePelicula == null) {
            return;
        }
        listaPeliculas.add(nombrePelicula);
        llenarJListPeliculas();
    }

    public void btnBuscarActionPerformed(ActionEvent event) {
        String nombrePelicula = JOptionPane.showInputDialog("Escribe la pelicula a buscar: ");
        if (nombrePelicula.equals("") || nombrePelicula == null) {
            return;
        }
        if (listaPeliculas.contains(nombrePelicula)) {
            JOptionPane.showMessageDialog(this, "El amigo si se encuentra");
        } else {
            JOptionPane.showMessageDialog(this, "El amigo no se encuentra");
        }
    }

    public void btnBorrarActionPerformed(ActionEvent event) {
        String nombrePelicula = JOptionPane.showInputDialog("Escribe la pelicula a borrar: ");
        if (nombrePelicula.equals("") || nombrePelicula == null) {
            return;
        }
        Iterator<String> iterador = listaPeliculas.iterator();
        while (iterador.hasNext()) {
            if (nombrePelicula.equals(iterador.next())) {
                iterador.remove();
                JOptionPane.showMessageDialog(this, "La pelicula se ha eliminado");
            }
        }
        llenarJListPeliculas();
    }

    public void btnSalirActionPerformed(ActionEvent event) {
        System.exit(0);
    }

    // metodo main
    public static void main(String[] args) {
        new FrmArrayListPeliculas().setVisible(true);
    }

    // controles del formulario
    private JList<String> JListAmigos;
    private JLabel lblTitulo;
    private JButton btnAgregar;
    private JButton btnBuscar;
    private JButton btnBorrar;
    private JButton btnSalir;
    JPanel panelBotones;
    JPanel panelParteInferior;
}