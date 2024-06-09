/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;

public class tables {
    public static void main(String args[])
    {
        Connection con=null;
        Statement st=null;
        try
        {
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            st.executeUpdate("create table higher_authority(id varchar(5),username varchar(6),password varchar(8))");
            JOptionPane.showMessageDialog(null,"Table created successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
             try
        {
            con.close();
            st.close();
            
        }
        catch(Exception e)
        {
            
        }
        }
    }
    
}
