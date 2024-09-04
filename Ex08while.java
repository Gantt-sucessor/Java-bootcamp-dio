import java.util.Scanner;
public class Ex08while {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int i = 0;
        float soma = 0, media = 0, numero;

        while (i < 10){

            System.out.printf("Informe 10 números: ");
            numero = input.nextFloat();
            i++;

            if (numero > 0){

                soma = soma + numero;
                media = soma / 10;

            }else{

                System.out.println("Informe apenas números positios!!");

            }
        }
        System.out.printf("A média dos números ficou: %.0f", media);
    }
}
