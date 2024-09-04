import java.util.Scanner;
public class Ex08for {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float soma = 0, media = 0, nota;

        for (int i = 0; i < 10; i++){

            System.out.printf("Informe 10 números: ");
            nota = input.nextFloat();

            if (nota > 0){

                soma = soma + nota;
                media = soma / 10;

            }else{

                System.out.println("Informe apenas números positivos!!!");
                break;

            }

        }
        System.out.printf("A média dos números ficou: %.0f ", media);

    }
}
