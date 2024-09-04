import java.util.Scanner;
public class Ex15for {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.printf("Informe um inteiro par: ");
        numero = input.nextInt();

        if (numero % 2 == 0){

            for (int i = numero; numero > 0;numero-=2){

                System.out.println("Inteiro par até zero de par em par é: "+numero);

            }

        }else{

            System.out.println("Não é positivo!!!");

        }
        
    }
}
