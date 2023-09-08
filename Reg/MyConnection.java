/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reg;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author User
 */
public class MyConnection {
 
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname  = "java_login_register";
    private static Integer portnumber  = 3306;
    private static String password = ""; 
    
    public static Connection getConnection()
        
    {
        Connection con = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        
        try{
            Class.forName("com.mysql.jdbc.driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost/java_login_register.", "root", "");
            } catch(Exception ex){
                System.out.println(ex.getMessage());
            }
    return con;
}
    }

