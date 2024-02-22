import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class conectionBD{
    public static void main(String[] args) {
        Connection bd = conectarBD("world");
        System.out.println("consultas terminadas");
        Desconexion(bd);
    }

    public static Connection conectarBD(String db){
        Connection conexion;
        String host = "jdbc:mysql://localhost/";
        String user = "student";
        String password = "student";


        System.out.println("Conectando...");
        try {
            conexion = DriverManager.getConnection(host+db, user, password);
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return conexion;
    }

    public static void Desconexion(Connection desDB){

        try {
            desDB.close();
            System.out.println("Desconectando");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }
}