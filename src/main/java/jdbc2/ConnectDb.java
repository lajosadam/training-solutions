package jdbc2;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDb {

    public static void main(String[] args) {

        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("12345");
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("INSERT INTO employees(emp_name) VALUES (?)");) {
                stmt.setString(1, "Pista");
                stmt.executeUpdate();
        }
        catch (SQLException se) {
            throw new IllegalStateException(se);
        }

    }

}
