import java.time.LocalDate;
import java.time.LocalDateTime;

public class Lembrete {
    private int idLembrete;
    private LocalDate dataLembrete;
    private LocalDateTime horaLembrete;
    private String descricaoLembrete;
    private String tipoLembrete;
    public Lembrete(int idLembrete, LocalDate dataLembrete, LocalDateTime horaLembrete, String descricaoLembrete, String tipoLembrete) {
        this.setIdLembrete(idLembrete);
        this.setDataLembrete(dataLembrete);
        this.setHoraLembrete(horaLembrete);
        this.setDescricaoLembrete(descricaoLembrete);
        this.setTipoLembrete(tipoLembrete);
    }
    public void setIdLembrete(int idLembrete){
        this.idLembrete = idLembrete;
    }

    public void setDataLembrete(LocalDate dataLembrete){
        this.dataLembrete = dataLembrete;
    }

    public void setHoraLembrete(LocalDateTime horaLembrete){
        this.horaLembrete = horaLembrete;
    }
    public void setDescricaoLembrete(String descricaoLembrete){
        this.descricaoLembrete = descricaoLembrete;
    }

    public void setTipoLembrete(String tipoLembrete){
        this.tipoLembrete = tipoLembrete;
    }

    public int getIdLembrete(){
        return idLembrete;
    }

    public LocalDate getDataLembrete(){
        return dataLembrete;
    }

    public LocalDateTime getHoraLembrete(){
        return horaLembrete;
    }

    public String getDescricaoLembrete(){
        return descricaoLembrete;
    }

    public String getTipoLembrete(){
        return tipoLembrete;
    }

    @Override
    public String toString(){
        return
                "idLembrete=" + idLembrete +
                        ", dataLembrete='" + dataLembrete + '\'' +
                        ", horaLembrete='" + horaLembrete +
                        ", descricaoLembrete=" + descricaoLembrete +
                        ", tipoLembrete=" + tipoLembrete + '\''
                ;

    }
}