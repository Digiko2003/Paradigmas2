package ArrayList;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class FrmArrayListAmigos extends JFrame {
    DefaultListModel modelo = new DefaultListModel();
    ArrayList <String> listaAmigos = new ArrayList<>();

    // Se declara el constructor en el formulario
    public FrmArrayListAmigos() {
        initComponents();
        listaAmigos.add("Alberto");
        listaAmigos.add("María");
        listaAmigos.add("Antonio");
        listaAmigos.add("Juan");
        listaAmigos.add("Rosario");
        llenarJListAmigos();
    }

    // Metodos que ocupará el formulario
    public void llenarJListAmigos() {
        modelo.removeAllElements();
        for (int i = 0; i < listaAmigos.size(); i++) {
            modelo.addElement(listaAmigos.get(i));
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
        lblTitulo.setText("Amigos");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setPreferredSize(new Dimension(300,60));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo);

        JListAmigos = new JList <>();
        JListAmigos.setPreferredSize(new Dimension(60,30));
        JListAmigos.setVisibleRowCount(5); // 5 filas
        JListAmigos.setModel(modelo);

        panelParteInferior = new JPanel();
        panelParteInferior.setBackground(Color.black);
        panelParteInferior.setLayout(new GridLayout(1,2,20,20));
        add(panelParteInferior);
        panelParteInferior.add(add(new JScrollPane(JListAmigos)));

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
        String nombreAmigo = JOptionPane.showInputDialog("Escribe el nombre: ");
        if (nombreAmigo.equals("") || nombreAmigo == null) {
            return;
        }
        listaAmigos.add(nombreAmigo);
        llenarJListAmigos();
    }

    public void btnBuscarActionPerformed(ActionEvent event) {
        String nombreAmigo = JOptionPane.showInputDialog("Escribe el nombre a buscar: ");
        if (nombreAmigo.equals("") || nombreAmigo == null) {
            return;
        }
        if (listaAmigos.contains(nombreAmigo)) {
            JOptionPane.showMessageDialog(this, "El amigo si se encuentra");
        } else {
            JOptionPane.showMessageDialog(this, "El amigo no se encuentra");
        }
    }

    public void btnBorrarActionPerformed(ActionEvent event) {
        String nombreAmigo = JOptionPane.showInputDialog("Escribe el nombre a borrar: ");
        if (nombreAmigo.equals("") || nombreAmigo == null) {
            return;
        }
        Iterator<String> iterador = listaAmigos.iterator();
        while (iterador.hasNext()) {
            if (nombreAmigo.equals(iterador.next())) {
                iterador.remove();
                JOptionPane.showMessageDialog(this, "El amigo se ha eliminado");
            }
        }
        llenarJListAmigos();
    }

    public void btnSalirActionPerformed(ActionEvent event) {
        System.exit(0);
    }

    // metodo main
    public static void main(String[] args) {
        new FrmArrayListAmigos().setVisible(true);
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