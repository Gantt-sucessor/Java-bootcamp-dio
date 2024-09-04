import java.util.Scanner;
public class Ex12for{

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        int numero;

        System.out.printf("Informe um número inteiro: ");
        numero = input.nextInt();

        for (int i = 0; i <= numero; i++){

            System.out.println("Números de 0 até numero: "+i);
        }
    }


}