import java.util.Scanner;
public class Ex06while {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float soma = 0, nota;
        int i = 0;
        
        while (i < 10){
            System.out.printf("Informe sua nota: ");
            nota = input.nextFloat();
            i++;

            soma = soma + nota;
        }
        System.out.printf("A soma das suas notas em while ficou: %.0f",soma);
    }
}
