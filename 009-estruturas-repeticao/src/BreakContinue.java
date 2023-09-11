public class BreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++){
            if (numero == 3){
                //break; para o programa no 2
                continue; // pula o valor 3
            }

            System.out.println(numero);
        }
    }
}
