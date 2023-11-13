public abstract class ServicoMensagem{

    //Abstratc torna esse serviço geral para todos os sistemas
    //Permite definir como cada um envia e recebe a própria mensagem
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    public void verificarConexao(){
        System.out.println("Verificando conexão com a internet");
    }

    public void salvarHistorico(){
        System.out.println("Salvando histórico de mensagens");
    }
}