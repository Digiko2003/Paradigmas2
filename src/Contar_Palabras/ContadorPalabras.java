//By Diego Arturo Enriquez Mercado
package Contar_Palabras;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ContadorPalabras extends JFrame implements ActionListener {
    private JButton countWordsButton;
    private JTable resultTable;

    public ContadorPalabras() {
        setTitle("Contador de palabras");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        countWordsButton = new JButton("Contar palabras");
        countWordsButton.addActionListener(this);

        resultTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(resultTable);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(countWordsButton);

        add(buttonPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == countWordsButton) {
            try {
                Object[][] tableData = countWords();
                String[] columnNames = {"Palabra", "Frecuencia"};
                DefaultTableModel model = new DefaultTableModel(tableData, columnNames);
                resultTable.setModel(model);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private Object[][] countWords() throws IOException {
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("03.1 melville-moby_dick.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase();
                String[] words = line.split("[^a-z0-9']+");
                for (String word : words) {
                    if (word.length() > 0) {
                        int count = wordCount.getOrDefault(word, 0);
                        wordCount.put(word, count + 1);
                    }
                }
            }
        }

        Object[][] tableData = new Object[wordCount.size()][2];
        int i = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            tableData[i][0] = entry.getKey();
            tableData[i][1] = entry.getValue();
            i++;
        }
        return tableData;
    }

    public static void main(String[] args) {
        new ContadorPalabras();
    }
}
