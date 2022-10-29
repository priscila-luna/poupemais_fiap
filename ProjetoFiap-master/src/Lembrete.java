import java.util.Date;

public class Lembrete {
    private int idLembrete;
    private Date dtLembrete;
    private Date hrLembrete;
    private String dsLembrete;
    private String tpLembrete;
    private int idUsuario;
    
    public Lembrete(int idLembrete, Date dtLembrete, Date hrlembrete, String dsLembrete, String tpLembrete, int idUsuario) {
        this.setIdLembrete(idLembrete);
        this.setDtLembrete(dtLembrete);
        this.setHrLembrete(hrLembrete);
        this.setDsLembrete(dsLembrete);
        this.setTpLembrete(tpLembrete); 
        this.setIdUsuario(idUsuario);
    } 
    public void setIdLembrete(int idLembrete){
        this.idLembrete = idLembrete;
    }

    public void setDtLembrete(Date dtLembrete){
        this.dtLembrete = dtLembrete;
    }

    public void setHrLembrete(Date hrLembrete){
        this.hrLembrete = hrLembrete;
    }
    public void setDsLembrete(String dsLembrete){
        this.dsLembrete = dsLembrete;
    }

    public void setTpLembrete(String tpLembrete){
        this.tpLembrete = tpLembrete;
    }
    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }

    public int getIdLembrete(){
        return idLembrete;
    }

    public Date getDtLembrete(){
        return dtLembrete;
    }

    public Date getHrLembrete(){
        return hrLembrete;
    }

    public String getDsLembrete(){
        return dsLembrete;
    }

    public String getTpLembrete(){
        return tpLembrete;
    }
    
    public int getIdUsuario(){
        return idUsuario;
    }


    @Override
    public String toString(){
        return
                "idLembrete=" + idLembrete +
                        ", dataLembrete='" + dtLembrete + '\'' +
                        ", horaLembrete='" + hrLembrete +
                        ", descricaoLembrete=" + dsLembrete +
                        ", tipoLembrete=" + tpLembrete + "idUsuario=" + idUsuario + '\''
                ;

    }
}