import java.util.Date;


public class Receita {
    private int idReceita;
    private String dsReceita;
    private double vlrReceita;
    private Date dtReceita;
    private String tpReceita;
    private int idUsuario;

    public Receita(int idReceita, String dsReceita, double vlrReceita, Date dtReceita, String tpReceita, int idUsuario) {
        this.setIdReceita(idReceita);
        this.setDsReceita(dsReceita);
        this.setVlrReceita(vlrReceita);
        this.setDtReceita(dtReceita);
        this.setTpReceita(tpReceita);
        this.setIdUsuario(idUsuario);
    }

    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

    public void setDsReceita(String dsReceita) {
        this.dsReceita = dsReceita;
    }

    public void setVlrReceita(double vlrReceita) {
        this.vlrReceita = vlrReceita;
    }

    public void setDtReceita(Date dtReceita) {
        this.dtReceita = dtReceita;
    }

    public void setTpReceita(String tpReceita) {
        this.tpReceita = tpReceita;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdReceita() {
        return idReceita;
    }

    public String getDsReceita() {
        return dsReceita;
    }

    public double getVlrReceita() {
        return vlrReceita;
    }

    public Date getDataReceita() {
        return dtReceita;
    }

    public String getTipoReceita() {
        return tpReceita;
    }
    public int getIdUsuario() {
        return idUsuario;
    }


    @Override
    public String toString() {
        return
                "idReceita=" + idReceita +
                        ", descricaoReceita='" + dsReceita + '\'' +
                        ", valorReceita=" + vlrReceita +
                        ", dataReceita=" + dtReceita +
                        ", tipoReceita='" + tpReceita +  idReceita + '\''
                ;
    }
}
