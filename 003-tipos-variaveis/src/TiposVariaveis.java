public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        short numeroCurto =1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        //esse (short) é um "casting", pois, é uma forma de garantir que esse valor será short.
    }
}
