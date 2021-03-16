package jdbc.dbutils;

import org.mariadb.jdbc.MariaDbDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public final class ConnectionUtil  {



    public static class Builder implements IConnectionAdapter{

        @Override
        public Connection getConnection() throws SQLException, IOException {
            MariaDbDataSource dataSource = new MariaDbDataSource();
            Properties properties = readDatabaseProperties();
            dataSource.setDatabaseName(properties.getProperty(databaseNameKey));
            dataSource.setPort(Integer.valueOf(properties.getProperty(portKey)));
            dataSource.setUserName(properties.getProperty(usernameKey));
            dataSource.setPassword(properties.getProperty(passwordKey));
            dataSource.setUrl(null);
            return dataSource.getConnection();
        }

        @Override
        public Properties readDatabaseProperties() throws IOException {
            String propertyName = "connection.properties";
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertyName);
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties;
        }

        private String databaseNameKey;
        private String portKey;
        private String usernameKey;
        private String passwordKey;

        public Builder withDatabaseKey(String databaseNameKey) {
            this.databaseNameKey = databaseNameKey;
            return this;
        }

        public Builder withPortKey(String portKey) {
            this.portKey = portKey;
            return this;
        }

        public Builder withUsernameKey(String usernameKey) {
            this.usernameKey = usernameKey;
            return this;
        }

        public Builder withPasswordKey(String passwordKey) {
            this.passwordKey = passwordKey;
            return this;
        }

        public Connection build() throws IOException, SQLException {
            Connection connection = getConnection();
            return connection;
        }

    }

}


