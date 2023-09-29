public class Autodromo {
    public static void main(String[] args) {
        Carro mobi = new Carro();

        //COMO USUÁRIO, PASSAR POR TODOS OS MÉTODOS NÃO É MUITO EFICIENTE
        mobi.conferindoCombustivel();
        mobi.conferindoCambio();
        mobi.ligar();

        System.out.println("----------------------------");

        //NESSE OBJETO OS MÉTODOS SÃO ENCAPSULADOS, NÃO SENDO VISÍVEIS NA MAIN E APENAS PRECISANDO LIGAR O CARRO
        CarroPrivate jeep = new CarroPrivate();
        jeep.ligar();


        System.out.println("--------------------------");

        //EXIBINDO O USO DE HERANÇA (EX: PLACA) 
        Moto honda = new Moto();

        honda.setPlaca("23545");
        System.out.println(honda.getPlaca());
        jeep.setPlaca("98756");
        honda.ligar();


        System.out.println("---------------------------------");
        //A CLASSE GENÉRICA VEICULO É ABSTRATA POIS ALGUM MÉTODO É ABSTRATO (É COMUM A AMBOS AS CLASSES, MAS MUDA O COMPORTAMENTE DEPENDENDO DO VEÍCULO)
        // ESSA MUDANÇA É O POLIFORMISMO

        Veiculo classeGenerica = honda;

        classeGenerica.ligar();
        //vai exibir a forma de ligar dependendo de qual objeto eu colocar depois do "="
        //nesse exemplo iria exibir a forma da moto ligar.

    }
}
