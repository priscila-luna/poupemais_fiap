import java.sql.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class LembreteDAO {
	private Connection conexao;
	
	public void Insert(Lembrete lembrete) {
		PreparedStatement stmt = null;
		Format formatter = new SimpleDateFormat("yyy-MM-dd");
		try {
			conexao = Connector.conectar();
			String sql = "INSERT INTO T_LEMBRETE (DT_LEMBRETE, HR_LEMBRETE, DS_LEMBRETE, TP_LEMBRETE, ID_USUARIO) VALUES (?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
            Date dtLembrete = Date.valueOf(formatter.format(lembrete.getDtLembrete()));
            stmt.setDate(1, dtLembrete);
            Date hrLembrete = Date.valueOf(formatter.format(lembrete.getHrLembrete()));
            stmt.setDate(2, hrLembrete);
			stmt.setString(3, lembrete.getDsLembrete());
			stmt.setString(4, lembrete.getTpLembrete());
            stmt.setInt(5, lembrete.getIdUsuario());
            
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
	public List<Lembrete> getAll(){
		PreparedStatement stmt =null;
		ResultSet rs = null;
		List<Lembrete> listaLembrete = new ArrayList<Lembrete>();
		
		try {
			conexao = Connector.conectar();
			
			String sql = "SELECT * T_LEMBRETE";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				int idLembrete = rs.getInt("ID_LEMBRETE");
				java.sql.Date dtLembrete = rs.getDate("DT_LEMBRETE");
				java.sql.Date hrLembrete = rs.getDate("HR_LEMBRETE");
				String dsLembrete = rs.getString("DS_LEMBRETE");
				String tpLembrete = rs.getString("TP_LEMBRETE");
				int idUsuario = rs.getInt("ID_USUARIO");
				Lembrete lembrete = new Lembrete(idLembrete, dtLembrete, hrLembrete, dsLembrete, tpLembrete, idUsuario);
				listaLembrete.add(lembrete);

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
      return listaLembrete;
  }
}
		