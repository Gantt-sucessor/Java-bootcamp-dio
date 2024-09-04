import java.util.Scanner;
public class Ex14for {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número inteiro par: ");
        numero = input.nextInt();

        if (numero % 2 == 0){

            for (int i = 2; i <= numero;i++){

               if (i % 2 == 0){

                    System.out.println("Pares até inteiro par é: "+i);

               }
            }
        }else{
            System.out.println("Informe apenas números positivos!!");
        }
        
    }
}
