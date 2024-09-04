import java.util.Scanner;
public class Ex14while {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numero, n = 2;

        System.out.println("Informe um inteiro par: ");
        numero = input.nextInt();

        while (n <= numero){

            if (n % 2 == 0){

                System.out.println("Pares ate inteiro par é: "+n);
                n+=2;
            }
            
        }
    }
}
