public class Escola {
    public static void main (String[] args) throws Exception {

        //objeto 1
        Estudante estudante1 = new Estudante();
        estudante1.nome ="Fulano";
        estudante1.idade = 13;
        estudante1.cor = Cor.FAIR;
        estudante1.sexo = Sexo.MALE;

        //objeto 2
        Estudante estudante2 = new Estudante();
        estudante2.nome ="Ciclano";
        estudante2.idade = 11;
        estudante2.cor = Cor.FAIR;
        estudante2.sexo = Sexo.MALE;

        //objeto 3
        Estudante estudante3 = new Estudante();
        estudante3.nome ="Beltrana";
        estudante3.idade = 12;
        estudante3.cor = Cor.FAIR;
        estudante3.sexo = Sexo.FEMALE;
    }

}