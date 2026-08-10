import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProdutoPerecivel extends Produto {

    private static final double DESCONTO = 0.25;
    private static final int PRAZO_DESCONTO = 7;

    private LocalDate dataDeValidade;

    public ProdutoPerecivel(String desc, double precoCusto, double margemLucro, LocalDate validade) {
        super(desc, precoCusto, margemLucro);
        if (validade.isBefore(LocalDate.now())) {
            System.out.println("Erro: a data de validade nao pode ser anterior a de hoje.");
        } else {
            this.dataDeValidade = validade;
        }
    }

    public double valorVenda() {
        LocalDate hoje = LocalDate.now();

        if (dataDeValidade.isBefore(hoje)) {
            System.out.println("Erro: produto vencido.");
            return 0;
        }

        double preco = precoCusto + (precoCusto * margemLucro);

        long diasRestantes = ChronoUnit.DAYS.between(hoje, dataDeValidade);
        if (diasRestantes <= PRAZO_DESCONTO) {
            preco = preco - (preco * DESCONTO);
        }

        return preco;
    }

    public String toString() {
        return super.toString() + " Validade: " + dataDeValidade;
    }
}