package comEncapsulamento;

public class ComputadorPessoa {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();

        //COM EMCAPSULAMENTO, O USUÁRIO É RESPONSÁVEL APENAS POR ESSAS AÇÕES
        msn.enviarMensagem();
        msn.receberMensagem();
    }
}
