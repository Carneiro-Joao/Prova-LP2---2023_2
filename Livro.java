public class Livro {
    private String titulo;
    private String autores;
    private int ano;
    private int qtdPaginas;
    private String genero;

    public Livro(String titulo, String autores, int ano, int qtdPaginas, String genero) {
        this.titulo = titulo;
        this.autores = autores;
        this.ano = ano;
        this.qtdPaginas = qtdPaginas;
        this.genero = genero;
    }

    // Getters and setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }
    public void setAutores(String autores) {
        this.autores = autores;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }
    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
