import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/* Exceções que podem acontecer:
    Não informar o nome e/ou sobrenome
    O valor da idade ter uma caracter NÃO numérico
    O valor da altura ter uma vírgula no lugar do ponto (padrão americano)
*/

public class AboutMe{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo "+nome+" "+sobrenome);
        System.out.println("Tenho "+idade+" anos");
        System.out.println("Minha altura é "+altura+ "m");
        scanner.close();
        }
        // EXCEÇÃO Input.. EM CASO DE ERRO NA IDADE E ALTURA
        catch(InputMismatchException e){
            System.out.println("Os campos IDADE e ALTURA precisa ser numéricos");
        }
    }
}