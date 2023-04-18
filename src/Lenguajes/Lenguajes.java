package Lenguajes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Lenguajes extends JFrame {
    DefaultListModel modelo = new DefaultListModel();
    LinkedList<String> listaLenguajes = new LinkedList<>();

    //Lenguajes.Lenguajes --------------------------------------------------------
    public Lenguajes() {
        initComponents();
        listaLenguajes.add("Python");
        listaLenguajes.add("C++");
        listaLenguajes.add("C");
        listaLenguajes.add("Java");
        listaLenguajes.add("C#");
        llenarJListLenguajes();
    }

    // Metodos que ocupará el formulario --------------------------------------------------------
    public void llenarJListLenguajes() {
        modelo.removeAllElements();
        for (int i = 0; i < listaLenguajes.size(); i++) {
            modelo.addElement(listaLenguajes.get(i));
        }
    }

    // Metodo --------------------------------------------------------
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
        lblTitulo.setText("Lenguajes.Lenguajes de Programacion");
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

        // Panel de los botones--------------------------------------------------------
        panelBotones = new JPanel();
        panelBotones.setBackground(Color.black);
        panelBotones.setLayout(new GridLayout(4,1,10,10));
        panelParteInferior.add(panelBotones);

        // establecen botones --------------------------------------------------------
        btnAgregar = new JButton("Añadir elemento");
        btnAgregar2 = new JButton("Añadir elemento al final");
        btnAgregar3 = new JButton("Añadir elemento al principio");
        btnSalir = new JButton("Salir");

        // eventos --------------------------------------------------------
        btnAgregar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        btnAgregarActionPerformed(event);
                    }
                }
        );
        btnAgregar2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        btnBuscarActionPerformed(event);
                    }
                }
        );
        btnAgregar3.addActionListener(
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
        panelBotones.add(btnAgregar2);
        panelBotones.add(btnAgregar3);
        panelBotones.add(btnSalir);
    }

    // Listado de eventos --------------------------------------------------------
    public void btnAgregarActionPerformed(ActionEvent event) {
        String nombrePelicula = JOptionPane.showInputDialog("Escribe el lenguaje: ");
        if (nombrePelicula.equals("") || nombrePelicula == null) {
            return;
        }
        listaLenguajes.add(nombrePelicula);
        llenarJListLenguajes();
    }
//---------------------------------------------------------------------------------

    public void btnBuscarActionPerformed(ActionEvent event) {
        String nombrePelicula = JOptionPane.showInputDialog("Escribe el lenguaje: ");
        if (nombrePelicula.equals("") || nombrePelicula == null) {
            return;
        }
        listaLenguajes.add(nombrePelicula);
        llenarJListLenguajes();
    }
    //---------------------------------------------------------------------------------
    public void btnBorrarActionPerformed(ActionEvent event) {
        String nombrePelicula = JOptionPane.showInputDialog("Escribe el lenguaje: ");
        if (nombrePelicula.equals("") || nombrePelicula == null) {
            return;
        }
        listaLenguajes.addFirst(nombrePelicula);
        llenarJListLenguajes();
    }

    //---------------------------------------------------------------------------------

    public void btnSalirActionPerformed(ActionEvent event) {
        System.exit(0);
    }

    // metodo main --------------------------------------------------------
    public static void main(String[] args) {
        new Lenguajes().setVisible(true);
    }

    // controles del formulario --------------------------------------------------------
    private JList<String> JListAmigos;
    private JLabel lblTitulo;
    private JButton btnAgregar;
    private JButton btnAgregar2;
    private JButton btnAgregar3;
    private JButton btnSalir;
    JPanel panelBotones;
    JPanel panelParteInferior;
}