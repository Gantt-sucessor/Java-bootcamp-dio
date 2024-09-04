import java.util.Scanner;
public class Ex11forewhile {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int soma = 0;

        for (int i = 0; i <= 100; i++){

            while (i <= 50){

                soma = soma + i;
                i++;
            }
        }
        System.out.println("A soma dos 50 primeiros números ficou: "+soma);
        
    }
}
