package Clube.UsoFuncionario;
import java.util.Scanner;

public class LoguinGerente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (realizarLogin(scanner)) {
            System.out.println("Login bem-sucedido!");
            NovoFuncionario.main(args);
        } else {
            System.out.println("Login ou senha incorretos.");
        }

        scanner.close();
    }

    public static boolean realizarLogin(Scanner scanner) {
        System.out.print("Loguin Gerente: ");
        String usuario = scanner.nextLine().trim();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        // Coloque as credenciais corretas aqui
        return usuario.equals("usuario") && senha.equals("senha");
    }
}