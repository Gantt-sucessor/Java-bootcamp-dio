import java.util.Scanner;
public class Ex07for {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float soma = 0, media = 0, nota;

        for (int i = 0; i < 10; i++){
            System.out.printf("Informe tua nota: ");
            nota = input.nextFloat();

            soma = soma + nota;
            media = soma / 10;
        }
        System.out.printf("A media das suas notas em for ficou: %.0f",media);
    }
}
