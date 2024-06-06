import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){ 
        
    int numero = Integer.parseInt(args[0]);
    String agencia = args[1];
    String nomeCliente = args[2] + " " + args[3];
    double saldo = 237.48;

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

    }

}