package proyecto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FitnessAppGUI extends JFrame {

    private JTextField pesoField;
    private JTextField estaturaField;
    private JLabel resultadoIMCLabel;
    private JComboBox<String> nivelComboBox;
    private JComboBox<String> grupoMuscularComboBox;
    private JTextArea rutinaTextArea;

    private CalcularImc logic;
    private JLabel lblNewLabel;

    public FitnessAppGUI() {
        logic = new CalcularImc();

        // Configuración de la ventana principal
        setTitle("Aplicación de Entrenamiento Personalizado");
        setSize(577, 576);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(5, 1));

        // Panel 1: Cálculo del IMC
        JPanel imcPanel = new JPanel();
        imcPanel.setLayout(new GridLayout(3, 2));
        imcPanel.add(new JLabel("Peso (kg):"));
        pesoField = new JTextField();
        imcPanel.add(pesoField);
        imcPanel.add(new JLabel("Estatura (cm):"));
        estaturaField = new JTextField();
        imcPanel.add(estaturaField);
        JButton calcularIMCButton = new JButton("Calcular IMC");
        imcPanel.add(calcularIMCButton);
        resultadoIMCLabel = new JLabel("Resultado del IMC");
        imcPanel.add(resultadoIMCLabel);

        calcularIMCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double peso = Double.parseDouble(pesoField.getText());
                    double estatura = Double.parseDouble(estaturaField.getText());
                    String resultadoIMC = logic.calcularIMC(peso, estatura);
                    resultadoIMCLabel.setText(resultadoIMC);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos.");
                }
            }
        });

        getContentPane().add(imcPanel);

        // Panel 2: Selección de nivel y grupo muscular
        JPanel rutinaPanel = new JPanel();
        rutinaPanel.setLayout(new GridLayout(3, 2));
        rutinaPanel.add(new JLabel("Nivel:"));
        nivelComboBox = new JComboBox<>(new String[]{"Principiante", "Medio", "Experto"});
        rutinaPanel.add(nivelComboBox);
        rutinaPanel.add(new JLabel("Grupo muscular:"));
        grupoMuscularComboBox = new JComboBox<>(new String[]{"Pecho", "Espalda", "Piernas", "Brazos"});
        rutinaPanel.add(grupoMuscularComboBox);
        JButton generarRutinaButton = new JButton("Generar Rutina");
        rutinaPanel.add(generarRutinaButton);
        rutinaTextArea = new JTextArea();
        rutinaTextArea.setEditable(false);
        rutinaPanel.add(new JScrollPane(rutinaTextArea));

        generarRutinaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nivel = (String) nivelComboBox.getSelectedItem();
                String grupoMuscular = (String) grupoMuscularComboBox.getSelectedItem();
                String rutina = logic.generarRutina(nivel, grupoMuscular);
                rutinaTextArea.setText(rutina);
            }
        });

        getContentPane().add(rutinaPanel);

        // Panel 3: Video
        JPanel videoPanel = new JPanel();
        videoPanel.add(new JLabel("Funcionalidad de video no implementada en este ejemplo."));
        getContentPane().add(videoPanel);
        
        lblNewLabel = new JLabel("New label");
        getContentPane().add(lblNewLabel);

        // Mostrar ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        new FitnessAppGUI();
    }
}

