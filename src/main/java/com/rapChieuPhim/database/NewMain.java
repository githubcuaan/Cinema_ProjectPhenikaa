
package com.rapChieuPhim.database;
import java.sql.Connection;
/**
 *
 * @author DinhAn
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Connection connection = JBDCUntil.getConnection();
       if(connection != null){ 
        System.out.println("Kết nối thành công");
       }else{
        System.out.println("Kết nối thất bại");
       }
    }
    
}
