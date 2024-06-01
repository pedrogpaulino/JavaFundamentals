package fundamentals;

import java.util.Scanner;

public class ExercicioBanco {

    public static void main(String[] args) {
        ContaBanco novaConta = new ContaBanco();
        Scanner scn = new Scanner(System.in);

        System.out.println("Olá! Tudo bem? Qual o seu nome?");
        novaConta.nomeCliente = scn.next();
        System.out.println("Por favor, digite o numero da agência:");
        novaConta.agencia = scn.next();
        System.out.println("Por favor, digite o numero da sua conta:");
        novaConta.numero = scn.nextInt();
        System.out.println("Por favor, digite o seu saldo:");
        novaConta.saldo = scn.nextDouble();

        novaConta.printCadastro();
    }

    public static class ContaBanco {
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.00;

        public void printCadastro(){
            System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque!");
        }
    }
}
