public class SmartTv {

    //ESTADOS INICIAIS DA TV
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Métodos
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada=false;
    }

    public void escolherCanal(int novoCanal){
        canal = novoCanal;
    }

    public void mudarCanalPosterior(){
        canal++;
    }

     public void mudarCanalAnterior(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }
}
