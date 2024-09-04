import java.util.Scanner;

public class Ex13for {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.printf("Informe um número inteiro: ");
        numero = input.nextInt();

        for(int i = numero; numero >= 0; numero-=2){

            System.out.println("Numero até 0 ficou: "+numero);
        }
    }
}
