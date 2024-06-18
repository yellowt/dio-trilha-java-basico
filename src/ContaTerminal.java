import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        System.out.println("Por favor, digite o número da conta.");
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        try {
            numero = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um número inteiro válido.");
        }

        System.out.println("Digite o número da agência.");
        String agencia = sc.nextLine();
        System.out.println("Digite seu nome");
        String nome = sc.nextLine();
        System.out.println("Seu saldo");

        double saldo = 0;
        try {
            saldo = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um número inteiro válido.");
        }
        Conta conta1 = new Conta(numero, agencia, nome, saldo);
        conta1.obtemDados();
    }
}
