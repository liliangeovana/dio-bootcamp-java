package comEncapsulamento;

public class MSNMessenger {
    
    public void enviarMensagem(){
        verificarConexao();
        System.out.println("Enviando mensagem!");
        salvarHistorico();
    }

    public void receberMensagem(){
        verificarConexao();
        System.out.println("Você recebeu uma mensagem!");
        salvarHistorico();
    }

    //VISÍVEIS APENAS PARA A CLASS MSN
    private void verificarConexao(){
        System.out.println("Verificando se há conexão com a internet");
    }

    private void salvarHistorico(){
        System.out.println("Salvando mensagens");
    }
}
