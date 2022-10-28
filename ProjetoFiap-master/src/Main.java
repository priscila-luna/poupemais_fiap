import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
    	  long dtInvestimento = conversaoDeDatas("2014/10/29 18:10:45");

          long dtVencimento = conversaoDeDatas("2019/10/29 18:10:45");

          long dataResgate = conversaoDeDatas("2020/10/29 18:10:45");

          Investimento investimento1 = new Investimento(1, "PRIMEIRO TESTE", 1000, new Date(dtInvestimento), new Date(dtVencimento), new Date(dataResgate), 1);
          Investimento investimento2 = new Investimento(1, "SEGUNDO TESTE", 2000, new Date(dtInvestimento), new Date(dtVencimento), new Date(dataResgate), 1);
          Investimento investimento3 = new Investimento(1, "TERCEIRO TESTE", 3000, new Date(dtInvestimento), new Date(dtVencimento), new Date(dataResgate), 1);
          Investimento investimento4 = new Investimento(1, "QUARTO TESTE", 4000, new Date(dtInvestimento), new Date(dtVencimento), new Date(dataResgate), 1);
          Investimento investimento5 = new Investimento(1, "QUINTO TESTE", 5000, new Date(dtInvestimento), new Date(dtVencimento), new Date(dataResgate), 1);

          InvestimentoDAO investimentoDAO = new InvestimentoDAO();
          investimentoDAO.Insert(investimento1);
          investimentoDAO.Insert(investimento2);
          investimentoDAO.Insert(investimento3);
          investimentoDAO.Insert(investimento4);
          investimentoDAO.Insert(investimento5);

          var listaInvestimento = investimentoDAO.getAll();
          
          for (var inv : listaInvestimento){
          	System.out.println("Id: " + inv.getIdInvestimento() + " Descrição: "+ inv.getDsInvestimento() + " Valor do Investimento: " + inv.getVlrInvestimento() + " Data de Investimento: " + inv.getDtInvestimento() + " Data de Vencimento: " + inv.getDtVencimento() + " Data de Resgate: " + inv.getDtResgate() + " Id do Usuário" + inv.getIdUsuario());
          }

      }


      public static long conversaoDeDatas(String data) {
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
          long dataTraduzida = 0;
          try {
              Date dataComparser = sdf.parse(data);
              dataTraduzida = dataComparser.getTime();

          } catch (ParseException e) {
              e.printStackTrace();
          }
          return dataTraduzida;
      }

}