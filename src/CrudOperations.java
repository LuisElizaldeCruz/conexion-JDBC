import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOperations {
    public static void consulta(Connection con){
        //variables para la base de datos
        int id, population;
        String name, district, countryCode;

        String sql = "SELECT * FROM city WHERE countrycode = 'AFG' AND population > 150000";
        Statement stmt;
        ResultSet rs;

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.printf("%-10s %-15s %-15s %-15s %-10s%n", "id", "name", "countryCode", "district", "population");

            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                countryCode = rs.getString("countryCode");
                district = rs.getString("district");
                population = rs.getInt("population");

                System.out.printf("%-10s %-15s %-15s %-15s %-10s%n", id, name, countryCode, district, population);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void insertUser(Connection con, String name, String password){

    }
}
