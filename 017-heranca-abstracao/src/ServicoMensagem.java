public abstract class ServicoMensagem{

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    public void verificarConexao(){
        System.out.println("Verificando conexão com a internet");
    }

    public void salvarHistorico(){
        System.out.println("Salvando histórico de mensagens");
    }
}