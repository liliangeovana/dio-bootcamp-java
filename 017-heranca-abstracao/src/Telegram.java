public class Telegram extends ServicoMensagem {

    public void enviarMensagem(){
        verificarConexao();
        System.out.println("Enviando mensagem pelo Telegram!");
        salvarHistorico();
    }

    public void receberMensagem(){
        System.out.println("Recebendo uma mensagem no Telegram!");
        salvarHistorico();
    }
    
}
