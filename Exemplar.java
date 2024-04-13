public class Exemplar {
    private Livro livro;
    private boolean disponibilidade;

    public Exemplar(Livro livro, boolean disponibilidade) {
        this.livro = livro;
        this.disponibilidade = disponibilidade;
    }

    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }
    public void setDisponivel(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}

