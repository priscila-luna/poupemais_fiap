import java.util.Date;

public class Investimento {
    private int idInvestimento;
    private String dsInvestimento;
    private double vlrInvestimento;
    private Date dtInvestimento;
    private Date dtVencimento;
    private Date dtResgate;
    private int idUsuario;

    public Investimento(int idInvestimento, String dsInvestimento, double vlrInvestimento, Date dtInvestimento, Date dtVencimento, Date dtResgate, int idUsuario) {
        this.idInvestimento = idInvestimento;
        this.dsInvestimento = dsInvestimento;
        this.vlrInvestimento = vlrInvestimento;
        this.dtInvestimento = dtInvestimento;
        this.dtVencimento = dtVencimento;
        this.dtResgate = dtResgate;
        this.idUsuario = idUsuario;
    }

    public int getIdInvestimento() {
        return idInvestimento;
    }

    public void setIdInvestimento(int idInvestimento) {
        this.idInvestimento = idInvestimento;
    }

    public String getDsInvestimento() {
        return dsInvestimento;
    }

    public void setDsInvestimento(String dsInvestimento) {
        this.dsInvestimento = dsInvestimento;
    }

    public double getVlrInvestimento() {
        return vlrInvestimento;
    }

    public void setVlrInvestimento(double vlrInvestimento) {
        this.vlrInvestimento = vlrInvestimento;
    }

    public Date getDtInvestimento() {
        return dtInvestimento;
    }

    public void setDtInvestimento(Date dtInvestimento) {
        this.dtInvestimento = dtInvestimento;
    }

    public Date getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public Date getDtResgate() {
        return dtResgate;
    }

    public void setDtResgate(Date dtResgate) {
        this.dtResgate = dtResgate;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}

