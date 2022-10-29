import java.util.Date;

public class Usuario {
    private int idUsuario;
    private String nmUsuario;
    private String dsEmail;
    private Date dtNascimento;
    private String senha;
    private int nmrCelular;
    private String cpfUsuario;

    public Usuario(int idUsuario, String nmUsuario, String dsEmail, Date dtNascimento, String senha, int nmrCelular, String cpfUsuario) {
        this.idUsuario = idUsuario;
        this.nmUsuario = nmUsuario;
        this.dsEmail = dsEmail;
        this.dtNascimento = dtNascimento;
        this.senha = senha;
        this.nmrCelular = nmrCelular;
        this.cpfUsuario = cpfUsuario;
    }


    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNmUsuario() {
        return nmUsuario;
    }

    public void setNmUsuario(String nmUsuario) {
        this.nmUsuario = nmUsuario;
    }

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDs_email(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNmrCelular() {
        return nmrCelular;
    }

    public void setNmrCelular(int nmrCelular) {
        this.nmrCelular = nmrCelular;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpf_usuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }
}
