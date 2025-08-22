public abstract class ItemBiblioteca{
    String titulo;
    Autor autor;
    int anoDePublicacao;
    boolean emprestado;

    public ItemBiblioteca(String titulo, Autor autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        emprestado = false;
    }
}