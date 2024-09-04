import java.util.Scanner;
public class Ex09for {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int valor[] = new int[10];
        int maior = 0, menor = 0;

        for (int i = 0; i < valor.length; i++){
            System.out.printf("Informe 10 números: ");
            valor[i] = input.nextInt();
            maior = valor[i];
            menor = valor[i];

            if (valor[i] > maior){

                maior = valor[i];
            }
        }
        for (int j = 0; j < valor.length; j++){

            if (valor[j] < menor){

                menor = valor[j];
            }
        }
        System.out.println("Maior valor: "+ maior);
        System.out.println("Menor valor: "+ menor);
    }
}
