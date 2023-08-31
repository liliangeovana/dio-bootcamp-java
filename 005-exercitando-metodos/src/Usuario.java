
//USUÁRIO INTERAGINDO COM A TV(MUDANÇAS DE ESTADO)
public class Usuario {
    //main -> método que executa a aplicação
   public static void main (String[] args) throws Exception{

    //SmartTv funciona como um int, um long. É um "TIPO" para a variável smartTV
    SmartTv smartTv = new SmartTv();
    //new SmartTv -> criando uma nova SmartTv para as mudanças de estado (orientação a objeto)


    //Exibe os estados iniciais da TV
    System.out.println("TV ligada? "+smartTv.ligada);
    System.out.println("Canal atual? "+smartTv.canal);
    System.out.println("Volume atual? "+smartTv.volume);

    //Chamando o método ligar() para a variável smartTv (ação ligar)
    smartTv.ligar();
        System.out.println("Novo status -> TV ligada? "+smartTv.ligada);

    //Desligando a Tv
    smartTv.desligar();
        System.out.println("Novo status -> TV ligada? "+smartTv.ligada);

    //Volume padrão ao ligar = 25, então aperto 2x no "botão diminuir"
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
        System.out.println("Novo volume -> "+smartTv.volume);

    //Mudando de canal para frente
    smartTv.mudarCanalPosterior();
        System.out.println("Você está no canal -> "+smartTv.canal);
    
    //Escolhendo canal específico
    System.out.println("Você estava nesse canal: "+smartTv.canal);
    smartTv.escolherCanal(13);
    System.out.println("Agora está no canal: "+smartTv.canal);
 }


   
    
   
}
