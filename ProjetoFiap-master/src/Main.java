import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
    	  long dtInvestimento = conversaoDeDatas("2014/05/29 18:10:45");
          long dtVencimento = conversaoDeDatas("2019/09/29 18:10:45");
          long dtResgate = conversaoDeDatas("2020/10/29 18:10:45");
          long dtNascimento = conversaoDeDatas("1995/01/26 15:20:15");
          long dtDespesa = conversaoDeDatas("2018/06/18 13:00:12");
          long dtReceita = conversaoDeDatas("2017/08/24 13:59:12");
          long dtLembrete = conversaoDeDatas("2022/10/31 09:00:12");
          long hrLembrete = conversaoDeDatas("2022/10/31 09:00:12");


          Investimento investimento1 = new Investimento(1, "PRIMEIRO TESTE", 1000, new Date(dtInvestimento), new Date(dtVencimento), new Date(dtResgate), 1);
          Investimento investimento2 = new Investimento(1, "SEGUNDO TESTE", 2000, new Date(dtInvestimento), new Date(dtVencimento), new Date(dtResgate), 1);
          Investimento investimento3 = new Investimento(1, "TERCEIRO TESTE", 3000, new Date(dtInvestimento), new Date(dtVencimento), new Date(dtResgate), 1);
          Investimento investimento4 = new Investimento(1, "QUARTO TESTE", 4000, new Date(dtInvestimento), new Date(dtVencimento), new Date(dtResgate), 1);
          Investimento investimento5 = new Investimento(1, "QUINTO TESTE", 5000, new Date(dtInvestimento), new Date(dtVencimento), new Date(dtResgate), 1);

          InvestimentoDAO investimentoDAO = new InvestimentoDAO();
          investimentoDAO.Insert(investimento1);
          investimentoDAO.Insert(investimento2);
          investimentoDAO.Insert(investimento3);
          investimentoDAO.Insert(investimento4);
          investimentoDAO.Insert(investimento5);

          var listaInvestimento = investimentoDAO.getAll();
          for (var inv : listaInvestimento){
          	System.out.println("Id: " + inv.getIdInvestimento() + " Descrição: "+ inv.getDsInvestimento() + " Valor do Investimento: " + inv.getVlrInvestimento() + " Data de Investimento: " + inv.getDtInvestimento() + " Data de Vencimento: " + inv.getDtVencimento() + " Data de Resgate: " + inv.getDtResgate() + " Id do Usuário" + inv.getIdUsuario());
          
          Despesa despesa1 = new Despesa(130, "TESTE 1", 1000, new Date(dtDespesa), "TESTE", 1);	
          DespesaDAO despesaDAO = new DespesaDAO();
          despesaDAO.Insert(despesa1);
          var listaDespesa = despesaDAO.getAll();
          for (var des : listaDespesa) {
        	  System.out.println("Id: " + des.getIdDespesa() + " Descricão: " + des.getDsDespesa() + " Valor: " + des.getVlrDespesa() + " Data: " + des.getDtDespesa() + " Tipo de Despesa: " + des.getTpDespesa() + " Id Usuario: " + des.getIdUsuario());
          }
          
          Receita receita1 = new Receita(130, "TESTE 1", 6000, new Date(dtReceita), "TESTE", 1);	
          ReceitaDAO receitaDAO = new ReceitaDAO();
          receitaDAO.Insert(receita1);
          var listaReceita = receitaDAO.getAll();
          for (var rec : listaReceita) {
        	  System.out.println("Id: " + rec.getIdReceita() + " Descricão: " + rec.getDsReceita() + " Valor: " + rec.getVlrReceita() + " Data: " + rec.getDataReceita() + " Tipo de Despesa: " + rec.getTipoReceita() + " Id Usuario: " + rec.getIdUsuario());
          }

          
          Lembrete lembrete1 = new Lembrete(130, new Date(dtLembrete), new Date(hrLembrete), "TESTE", "teste", 1);	
          LembreteDAO lembreteDAO = new LembreteDAO();
          lembreteDAO.Insert(lembrete1);
          var listaLembrete = lembreteDAO.getAll();
          for (var rec : listaLembrete) {
        	  System.out.println("Id: " + rec.getIdLembrete() + " Data: " + rec.getDtLembrete() + " Hora: " + rec.getHrLembrete() + " Descrição: " + rec.getDsLembrete() + " Tipo de Lembrete: " + rec.getTpLembrete() + " Id Usuario: " + rec.getIdUsuario());
          }
          	
          	
          Usuario usuario1 = new Usuario(100, "teste", "testeEmail", new Date(dtNascimento), "senhaTeste", "11975459331", "00000000000");
          UsuarioDAO usuarioDAO = new UsuarioDAO();
          usuarioDAO.Insert(usuario1);
          
          var listaUsuario = usuarioDAO.getAll();
          
          for (var usu : listaUsuario) {
        	  System.out.println("Id: " + usu.getIdUsuario() + " Nome: " + usu.getNmUsuario() + " Email: " + usu.getDsEmail() + " Data Nasc: " + usu.getDtNascimento() + " Senha: " + usu.getSenha() + " Celular: " + usu.getNmrCelular() + " CPF: " + usu.getCpfUsuario());
          }
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