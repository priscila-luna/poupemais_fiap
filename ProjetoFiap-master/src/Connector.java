import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {

    public static Connection conectar(){
        Connection conexao = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","RM95074","261095");
        } catch (Exception e){
            e.printStackTrace();
        }
        return conexao;
    } 
}
