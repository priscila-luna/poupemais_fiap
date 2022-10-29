import java.util.Date;
import java.time.LocalDateTime;

public class Lembrete {
    private int idLembrete;
    private Date dtLembrete;
    private LocalDateTime hrLembrete;
    private String dsLembrete;
    private String tpLembrete;
    public Lembrete(int idLembrete, Date dtLembrete, LocalDateTime hrlembrete, String dsLembrete, String tpLembrete) {
        this.setIdLembrete(idLembrete);
        this.setDtLembrete(dtLembrete);
        this.setHrLembrete(hrLembrete);
        this.setDsLembrete(dsLembrete);
        this.setTpLembrete(tpLembrete);
    }
    public void setIdLembrete(int idLembrete){
        this.idLembrete = idLembrete;
    }

    public void setDtLembrete(Date dtLembrete){
        this.dtLembrete = dtLembrete;
    }

    public void setHrLembrete(LocalDateTime hrLembrete){
        this.hrLembrete = hrLembrete;
    }
    public void setDsLembrete(String dsLembrete){
        this.dsLembrete = dsLembrete;
    }

    public void setTpLembrete(String tpLembrete){
        this.tpLembrete = tpLembrete;
    }

    public int getIdLembrete(){
        return idLembrete;
    }

    public Date getDataLembrete(){
        return dtLembrete;
    }

    public LocalDateTime getHoraLembrete(){
        return hrLembrete;
    }

    public String getDsLembrete(){
        return dsLembrete;
    }

    public String getTpLembrete(){
        return tpLembrete;
    }

    @Override
    public String toString(){
        return
                "idLembrete=" + idLembrete +
                        ", dataLembrete='" + dtLembrete + '\'' +
                        ", horaLembrete='" + hrLembrete +
                        ", descricaoLembrete=" + dsLembrete +
                        ", tipoLembrete=" + tpLembrete + '\''
                ;

    }
}