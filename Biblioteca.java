import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Exemplar> acervo;
    private ArrayList<Emprestimo> emprestimos;

    public Boolean emprestar(String titulo, Usuario user) {
        Exemplar exemplar = null;
        for (Exemplar livro : acervo) {
            if (livro.getLivro().getTitulo().equals(titulo)) {
                exemplar = livro;
                break;
            }
        }

        if (exemplar == null) {
            System.out.println("Livro não encontrado.");
            return false;
        }

        if (!exemplar.isDisponivel()) {
            System.out.println("Livro não está disponivel para emprestimo.");
            return false;
        }

        String dataEmprestimo = "11-07-2024"; 
        boolean finalizado = false;
        boolean lido = false;

        Emprestimo emprestimo = new Emprestimo(exemplar, user, dataEmprestimo, finalizado, lido);
        emprestimos.add(emprestimo);

        exemplar.setDisponivel(false);

        System.out.println("Livro emprestado para " + user.getNome() + ".");
        return true;
    }

    public void relatorioLeituras() {
        System.out.println("Relatório de Leituras:");

        for (Exemplar exemplar : acervo) {
            int contador = 0;
            for (Emprestimo emprestimo : emprestimos) {
                if (emprestimo.getExemplar().equals(exemplar)) {
                    contador++;
                }
            }
            if (contador > 0) {
                System.out.println("Livro: " + exemplar.getLivro().getTitulo() +
                        ", Quantidade de empréstimos: " + contador);
            }
        }
    }
}
