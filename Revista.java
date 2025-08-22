public class Revista extends ItemBiblioteca {
    String titulo;
    Autor autor;
    int anoDePublicacao;

    public Revista(String titulo, Autor autor, int anoDePublicacao){
        super(titulo, autor, anoDePublicacao);
    }
}