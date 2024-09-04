import java.util.Scanner;
public class Ex10while {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n, i = 0;

        System.out.printf("Informe um numero inteiro: ");
        n = input.nextInt();

        while (i <= n){

            System.out.println("Os n números até o número inteiro informado são: " + i);
            i++;
            
        }
    }
}
