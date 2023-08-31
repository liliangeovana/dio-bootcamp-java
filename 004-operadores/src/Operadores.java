public class Operadores {
    public static void main(String[] args){
        int numero = 5;

        //imprime o 5
        System.out.println(numero); 

        //realiza o incremento primeiro (muda o valor da variável) e imprime o 6.
        System.out.println(++numero); 

        /*
        System.out.println(numero++);//imprirá o 5 e depois soma o +1
        System.out.println(numero); //imprimirá o 6 
        */
        
        //Iniciada como verdadeira
        boolean var = true; 

        // Invertendo o valor (passa a assumir o valor FALSE pelo resto do programa)
        var = !var;

        System.out.println(var);
        
    }
}
