/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.DriverManager;

/**
 *
 * @author ASUS
 */
public class koneksiy {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getkoneksiy(){
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/uaspbo";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.print("Berhasil Terhubung");
            } catch (Exception e) {
                System.out.print("Error");
            }
        }
        return koneksi;
        
    }
    public static void main(String args[]){
        getkoneksiy();
    }   
}
