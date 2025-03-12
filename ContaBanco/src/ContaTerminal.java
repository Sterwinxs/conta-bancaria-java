import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception 
    {
       Scanner scanner = new Scanner(System.in);

       int conta = solicitarNumero(scanner,"Por favor, digite o número da Conta");
       String agencia = solicitarTexto(scanner,"Por favor, digite o número da Agência");
       String nome =  solicitarTexto(scanner,"Por favor, digite o nome do titular");
       double saldo = solicitarSaldo(scanner,"Por favor, digite o saldo da conta");
       NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

       String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo de %s já está disponível para saque.",nome,agencia,conta,formatador.format(saldo));
            
       System.out.println(mensagem);
    }

    public static int solicitarNumero(Scanner scanner, String mensagem)
    {
        System.out.print(mensagem);
        while(!scanner.hasNextInt()){
            System.out.println("Por favor, digite um número válido");
            scanner.nextLine();
        }
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
   }

   public static String solicitarTexto(Scanner scanner, String mensagem)
   {
        System.out.print(mensagem);
        return scanner.nextLine();}

    public static double solicitarSaldo(Scanner scanner, String mensagem){
        System.out.print(mensagem);
        while(!scanner.hasNextDouble()){
            System.out.println("Por favor, digite um número válido");
            scanner.nextLine();
        }
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        return saldo;
    }
}