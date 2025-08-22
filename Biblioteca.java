import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    ArrayList<ItemBiblioteca> itensBiblioteca;
    Scanner consoleRead = new Scanner(System.in);

    public Biblioteca(){
        itensBiblioteca = new ArrayList<>();
    }

    public void adicionarItem(){
        System.out.println("Digite o nome do autor ou publicadora: ");
        String nomeAutor = consoleRead.nextLine();
        System.out.println("Digite o nome do livro ou revista: ");
        String nomeLivro = consoleRead.nextLine();
        System.out.println("Digite o ano de publicação: ");
        int anoPubli = consoleRead.nextInt();

        Autor autor = new Autor(nomeAutor);

        System.out.println("Qual item deseja adicionar? \n(1) Livro\n(2) Revista\n\nItem: ");
        int numero = consoleRead.nextInt();

        if(numero == 1){
            itensBiblioteca.add(new Livro(nomeLivro, autor, anoPubli));
        } else{
            itensBiblioteca.add(new Revista(nomeAutor, autor, anoPubli));
        }
    }

    public void buscaPorTitulo(String titulo){
        for (ItemBiblioteca itemBibObject : itensBiblioteca) {
            if(itemBibObject.titulo == titulo){
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