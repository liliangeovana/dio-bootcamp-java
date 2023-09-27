package escola_beans;

//NO PADRÃO JAVA BEANS  
public class Aluno {

    //NOME
    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //IDADE
    private int idade;

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
