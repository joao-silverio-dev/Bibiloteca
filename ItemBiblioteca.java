public abstract class ItemBiblioteca implements Emprestavel{
    String titulo;
    Autor autor;
    int anoDePublicacao;
    boolean emprestado;

    @Override
    public void emprestar(Membro membro){
        if(!emprestado){
            System.out.println(String.format("Livro %s de %s emprestado para o membro %s", titulo, autor.nome, membro.nome));
            emprestado = true;
        } else {
            System.out.println("Este livro já foi emprestado");
        }
    }

    @Override
    public void devolver(){
        if(emprestado){
            System.out.println(String.format("Livro %s de %s agora devolvido", titulo, autor.nome));
            emprestado = false;
        } else {
            System.out.println("Este livro não foi emprestado");
        }
    }

    public ItemBiblioteca(String titulo, Autor autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        emprestado = false;
    }
}