import java.util.Scanner;
public class Ex12while {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int i = 0, numero;

        System.out.printf("Informe um número inteiro: ");
        numero = input.nextInt();

        while (i <= numero){

            System.out.println("0 até numero ficou: "+i);
            i++;
        }
    }
}
