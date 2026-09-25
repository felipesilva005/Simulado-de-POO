package Q3;
public class AppComposicao {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Fiódor Dostoiévski", "Russo");
        Livro livro1 = new Livro("Noites Brancas", 39.23, autor1);

        livro1.exibirDetalhes();
    }
}
