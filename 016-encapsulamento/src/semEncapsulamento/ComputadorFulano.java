package semEncapsulamento;

public class ComputadorFulano {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();

        //SEM ENCAPSULAMENTO, O USUÁRIO PRECISA REALIZAR TODAS ESSAS AÇÕES
        msn.validandoConexao();
        msn.enviarMensagem();
        msn.salvarHistoricoMensagens();
        msn.receberMensagem();
        
    }
}
