/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesControl;

import java.sql.*; 
import javax.swing.JOptionPane;

public class ConexionDB {
    Connection conexion;
    static String bd = "Ocarros3";   
    static String login="root", password="" ;
    static String url  = "jdbc:mysql://localhost/"+bd;
    boolean conectado =false;
    ConexionDB(String usuario,String contraseña){
    login = usuario;
    password = contraseña;
    prubaCon();
    }
    ConexionDB(){
     conexion= Conectar();
    }
    Connection conn ;
    
    public Connection Conectar()
    {
        Connection link = null;
        try
        {
            //Cargamos el Driver MySQL
            Class.forName("org.gjt.mm.mysql.Driver");
            //Creamos un enlace hacia la base de datos
            link = DriverManager.getConnection(this.url, this.login,this.password);
           conn = link;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "ha fallado la conexion");
           
        }
        return link;  
    } 
    public static void main(String[] args) throws Exception {
        
        Connection conn = null;
        try { 
          Class.forName("com.mysql.jdbc.Driver").newInstance();
         //conn = DriverManager.getConnection("jdbc:mysql://localhost/agualinda1","root","");
       conn = DriverManager.getConnection(url,login,password);
        if (conn != null) { 
            System.out.println("Conexión a base de datos "+url+" ... Ok");
            conn.close(); } 
        } catch(SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos "+url);
        } catch(ClassNotFoundException ex) 
        { 
            System.out.println(ex); 
        } 
    } 

    private void prubaCon() {
    Connection link = null;
        try
        {
            //Cargamos el Driver MySQL
            Class.forName("org.gjt.mm.mysql.Driver");
            //Creamos un enlace hacia la base de datos
            link = DriverManager.getConnection(this.url, this.login,this.password);
           // JOptionPane.showMessageDialog(null, "conexion exitosa");
             conectado=true;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "El usuario o la contraseña son incorrectos");
            conectado = false;
        }
       
    }
}
