import java.util.Date;


public class Receita {
    private int idReceita;
    private String dsReceita;
    private double vlrReceita;
    private Date dtReceita;
    private String tpReceita;

    public Receita(int idReceita, String dsReceita, double vlrReceita, Date dtReceita, String tpReceita) {
        this.setIdReceita(idReceita);
        this.setDsReceita(dsReceita);
        this.setVlrReceita(vlrReceita);
        this.setDtReceita(dtReceita);
        this.setTpReceita(tpReceita);
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

    @Override
    public String toString() {
        return
                "idReceita=" + idReceita +
                        ", descricaoReceita='" + dsReceita + '\'' +
                        ", valorReceita=" + vlrReceita +
                        ", dataReceita=" + dtReceita +
                        ", tipoReceita='" + tpReceita + '\''
                ;
    }
}
