
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
            System.out.println("\t4 - Emprestar Livro");
            System.out.println("\t5 - Devolver item");
            System.out.println("\t6 - Adicionar membro");
            loop = consoleRead.nextInt();
            consoleRead.nextLine();

            switch (loop) {
                case 1:
                    bibliotecaTeste.adicionarItem();
                    break;
                case 2:
                    System.out.print("Digite o título a ser procurado (lembre-se dos caracteres maiúsculos antes de cada palavra e acentuações).\n\nTítulo: ");
                    String titulo = consoleRead.nextLine();
                    bibliotecaTeste.buscaPorTitulo(titulo);
                    break;
                case 3:
                    bibliotecaTeste.listarTodosOsItens();
                    break;
                case 4:
                    System.out.println("Digite o título do livro à emprestar: ");
                    ItemBiblioteca item = bibliotecaTeste.buscaPorTitulo(consoleRead.nextLine());
                    System.out.println("Digite o nome do membro à emprestar");
                    try {
                        item.emprestar(bibliotecaTeste.procurarMembro(consoleRead.nextLine()));
                    } catch (Exception e) {
                        System.out.println("Não foi possível encontrar esse membro");
                    }
                    break;
                case 5:
                    String title = consoleRead.nextLine();
                    ItemBiblioteca livroEmprestado = bibliotecaTeste.buscaPorTitulo(title);
                    System.out.println("Nome do membro à emprestar: ");
                    String nome = consoleRead.nextLine();
                    Membro membro = bibliotecaTeste.procurarMembro(nome);
                    try {
                        livroEmprestado.devolver();
                    }catch(Exception e){
                        System.out.println("Livro não devolvido");
                    }
                    break;
                case 6:
                    System.out.print("\n\nNome do membro: ");
                    String nomeMembro = consoleRead.nextLine();
                    bibliotecaTeste.membros.add(new Membro(nomeMembro));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Não entendi a operação, tente novamente.");
                    break;
            }
        } while (loop != 0);
        consoleRead.close();
        bibliotecaTeste.consoleRead.close();
    }
}
