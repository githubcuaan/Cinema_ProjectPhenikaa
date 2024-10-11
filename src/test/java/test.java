import com.rapChieuPhim.dao.CustomersDAO;
import com.rapChieuPhim.dao.EmployeeDAO;
import com.rapChieuPhim.database.JBDCUntil;
import com.rapChieuPhim.model.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) {
        Connection connection = JBDCUntil.getConnection(); 
        CustomersDAO customersDAO = new CustomersDAO(connection);
        boolean isRegistered = customersDAO.register("newuser", "newuser@example.com", "password123");
        if (isRegistered) {
            System.out.println("Đăng ký thành công!");
        } else {
            System.out.println("Đăng ký thất bại. Vui lòng thử lại.");
        }
    }
}   

