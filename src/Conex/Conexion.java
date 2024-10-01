
package Conex;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion 
{
    Connection con;

    public Conexion()
    {
        try
        {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");  
            // Conectar a la base de datos
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/constructora_bd?useSSL=false&serverTimezone=UTC", "root", "");
            // Mostrar mensaje de conexión exitosa
            JOptionPane.showMessageDialog(null, "Conexión exitosa!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();  // Imprime la traza del error
            // Mostrar mensaje de error
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }     
    }

   
}


