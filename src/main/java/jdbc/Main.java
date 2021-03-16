package jdbc;

import jdbc.dao.entity.Auto;
import jdbc.dao.entity.Zolika;
import jdbc.dbutils.ConnectionUtil;
import jdbc.services.GenericDatabaseServices;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
            try {
                Connection newConnection = new ConnectionUtil.Builder()
                        .withDatabaseKey("db.name")
                        .withPortKey("db.port")
                        .withUsernameKey("db.username")
                        .withPasswordKey("db.password")
                        .build();

                new GenericDatabaseServices<Auto>().findAll(newConnection, Auto.class);

                System.out.println("Connection open: " + newConnection.isClosed());
            /*List<Zolika> zolikaList = listEmployeeNames(newConnection);

            System.out.println("List: " + zolikaList.size());
            System.out.println("___________Iteration________");
            zolikaList.stream().forEach(x->System.out.println(x.toString()));*/

                //  newConnection.close();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    public static List<Zolika> listEmployeeNames(Connection c) {
        try (
                Connection conn = c;
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from zolika")
        ) {
            List<Zolika> names = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("thing");
                String name2 = rs.getString("thing2");
                names.add(new Zolika(id,name,name2));
            }
            PreparedStatement pst = conn.prepareStatement("INSERT INTO zolika(thing,thing2) VALUES (?,?)");
            pst.setString(1,"Robi");
            pst.setString(2,"Csore");
            pst.executeUpdate();
            return names;
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select zolikas", se);
        }
    }
}
