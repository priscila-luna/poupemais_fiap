import java.sql.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DespesaDAO {
	private Connection conexao;
	
	public void Insert(Despesa despesa) {
		PreparedStatement stmt = null;
		Format formatter = new SimpleDateFormat("yyy-MM-dd");
		
		try {
			conexao = Connector.conectar();
			String sql = "INSERT INTO T_DESPESA (DS_DESPESA, VLR_DESPESA, DT_DESPESA, TP_DESPESA, ID_USUARIO) VALUES (?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, despesa.getDsDespesa());
			stmt.setDouble(2, despesa.getVlrDespesa());
            Date dataDespesa = Date.valueOf(formatter.format(despesa.getDtDespesa()));
            stmt.setDate(3, dataDespesa);
            stmt.setString(4, despesa.getDsDespesa());
            stmt.setInt(5, despesa.getIdUsuario() );
            
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
	
	public List<Despesa> getAll(){
		PreparedStatement stmt =null;
		ResultSet rs = null;
		List<Despesa> listaDespesa = new ArrayList<Despesa>();
		
		try {
			conexao = Connector.conectar();
			
			String sql = "SELECT * T_DESPESA";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				int idDespesa = rs.getInt("ID_DESPESA");
				String dsDespesa = rs.getString("DS_DESPESA");
				double vlrDespesa = rs.getInt("VLR_DESPESA");
				java.sql.Date dtDespesa = rs.getDate("DT_DESPESA");
				String tpDespesa = rs.getString("TP_DESPESA");
				int idUsuario = rs.getInt("ID_USUARIO");
				Despesa despesa = new Despesa(idDespesa, dsDespesa, vlrDespesa, dtDespesa, tpDespesa, idUsuario);
			}
	} catch (SQLException e) {
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
      return listaDespesa;
  }
}