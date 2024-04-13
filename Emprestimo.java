public class Emprestimo {
    private Exemplar item;
    private Usuario usuario;
    private String dataEmprestimo;
    private boolean finalizado;
    private boolean lido;

    public Emprestimo(Exemplar item, Usuario usuario, String dataEmprestimo,
            boolean finalizado, boolean lido) 
    {
        this.item = item;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.finalizado = finalizado;
        this.lido = lido;
    }

    public Exemplar getExemplar() {
        return item;
    }
    public void setExemplar(Exemplar item) {
        this.item = item;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public boolean isFinalizado() {
        return finalizado;
    }
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public boolean isLido() {
        return lido;
    }
    public void setLido(boolean lido) {
        this.lido = lido;
    }
}
