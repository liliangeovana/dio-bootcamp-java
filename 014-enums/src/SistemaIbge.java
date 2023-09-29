public class SistemaIbge {
    public static void main(String[] args) {
        //QUERO SABER TODOS OS ESTADOS CADASTRADOS; O ENUM PERMITE PERCORRE-LO
        for (EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + "-"+ e.getNome());
        }

        System.out.println("--------------------------------");

        //SELECIONAR UM ESTADO ESPECIFICAMENTE
        EstadoBrasileiro estadoBrasil = EstadoBrasileiro.SAO_PAULO;

            //nome
            System.out.println(estadoBrasil.getNome());

            //sigla
            System.out.println(estadoBrasil.getSigla());

            //nome maiúsculo
            System.out.println(estadoBrasil.getNomeMaiusculo());

            //número IBGE
            System.out.println(estadoBrasil.getIbge()+" - "+estadoBrasil.getNome());

        System.out.println("--------------------------------");     
    }
}
