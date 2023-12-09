/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
Nama        :   Dhifan Fadhilah Aditya - 140810210042
                Aryan Dafi Maulana – 140810210012
        	Akmal Azzary Megaputra - 140810210048
*/

public class Koneksi {
    private String dbuser = "root";
    private String dbpasswd = "";
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet rs = null;
    
    public Koneksi(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch(Exception e){
//            JOptionPane.showMessageDialog(null, ""+e.getMessage(), "JDBC Driver Error", JOptionPane.WARNING_MESSAGE);
        } 
        
        try{
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/rental", dbuser, dbpasswd);
            stmt = (Statement) con.createStatement(); 
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public ResultSet getData(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString); 
        } catch(Exception e){
//            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),"Communication Error", JOptionPane.WARNING_MESSAGE); 
        }
        return rs;
    }
    
    public void query(String SQLString){
        try{
            stmt.executeUpdate(SQLString); 
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
