import java.time.LocalDate;

public class Despesa {

    private int idDespesa;
    private String descricaoDespesa;
    private double valorDespesa;
    private LocalDate dataDespesa;
    private String tipoDespesa;


    public Despesa(int idDespesa, String descricaoDespesa, double valorDespesa, LocalDate dataDespesa, String tipoDespesa) {
        this.setIdDespesa(idDespesa);
        this.setDescricaoDespesa(descricaoDespesa);
        this.setValorDespesa(valorDespesa);
        this.setDataDespesa(dataDespesa);
        this.setTipoDespesa(tipoDespesa);
    }



    public int getIdDespesa() {
        return idDespesa;
    }

    public void setIdDespesa(int idDespesa) {
        this.idDespesa = idDespesa;
    }

    public String getDescricaoDespesa() {
        return descricaoDespesa;
    }

    public void setDescricaoDespesa(String descricaoDespesa) {
        this.descricaoDespesa = descricaoDespesa;
    }

    public double getValorDespesa() {
        return valorDespesa;
    }

    public void setValorDespesa(double valorDespesa) {
        this.valorDespesa = valorDespesa;
    }

    public LocalDate getDataDespesa() {
        return dataDespesa;
    }

    public void setDataDespesa(LocalDate dataDespesa) {
        this.dataDespesa = dataDespesa;
    }

    public String getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }


    @Override
    public String toString() {
        return
                "idDespesa=" + idDespesa +
                        ", descricaoDespesa='" + descricaoDespesa + '\'' +
                        ", valorDespesa=" + valorDespesa +
                        ", dataDespesa=" + dataDespesa +
                        ", tipoDespesa='" + tipoDespesa + '\''
                ;
    }


}