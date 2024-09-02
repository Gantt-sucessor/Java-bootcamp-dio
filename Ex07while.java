import java.util.Scanner;
public class Ex07while {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        float soma = 0, nota, media = 0;
        int i = 0;

        while (i < 10){

            System.out.printf("Informe sua nota: ");
            nota = input.nextFloat();
            i++;
    
            soma = soma + nota;
            media = soma / 10;

        }
        System.out.printf("A media das tuas notas em while ficou: %.0f", media);

    }

}
