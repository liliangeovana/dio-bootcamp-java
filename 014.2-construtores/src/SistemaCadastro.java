public class SistemaCadastro {
    public static void main(String[] args) {

        //Objeto já criado com os parâmetros do construtor
        Pessoa marcos = new Pessoa ("Marcos", "123");

        System.out.println("O nome é "+marcos.getNome()+ " e o cpf é "+marcos.getCpf());
    }
}
