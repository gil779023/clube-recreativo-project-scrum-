 package Clube.UsoFuncionario;

import java.util.Scanner;

import Clube.Classes.PainelAdministrativo;

public class LoguinFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (realizarLogin(scanner)) {
            System.out.println("Login bem-sucedido!");
            System.out.println("Escolha a opção:");
            System.out.println("1. Atualizar Funcionário");
            System.out.println("2. Acessar Painel Administrativo");
            int escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    AtualizarFuncionario.atualizarFuncionario(null, scanner);
                    break;
                case 2:
                    PainelAdministrativo.acessarPainelAdministrativo(scanner);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("Login ou senha incorretos.");
        }

        scanner.close();
    }

    public static boolean realizarLogin(Scanner scanner) {
        System.out.print("Loguin Funcionario: ");
        String usuario = scanner.nextLine().trim();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        // Coloque as credenciais corretas aqui
        return usuario.equals("funcionario") && senha.equals("123");
    }
}
