package constructora;

import javax.swing.*;
import java.awt.*;

public class Form_2 extends JFrame {

    public Form_2() {
        // Configuración de la ventana
        setTitle("Registro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Panel para el título
        JPanel panelTitulo = new JPanel();
        JLabel titulo = new JLabel("Registro");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        panelTitulo.add(titulo);
        panelTitulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Espacio alrededor del título

        // Panel para los campos de entrada
        JPanel panelCampos = new JPanel();
        panelCampos.setLayout(new GridLayout(6, 3, 10, 10)); // 6 filas, 3 columnas

        // Agregamos espacios vacíos en las columnas
        for (int i = 0; i < 6; i++) {
            panelCampos.add(new JLabel()); // Columna vacía
            panelCampos.add(crearPanelConCampo(getPlaceholderText(i))); // Columna del medio para el campo
            panelCampos.add(new JLabel()); // Columna vacía
        }

        // Panel para botones en la parte inferior
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton botonGuardar = new JButton("Guardar");
        panelBotones.add(botonGuardar);
        
        JButton botonBuscar = new JButton("Buscar");
        panelBotones.add(botonBuscar);
        
        JButton botonLimpiar = new JButton("Limpiar");
        panelBotones.add(botonLimpiar);
        
        JButton botonEliminar = new JButton("Eliminar");
        panelBotones.add(botonEliminar);
        
        JButton botonEditar = new JButton("Editar");
        panelBotones.add(botonEditar);

        // Agregar los paneles al marco principal
        setLayout(new BorderLayout());
        add(panelTitulo, BorderLayout.NORTH);
        add(panelCampos, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        // Hacer visible la ventana
        setVisible(true);
    }

    private JPanel crearPanelConCampo(String placeholder) {
        // Crear un panel para contener el campo de texto
        JPanel panelCampo = new JPanel();
        panelCampo.setLayout(new BoxLayout(panelCampo, BoxLayout.Y_AXIS)); // Layout vertical

        // Crear el campo de texto
        JTextField campoTexto = new JTextField(10); // Ajustar a 10 columnas
        campoTexto.setPreferredSize(new Dimension(120, 20)); // Ancho de 100, altura de 20
        campoTexto.setMaximumSize(new Dimension(120, 20)); // Tamaño máximo ajustado
        campoTexto.setMinimumSize(new Dimension(100, 10)); // Tamaño mínimo ajustado
        campoTexto.setText(placeholder); // Establece el texto del placeholder
        campoTexto.setForeground(Color.GRAY); // Color del placeholder

        campoTexto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (campoTexto.getText().equals(placeholder)) {
                    campoTexto.setText("");
                    campoTexto.setForeground(Color.BLACK);
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (campoTexto.getText().isEmpty()) {
                    campoTexto.setForeground(Color.GRAY);
                    campoTexto.setText(placeholder);
                }
            }
        });

        // Agregar el campo de texto al panel
        panelCampo.add(campoTexto);
        return panelCampo; // Devuelve el panel con el campo de texto
    }

    private String getPlaceholderText(int index) {
        switch (index) {
            case 0: return "Nombre";
            case 1: return "Cédula";
            case 2: return "Teléfono";
            case 3: return "Email";
            case 4: return "Usuario";
            case 5: return "Contraseña";
            default: return "";
        }
    }

    //public static void main(String[] args) {SwingUtilities.invokeLater(() -> new Form_2());}
}
