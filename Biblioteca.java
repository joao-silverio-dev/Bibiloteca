import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    ArrayList<ItemBiblioteca> itensBiblioteca;
    Scanner consoleRead = new Scanner(System.in);

    public Biblioteca(){
        System.out.println("Bem vindo ao sistema da biblioteca\n");
        itensBiblioteca = new ArrayList<>();
    }

    public void adicionarItem(){
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

        if(numero == 1){
            itensBiblioteca.add(new Livro(nomeLivro, autor, anoPubli));
            System.out.println("Número de itens atualizado: " + itensBiblioteca.size());
        } else{
            itensBiblioteca.add(new Revista(nomeAutor, autor, anoPubli));
            System.out.println("Número de itens atualizado: " + itensBiblioteca.size());
        }
    }

    public void buscaPorTitulo(String titulo){
        for (ItemBiblioteca itemBibObject : itensBiblioteca) {
            if(itemBibObject.titulo.equals(titulo)){
                System.out.println("Item encontrado");
                System.out.println("\tTítulo: " + itemBibObject.titulo + "\n" +
                                   "\tNome do Autor: " + itemBibObject.autor.nome + "\n" +
                                   "\tAno de Publicação: " + itemBibObject.anoDePublicacao + "\n");
            }
        }
    }

    public void listarTodosOsItens(){
        System.out.println("Todos os itens por título e autor: ");
        for(ItemBiblioteca item : itensBiblioteca){
            System.out.println(item.titulo + " - " + item.autor.nome);
        }
    }

}