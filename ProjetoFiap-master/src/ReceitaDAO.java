import java.sql.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ReceitaDAO {
	private Connection conexao;
	
	public void Insert(Receita receita) {
		PreparedStatement stmt = null;
		Format formatter = new SimpleDateFormat("yyy-MM-dd");
		
		try {
			conexao = Connector.conectar();
			String sql = "INSERT INTO T_RECEITA (DS_RECEITA, VLR_RECEITA, DT_RECEITA, TP_RECEITA, ID_USUARIO) VALUES (?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, receita.getDsReceita());
			stmt.setDouble(2, receita.getVlrReceita());
            Date dtReceita = Date.valueOf(formatter.format(receita.getDataReceita()));
            stmt.setDate(3, dtReceita);
            stmt.setString(4, receita.getDsReceita());
            stmt.setInt(5, receita.getIdUsuario() );
            
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
	
	public List<Receita> getAll(){
		PreparedStatement stmt =null;
		ResultSet rs = null;
		List<Receita> listaReceita = new ArrayList<Receita>();
		
		try {
			conexao = Connector.conectar();
			
			String sql = "SELECT * T_RECEITA";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				int idReceita = rs.getInt("ID_RECEITA");
				String dsReceita = rs.getString("DS_RECEITA");
				double vlrReceita = rs.getInt("VLR_RECEITA");
				java.sql.Date dtReceita = rs.getDate("DT_RECEITA");
				String tpReceita = rs.getString("TP_RECEITA");
				int idUsuario = rs.getInt("ID_USUARIO");
				Receita receita = new Receita(idReceita, dsReceita, vlrReceita, dtReceita, tpReceita, idUsuario);
				listaReceita.add(receita);

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
      return listaReceita;
  }
}