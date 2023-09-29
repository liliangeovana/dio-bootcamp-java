public class CarroPrivate extends Veiculo{
    
//"extends" permite a herança entre a classe carro e a veiculo

    public void ligar(){

        verificandoCambio();
        verificandoCombustivel();
        System.out.println("Aqui precisei só ligar o carro");
    }

    private void verificandoCombustivel(){
        System.out.println("Conferindo combustivel");
    }

    private void verificandoCambio(){
        System.out.println("Conferindo o câmbio");
    }
    
}
