import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int numero;
        String agencia, NomeCliente;
        float saldo;

        System.out.printf("Por favor informe o número da sua conta: ");
        numero = input.nextInt();

        input.nextLine();

        System.out.printf("Por favor informe o número da agência: ");
        agencia = input.nextLine();

        System.out.printf("Por favor informe seu nome: ");
        NomeCliente = input.nextLine();

        System.out.printf("Informe o saldo da tua conta: ");
        saldo = input.nextFloat();


        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",conta " + numero + " e seu saldo " + saldo + " já está disponível");
    }
}
