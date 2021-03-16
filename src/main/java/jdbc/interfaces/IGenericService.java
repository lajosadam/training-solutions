package jdbc.interfaces;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface IGenericService<T> {

    List<? extends T> findAll(Connection connection, Class<T> clazz) throws SQLException;

}
