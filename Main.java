import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner consoleRead = new Scanner(System.in);
        int loop;

        Biblioteca bibliotecaTeste = new Biblioteca();
        do {
            System.out.println("\nQual operação deseja realizar?");
            System.out.println("\t0 - Sair");
            System.out.println("\t1 - Adicionar item");
            System.out.println("\t2 - Busca por título");
            System.out.println("\t3 - Listar todos os itens");
            loop = consoleRead.nextInt();
            consoleRead.nextLine();

            switch (loop) {
                case 1:
                    bibliotecaTeste.adicionarItem();
                    break;
                case 2:
                    System.out.print("Digite o título a ser procurado (lembre-se dos caracteres maiúsculos antes de cada palavra e acentuações).\n\nTítulo: ");
                    String titulo = consoleRead.nextLine();
                    consoleRead.nextLine();
                    bibliotecaTeste.buscaPorTitulo(titulo);
                    break;
                case 3:
                    bibliotecaTeste.listarTodosOsItens();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Não entendi a operação, tente novamente.");
                    break;
            }
        } while (loop != 0);

    }
}