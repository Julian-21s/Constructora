package constructora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_1 extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoContrasena;

    public Form_1() {
        // Configuración de la ventana
        setTitle("Registro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaciado entre componentes

        // Panel para el botón de registrar
        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton botonRegistrar = new JButton("Registrar");
        panelBoton.add(botonRegistrar);
        //COMENTARIO ADICIONAL

        // Agregar el panel del botón al marco
        add(panelBoton, BorderLayout.NORTH);

        // Etiqueta y campo para usuario
        campoUsuario = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(campoUsuario, gbc);

        JLabel etiquetaUsuario = new JLabel("Usuario");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(etiquetaUsuario, gbc);

        // Etiqueta y campo para contraseña
        campoContrasena = new JPasswordField(20);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(campoContrasena, gbc);

        JLabel etiquetaContrasena = new JLabel("Contraseña");
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(etiquetaContrasena, gbc);

        // Acción del botón
        botonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarUsuario();
            }
        });

        // Agregar el panel principal al marco
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void registrarUsuario() {
        String usuario = campoUsuario.getText();
        String contrasena = new String(campoContrasena.getPassword());
        // Lógica para registrar el usuario en la base de datos
        JOptionPane.showMessageDialog(this, "Usuario registrado: " + usuario);
    }

    public static void main(String[] args) {SwingUtilities.invokeLater(() -> new Form_1());}
}

