import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

class ReactorNuclearGUI extends JFrame {
    final private JSlider slider;
    final private JLabel infoLabel;
    final private JTextField tempField;
    private int tempValue;
    private final String[] infoArray = {"ESTABLE", "PRECAUCIÓN", "RIESGO"}; // Información para cada rango de temperatura
    private final Color[] colorArray = {Color.GREEN, Color.ORANGE, Color.RED}; // Colores para cada rango de temperatura

    public ReactorNuclearGUI() {
        // Configurar el marco principal
        super("Simulador de temperatura de reactor nuclear");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear la lámina
        JPanel panel = new JPanel();
        panel.setLayout(null); // Configuración de diseño nulo para posicionar los componentes manualmente

        // Crear el JSlider
        slider = new JSlider(JSlider.HORIZONTAL, 0, 3000, 0);
        slider.setMajorTickSpacing(500); // espaciado de 500 unidades en el slider
        slider.setMinorTickSpacing(100); // espaciado de 100 unidades en el slider
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBounds(50, 20, 300, 50); // Configurar la posición y el tamaño del JSlider en la lámina
        panel.add(slider);

        // Crear la etiqueta de temperatura
        JLabel tempLabel = new JLabel("Temperatura actual: ");
        tempLabel.setBounds(50, 80, 150, 20); // Configurar la posición y el tamaño de la etiqueta en la lámina
        panel.add(tempLabel);

        // Crear la etiqueta de información
        infoLabel = new JLabel("ESTABLE");
        infoLabel.setBounds(200, 80, 100, 20); // Configurar la posición y el tamaño de la etiqueta en la lámina
        infoLabel.setForeground(Color.GREEN); // Configurar el color inicial
        panel.add(infoLabel);

        // Crear el campo de texto de temperatura
        tempField = new JTextField("0", 5); // El tamaño es de 5 caracteres
        tempField.setBounds(200, 110, 50, 20); // Configurar la posición y el tamaño del campo de texto en la lámina
        tempField.setEditable(false); // El campo de texto es de solo lectura
        panel.add(tempField);

        // Agregar el botón "Guardar"
        JButton saveButton = new JButton("Guardar");
        saveButton.setBounds(150, 150, 100, 30); // Configurar la posición y el tamaño del botón en la lámina
        panel.add(saveButton);
        saveButton.addActionListener(event -> {
            try {
                // Crear un archivo de texto para almacenar las temperaturas
                FileWriter writer = new FileWriter("temperaturas.txt", true);
                writer.write(tempValue + "\n");
                writer.close();
                JOptionPane.showMessageDialog(null, "Temperatura guardada correctamente.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        panel.add(saveButton);

        add(panel);

        slider.addChangeListener(event -> {
            // Obtener el valor actual del JSlider
            tempValue = slider.getValue();

            // Actualizar el campo de texto
            tempField.setText(Integer.toString(tempValue));

            // Actualizar la etiqueta de información y su color
            if (tempValue <= 1000) {
                infoLabel.setText(infoArray[0]); // ESTABLE
                infoLabel.setForeground(colorArray[0]); // VERDE
            } else if (tempValue <= 2000) {
                infoLabel.setText(infoArray[1]); // PRECAUCIÓN
                infoLabel.setForeground(colorArray[1]); // NARANJA
            } else {
                infoLabel.setText(infoArray[2]); // RIESGO
                infoLabel.setForeground(colorArray[2]); // ROJO
            }
        });
    }

}
        // Agregar el panel al


        public class examen3y1 {
            public static void main(String[] args) {
                ReactorNuclearGUI gui = new ReactorNuclearGUI();
                gui.setVisible(true);
    }
}

