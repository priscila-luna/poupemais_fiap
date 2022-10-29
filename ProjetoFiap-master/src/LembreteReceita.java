import java.time.LocalDateTime;
import java.util.Date;

public class LembreteReceita extends Lembrete {

    double valorDestaReceita;
    public LembreteReceita(int idLembrete,double valorDestaReceita, Date dtLembrete, LocalDateTime hrLembrete, String dsLembrete, String tpLembrete) {
        super(idLembrete, dtLembrete, hrLembrete, dsLembrete, tpLembrete);
    }
    public void EditarDescricao(String novaDescricao){
        this.setDsLembrete(novaDescricao);
    }


}