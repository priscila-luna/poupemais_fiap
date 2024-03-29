import java.sql.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class InvestimentoDAO {
    private Connection conexao;

    public void Insert(Investimento investimento){
        PreparedStatement stmt = null;
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");

        try{
            conexao = Connector.conectar();
            String sql = "INSERT INTO T_INVESTIMENTO (DS_INVESTIMENTO, VLR_INVESTIMENTO, DT_INVESTIMENTO, ID_USUARIO,\n" +
                    "DT_VENCIMENTO, DT_RESGATE) VALUES(?,?,?,?,?,?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, investimento.getDsInvestimento());
            stmt.setDouble(2, investimento.getVlrInvestimento());
            Date dataInvestimento = Date.valueOf(formatter.format(investimento.getDtInvestimento()));
            stmt.setDate(3, dataInvestimento);
            stmt.setInt(4, investimento.getIdUsuario());
            Date dataVencimento = Date.valueOf(formatter.format(investimento.getDtVencimento()));
            stmt.setDate(5, dataVencimento);
            Date dataResgate = Date.valueOf(formatter.format(investimento.getDtResgate()));
            stmt.setDate(6, dataResgate);

            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conexao.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public List<Investimento> getAll(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Investimento> lista = new ArrayList<Investimento>();

        try{
            conexao = Connector.conectar();

            String sql = "SELECT * FROM T_INVESTIMENTO";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();


            while (rs.next()){
	            int codigo = rs.getInt("ID_INVESTIMENTO");
	            String dsInvestimento = rs.getString("DS_INVESTIMENTO");
	            double vlrInvestimento = rs.getDouble("VLR_INVESTIMENTO");
	            java.sql.Date dtInvestimento = rs.getDate("DT_INVESTIMENTO");
	            java.sql.Date dtVencimento = rs.getDate("DT_INVESTIMENTO");
	            java.sql.Date dtResgate = rs.getDate("DT_RESGATE");
	            int idUsuario = rs.getInt("ID_USUARIO");
	            Investimento investimento = new Investimento(codigo, dsInvestimento, vlrInvestimento, dtInvestimento, dtVencimento, dtResgate, idUsuario);
	            lista.add(investimento);
            }


        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                rs.close();
                conexao.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        return lista;
    }
}