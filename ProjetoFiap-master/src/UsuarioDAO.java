import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class UsuarioDAO {

    private Connection conexao;

    public void Insert(Usuario usuario){
        PreparedStatement stmt = null;
        try{
            conexao = Connector.conectar();
            String sql = "INSERT INTO T_USUARIO(NM_USUARIO, DS_EMAIL, DT_NASCIMENTO, SENHA, NMR_CELULAR, CPF_USUARIO) VALUES(?,?,?,?,?,?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1,usuario.getIdUsuario());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Usuario get(int id_usuario) {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Calendar c = Calendar.getInstance();
        DateFormat f = DateFormat.getDateInstance();


        Usuario usuario = null;
        try {
            conexao = Connector.conectar();
            String sql = "SELECT * FROM T_USUARIO WHERE ID_USUARIO = ?";
            stmt.setInt(1, id_usuario);
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
//            int id = rs.getInt("ID_USUARIO");
//            String nmUsuario = rs.getString("NM_USUARIO");
//            String dsEmail = rs.getString("DS_EMAIL");
//            java.sql.Date dtNascimento = rs.getDate("DT_NASCIMENTO");
//            
//            Date dtNascimento1 = Date.valueOf(usuario.getDtInvestimento().toString());
//            stmt.setDate(3, dataInvestimento);
//            
//            Date dtNascimento1 = f.parse();
//            
//            String senha = rs.getString("SENHA");
//            int nmrCelular = rs.getInt("NMR_CELULAR");
//            String cpfUsuario = rs.getString("CPF_USUARIO");
//
//
//            usuario = new Usuario(id, nmUsuario, dsEmail, dtNascimento1, senha, nmrCelular, cpfUsuario);

            stmt.executeUpdate();
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

    public List<Usuario> getAll(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            conexao = Connector.conectar();
            String sql = "";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()){

                int idUsuario = rs.getInt("idUsuario");
                String nmUsuario = rs.getString("nmUsuario");
                String dsEmail = rs.getString("dsEmail");
                Date dtNascimento = rs.getDate("dtNascimento");
                String senha = rs.getString("senha");
                int nmrCelular = rs.getInt("nmrCelular");
                String cpfUsuario = rs.getString("cpfUsuario");

//                Usuario usuario = new Usuario(idUsuario, nmUsuario, dsEmail, dtNascimento, senha, nmrCelular, cpfUsuario);
//                usuarios.add(usuario);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return usuarios;
    }

}
