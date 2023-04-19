package Contar_Palabras;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLettersGUI extends JFrame implements ActionListener {
    private JButton selectFileButton;
    private JTable resultTable;

    public CountLettersGUI() {
        setTitle("Contador de letras");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        selectFileButton = new JButton("Seleccionar archivo");
        selectFileButton.addActionListener(this);

        resultTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(resultTable);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(selectFileButton);

        add(buttonPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == selectFileButton) {
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt");
            fileChooser.setFileFilter(filter);
            int returnVal = fileChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                String fileName = fileChooser.getSelectedFile().getAbsolutePath();
                try {
                    Object[][] tableData = countLetters(fileName);
                    String[] columnNames = {"Letra", "Frecuencia"};
                    DefaultTableModel model = new DefaultTableModel(tableData, columnNames);
                    resultTable.setModel(model);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error al leer el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private Object[][] countLetters(String fileName) throws IOException {
        int[] letterCount = new int[26];
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase();
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (c >= 'a' && c <= 'z') {
                        letterCount[c - 'a']++;
                    }
                }
            }
        }

        Object[][] tableData = new Object[26][2];
        for (int i = 0; i < 26; i++) {
            tableData[i][0] = (char) ('a' + i);
            tableData[i][1] = letterCount[i];
        }
        return tableData;
    }

    public static void main(String[] args) {
        new CountLettersGUI();
    }
}

