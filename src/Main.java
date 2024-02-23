import java.sql.*;
class Main {

    public static void main(String[] args) {
        connectionDB con = new connectionDB();
        CrudOperations crOp = new CrudOperations();
        Connection bd = con.conectarBD("carros");

        try {
            crOp.read(bd);
            Thread.sleep(2000);
            crOp.insertUser(bd,"silverado",2020, "azul");
            con.desconexion(bd);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }
}