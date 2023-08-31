public class Ternario {
    public static void main (String [] args){
        int a=5, b=6;
        String res = "";

        //ESTRUTURA IF  
        if (a==b)
            res = "verdadeiro";
        else
            res = "falso";

        System.out.println(res);

        
        //OPERADOR TERNÁRIO ?:
        int c=9, d=9;

        String resultado = (c==d) ? "verdadeiro": "falso";
        System.out.println(resultado);
    }
}
