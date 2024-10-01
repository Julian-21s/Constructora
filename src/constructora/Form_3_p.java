
package constructora;

import javax.swing.*;
import java.awt.*;

public class Form_3_p {

    public Form_3_p() {
        //marco principal
        JFrame frame = new JFrame("Formulario de Datos Laborales");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Panel 1: Título
        JPanel panel1 = new JPanel();
        JLabel titleLabel = new JLabel("Datos Laborales", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        panel1.add(titleLabel);
        frame.add(panel1, BorderLayout.PAGE_START);

        // Panel 2
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        
        JTextField cedulaField = new JTextField(20);
        JTextField edadField = new JTextField(20);
        JTextField direccionField = new JTextField(20);
        JTextField años_de_experienciaField = new JTextField(20);
        
        // Etiquetas
        panel2.add(createLabeledField("Cédula", cedulaField));
        panel2.add(Box.createRigidArea(new Dimension(30, 10))); // Espacio entre campos
        panel2.add(createLabeledField("Edad", edadField));
        panel2.add(Box.createRigidArea(new Dimension(30, 10))); // Espacio entre campos
        panel2.add(createLabeledField("Dirección", direccionField));
        panel2.add(Box.createRigidArea(new Dimension(30, 10))); // Espacio entre campos
        panel2.add(createLabeledField("Años de experiencia", años_de_experienciaField));
        panel2.add(Box.createRigidArea(new Dimension(30, 10))); // Espacio entre campos
        
        // Listas desplegables
        JComboBox<String> experienciaCombo = new JComboBox<>(new String[]{"Area de diseño", "Area de construccion"});
        JComboBox<String> areaCombo = new JComboBox<>(new String[]{"Arquitectos", "Ingenieros civiles"});
        JComboBox<String> cargoCombo = new JComboBox<>(new String[]{"Maestros de obra certificados", "Bodoqueros", "Operariops de maquinaria pesada", "Choferes"});

        panel2.add(createLabeledCombo("Cargos", experienciaCombo));
        panel2.add(Box.createRigidArea(new Dimension(0, 10))); // Espacio entre campos
        panel2.add(createLabeledCombo("Área de diseño", areaCombo));
        panel2.add(Box.createRigidArea(new Dimension(0, 10))); // Espacio entre campos
        panel2.add(createLabeledCombo("Area de construccion", cargoCombo));

        frame.add(panel2, BorderLayout.CENTER);

        // Panel 3: Botones
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());

        JButton guardarButton = new JButton("Guardar");
        JButton buscarButton = new JButton("Buscar");
        JButton eliminarButton = new JButton("Eliminar");

        panel3.add(guardarButton);
        panel3.add(buscarButton);
        panel3.add(eliminarButton);

        frame.add(panel3, BorderLayout.PAGE_END);

        // Caracteristicas del frame
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Método para crear un campo de texto con titulo
    private JPanel createLabeledField(String label, JTextField textField) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(new JLabel(label));
        panel.add(textField);
        return panel;
    }

    // Método para crear un combo con titulo
    private JPanel createLabeledCombo(String label, JComboBox<String> comboBox) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(new JLabel(label));
        panel.add(comboBox);
        return panel;
    }

    //public static void main(String[] args) {SwingUtilities.invokeLater(Form_3_p::new);}
}
