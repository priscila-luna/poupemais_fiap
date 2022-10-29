import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.sql.*;


public class UsuarioDAO {

    private Connection conexao;

    public void Insert(Usuario usuario){
        PreparedStatement stmt = null;
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");

        try{
            conexao = Connector.conectar();
            String sql = "INSERT INTO T_USUARIO(NM_USUARIO, DS_EMAIL, DT_NASCIMENTO, SENHA, NMR_CELULAR, CPF_USUARIO) VALUES(?,?,?,?,?,?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuario.getNmUsuario());
            stmt.setString(2,usuario.getDsEmail());
            Date dtNascimento = Date.valueOf(formatter.format(usuario.getDtNascimento()));
            stmt.setDate(3, dtNascimento);
            stmt.setString(4, usuario.getSenha());
            stmt.setInt(5, usuario.getNmrCelular());
            stmt.setString(6, usuario.getCpfUsuario());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Usuario get(int idUsuario) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        try {
            conexao = Connector.conectar();
            String sql = "SELECT * FROM T_USUARIO WHERE ID_USUARIO = ?";
            stmt.setInt(1, idUsuario);
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
	            String nmUsuario = rs.getString("NM_USUARIO");
	            String dsEmail = rs.getString("DS_EMAIL");
	            java.sql.Date dtNascimento = rs.getDate("DT_NASCIMENTO");
	            String senha = rs.getString("SENHA");
	            int nmrCelular = rs.getInt("NMR_CELULAR");
	            String cpfUsuario = rs.getString("CPF_USUARIO");
	            usuario = new Usuario(idUsuario, nmUsuario, dsEmail, dtNascimento, senha, nmrCelular, cpfUsuario);

	            stmt.executeUpdate();
	        }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return usuario;
    }

    public List<Usuario> getAll() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            conexao = Connector.conectar();
            String sql = "SELECT * FROM T_USUARIO";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()){

                int idUsuario = rs.getInt("ID_USUARIO");
                String nmUsuario = rs.getString("NM_USUARIO");
                String dsEmail = rs.getString("DS_EMAIL");
                Date dtNascimento = rs.getDate("DT_NASCIMENTO");
                String senha = rs.getString("SENHA");
                int nmrCelular = rs.getInt("NMR_CELULAR");
                String cpfUsuario = rs.getString("CPF_USUARIO");

                Usuario usuario = new Usuario(idUsuario, nmUsuario, dsEmail, dtNascimento, senha, nmrCelular, cpfUsuario);
                usuarios.add(usuario);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return usuarios;
    }
}
