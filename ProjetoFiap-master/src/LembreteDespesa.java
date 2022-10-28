import java.time.LocalDate;
import java.time.LocalDateTime;

public class LembreteDespesa extends Lembrete {

    double valorDestaReceita;
    public LembreteDespesa(int idLembrete, double valorDestaReceita, LocalDate dataLembrete, LocalDateTime horaLembrete, String descricaoLembrete, String tipoLembrete) {
        super(idLembrete, dataLembrete, horaLembrete, descricaoLembrete, tipoLembrete);
    }

    public void EditarDescricao(String novaDescricao){
        this.setDescricaoLembrete(novaDescricao);
    }

}