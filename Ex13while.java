import java.util.Scanner;
public class Ex13while {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int i = 0, numero;

        System.out.printf("Informe um número inteiro: ");
        numero = input.nextInt();

        while (numero >= i){
            System.out.println("Numero até 0 ficou: "+numero);
            numero--;
        }
    }
}
