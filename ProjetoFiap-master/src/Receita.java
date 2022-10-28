import java.time.LocalDate;

public class Receita {
    private int idReceita;
    private String descricaoReceita;
    private double valorReceita;
    private LocalDate dataReceita;
    private String tipoReceita;

    public Receita(int idReceita, String descricaoReceita, double valorReceita, LocalDate dataReceita, String tipoReceita) {
        this.setIdReceita(idReceita);
        this.setDescricaoReceita(descricaoReceita);
        this.setValorReceita(valorReceita);
        this.setDataReceita(dataReceita);
        this.setTipoReceita(tipoReceita);
    }

    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

    public void setDescricaoReceita(String descricaoReceita) {
        this.descricaoReceita = descricaoReceita;
    }

    public void setValorReceita(double valorReceita) {
        this.valorReceita = valorReceita;
    }

    public void setDataReceita(LocalDate dataReceita) {
        this.dataReceita = dataReceita;
    }

    public void setTipoReceita(String tipoReceita) {
        this.tipoReceita = tipoReceita;
    }

    public int getIdReceita() {
        return idReceita;
    }

    public String getDescricaoReceita() {
        return descricaoReceita;
    }

    public double getValorReceita() {
        return valorReceita;
    }

    public LocalDate getDataReceita() {
        return dataReceita;
    }

    public String getTipoReceita() {
        return tipoReceita;
    }

    @Override
    public String toString() {
        return
                "idReceita=" + idReceita +
                        ", descricaoReceita='" + descricaoReceita + '\'' +
                        ", valorReceita=" + valorReceita +
                        ", dataReceita=" + dataReceita +
                        ", tipoReceita='" + tipoReceita + '\''
                ;
    }
}
