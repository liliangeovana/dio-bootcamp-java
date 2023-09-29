
//CLASSE COM DADOS EM COMUM PARA CARRO E MOTO, NÃO PRECISANDO REPETIR ATRIBUTOS EM CADA CLASSE

public abstract class Veiculo {

//A CLASSE É ABSTRACT POIS NÃO SABE COMO TUDO OU ALGUMAS COISAS ACONTECEM
//EX: CARRO E MOTO PRECISAM LIGAR (COMUM), MAS PODEM SER FEITOS DE FORMAS DIFERENTES ENTRE SI (O QUE TORNA ABSTRATO)

    public String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //COMUM EM MOTO E CARRO, MAS ABSTRACT POIS SÃO FORMAS DIFERENTES
    public abstract void ligar();
}
