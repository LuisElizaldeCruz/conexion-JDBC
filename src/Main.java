import java.sql.*;
class Main {

    public static void main(String[] args) {
        connectionDB con = new connectionDB();
        CrudOperations crO = new CrudOperations();

        Connection bd = con.conectarBD("world");
        crO.consulta(bd);
        con.desconexion(bd);
    }


}