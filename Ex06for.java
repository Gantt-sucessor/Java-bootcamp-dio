import java.util.Scanner;
public class Ex06for {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

        float soma = 0;
        float nota;


        for (int i = 0; i < 10; i++){
            System.out.printf("Informe sua nota: ");
            nota = input.nextFloat();

            soma = soma + nota;
           
            
            
        }
        
        System.out.printf("A soma das suas notas ficou: %.2f", soma);
    }
}
