import java.util.Scanner;
public class Ex10for {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n;

        System.out.printf("Informe um número inteiro: ");
        n = input.nextInt();

        for (int i = 0; i <= n; i++){
            
            System.out.println("numeros até o número inteiro informado: "+ i);

        }
      
    }
}
