import java.util.Date;

public class Despesa {

    private int idDespesa;
    private String dsDespesa;
    private double vlrDespesa;
    private Date dtDespesa;
    private String tpDespesa;
    private int idUsuario;


    public Despesa(int idDespesa, String dsDespesa, double vlrDespesa, Date dtDespesa, String tpDespesa, int idUsuario) {
        this.setIdDespesa(idDespesa);
        this.setDsDespesa(dsDespesa);
        this.setVlrDespesa(vlrDespesa);
        this.setDtDespesa(dtDespesa);
        this.setTpDespesa(tpDespesa);
        this.setIdUsuario(idUsuario);
    }



    public int getIdDespesa() {
        return idDespesa;
    }

    public void setIdDespesa(int idDespesa) {
        this.idDespesa = idDespesa;
    }

    public String getDsDespesa() {
        return dsDespesa;
    }

    public void setDsDespesa(String dsoDespesa) {
        this.dsDespesa = dsDespesa;
    }

    public double getVlrDespesa() {
        return vlrDespesa;
    }

    public void setVlrDespesa(double vlrDespesa) {
        this.vlrDespesa = vlrDespesa;
    }

    public Date getDtDespesa() {
        return dtDespesa;
    }

    public void setDtDespesa(Date dtDespesa) {
        this.dtDespesa = dtDespesa;
    }

    public String getTpDespesa() {
        return tpDespesa;
    }

    public void setTpDespesa(String tpDespesa) {
        this.tpDespesa = tpDespesa;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }


    @Override
    public String toString() {
        return
                "idDespesa=" + idDespesa +
                        ", dsDespesa='" + dsDespesa + '\'' +
                        ", vlrDespesa=" + vlrDespesa +
                        ", dtDespesa=" + dtDespesa +
                        ", tpDespesa='" + tpDespesa + 
                        ", IdUsuario='" + idUsuario +
                        '\''
                ;
    }


}