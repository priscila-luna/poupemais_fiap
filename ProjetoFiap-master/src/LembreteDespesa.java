import java.util.Date;
import java.time.LocalDateTime;

public class LembreteDespesa extends Lembrete {

    double valorDestaDespesa;
    public LembreteDespesa(int idLembrete, double valorDestaReceita, Date dtLembrete, LocalDateTime hrLembrete, String dsLembrete, String tpLembrete) {
        super(idLembrete, dtLembrete, hrLembrete, dsLembrete, tpLembrete);
    }

    public void EditarDescricao(String novaDescricao){
        this.setDsLembrete(novaDescricao);
    } 

}