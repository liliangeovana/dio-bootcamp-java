public class MeuNome {
    public static void main (String [] args){
        
        String primeiroNome="Lílian";
        String segundoNome="Geovana";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
    }
    

    //CRIANDO MÉTODO QUE JUNTA OS NOMES

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
