/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ma803216
 */


public class ConnectionDB {
    public static void  ConnectionDB() throws Exception{
  String url="jdbc:derby://localhost:1527/UsageGenerator";
 Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
 Connection conn= DriverManager.getConnection(url,"ma803216","Usage12");
 Statement st = conn.createStatement();
        ResultSet rs= st.executeQuery("SELECT * fROM MA803216.OPERATOR");
        System.out.printf("%12s %-12s" , "Id","name");
         while (rs.next()) {
            System.out.printf("%12s %-12s", rs.getString(1),rs.getString(2));
        }
        st.close();
        conn.close();
 
} 
    
}

