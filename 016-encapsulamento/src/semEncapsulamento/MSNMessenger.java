package semEncapsulamento;

public class MSNMessenger {

    //NENHUM MÉTODO PRIVATE, NEM TODOS PRECISAM SER VISTOS PELO USUÁRIO
    public void enviarMensagem(){
        System.out.println("Enviando mensagem!");
    }

    public void receberMensagem(){
        System.out.println("Você recebeu uma mensagem!");
    }

    public void validandoConexao(){
        System.out.println("Verificando conexão com a internet");
    }

    public void salvarHistoricoMensagens(){
        System.out.println("Salvando histórico de mensagens.");
    }
}
