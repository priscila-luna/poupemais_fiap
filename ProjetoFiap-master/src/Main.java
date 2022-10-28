import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Investimento investimento = new Investimento(1, "SEGUNDO TESTE", 1000, new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()), 1);

        InvestimentoDAO investimentoDAO = new InvestimentoDAO();
        investimentoDAO.Insert(investimento);
        
        var listaInvestimento = investimentoDAO.getAll();
        
        System.out.println(listaInvestimento);

    }



}