package jdbc.dbutils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public interface IConnectionAdapter {

    public Connection getConnection() throws SQLException, IOException;
    public Properties readDatabaseProperties() throws IOException;

}
