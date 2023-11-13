import com.arteli.model.Facebook;
import com.arteli.model.MSNMessenger;
import com.arteli.model.Telegram;
import com.arteli.servico.ServicoMensagem;

public class ComputadorPessoa {
    public static void main(String[] args) {

        /* NÃO SE SABE QUAL APP SERÁ ESCOLHIDO
         * MAS QUALQUER UM DEVE MANDAR E RECEBER MENSAGEM
         */

        ServicoMensagem servico = null;
        String appEscolhido = "";

        if (appEscolhido.equals("msn")){
            servico = new MSNMessenger();
        }else if
            (appEscolhido.equals("facebook")){
                servico = new Facebook();
            } 
        else if
            (appEscolhido.equals("telegram")){
                servico = new Telegram();
            }

        servico.enviarMensagem();
        servico.receberMensagem();
    }
}
