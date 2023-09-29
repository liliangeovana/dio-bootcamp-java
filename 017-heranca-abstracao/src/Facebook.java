public class Facebook extends ServicoMensagem {

    public void enviarMensagem(){
        verificarConexao();
        System.out.println("Enviando mensagem pelo Facebook");
        salvarHistorico();
    }

    public void receberMensagem(){
        System.out.println("Recebendo uma mensagem no Facebook!");
        salvarHistorico();
    } 
}
