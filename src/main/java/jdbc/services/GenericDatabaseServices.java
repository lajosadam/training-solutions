package jdbc.services;

import jdbc.dao.entity.Zolika;
import jdbc.interfaces.IGenericService;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class GenericDatabaseServices<T> implements IGenericService<T> {
    @Override
    public List<? extends T> findAll(Connection connection, Class<T> clazz) throws SQLException {
        List<T> list = new LinkedList<>();

        String query = "SELECT * FROM " + clazz.getSimpleName();
        System.out.println("QUERY: " + query);

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        ResultSetMetaData rsmd = rs.getMetaData();
        int maxColumn = rsmd.getColumnCount();
        while (rs.next()) {
            String result = "";
            for(int i=1; i<=maxColumn; i++){
                result = result.concat("\t").concat(rs.getString(i));
            }
            System.out.println("TEST: "  + result);

        }
        connection.close();
        return new LinkedList<T>();
    }
}
