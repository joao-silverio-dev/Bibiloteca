
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    ArrayList<ItemBiblioteca> itensBiblioteca;
    ArrayList<Membro> membros;
    Scanner consoleRead = new Scanner(System.in);

    public Biblioteca() {
        System.out.println("Bem vindo ao sistema da biblioteca\n");
        itensBiblioteca = new ArrayList<>();
        membros = new ArrayList<>();
    }

    public void adicionarItem() {
        System.out.print("\nDigite o nome do autor ou publicadora: ");
        String nomeAutor = consoleRead.nextLine();
        System.out.print("\nDigite o nome do livro ou revista: ");
        String nomeLivro = consoleRead.nextLine();
        System.out.print("\nDigite o ano de publicação: ");
        int anoPubli = consoleRead.nextInt();
        consoleRead.nextLine();

        Autor autor = new Autor(nomeAutor);

        System.out.println("\n\nQual item deseja adicionar? \n\t(1) Livro\n\t(2) Revista\n\nItem: ");
        int numero = consoleRead.nextInt();
        consoleRead.nextLine();

        if (numero == 1) {
            itensBiblioteca.add(new Livro(nomeLivro, autor, anoPubli));
            System.out.println("Número de itens atualizado: " + itensBiblioteca.size());
        } else {
            itensBiblioteca.add(new Revista(nomeAutor, autor, anoPubli));
            System.out.println("Número de itens atualizado: " + itensBiblioteca.size());
        }
    }

    public ItemBiblioteca buscaPorTitulo(String titulo) {
        ItemBiblioteca itemBibObject = null;
        for (ItemBiblioteca itemBib : itensBiblioteca) {
            if (itemBib.titulo.equals(titulo) && !itemBib.emprestado) {
                System.out.println("Item encontrado");
                System.out.println("\tTítulo: " + itemBib.titulo + "\n"
                        + "\tNome do Autor: " + itemBib.autor.nome + "\n"
                        + "\tAno de Publicação: " + itemBib.anoDePublicacao + "\n");
            }
            itemBibObject = itemBib;
        }
        return itemBibObject;
    }

    public void listarTodosOsItens() {
        System.out.println("Todos os itens por título e autor: ");
        for (ItemBiblioteca item : itensBiblioteca) {
            System.out.println(item.titulo + " - " + item.autor.nome);
        }
    }

    public Membro procurarMembro(String nome) {
        Membro memb = null;
        try {
            for (Membro membro : membros) {
                if (membro.nome.equalsIgnoreCase(nome)) {
                    memb = membro;
                }
            }
        } catch (Exception e) {
            System.out.println("Membro não encontrado");
        }
        return memb;
    }
}
