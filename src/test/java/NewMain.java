
import com.rapChieuPhim.database.JBDCUntil;
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
        // TODO code application logic here
        Connection c = JBDCUntil.getConnection();
        if (c != null) {
            System.out.println("Kết nối thành công");
        } else {
            System.out.println("Kết nối thất bại");
        }
    }
    
}
