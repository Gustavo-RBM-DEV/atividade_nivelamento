public abstract class Produto {

private static final double MARGEM_PADRAO = 0.2;

private String descricao;
protected double precoCusto;
protected double margemLucro;

public Produto(String desc, double precoCusto, double margemLucro) {
    this.descricao = desc;
    this.precoCusto = precoCusto;
    this.margemLucro = margemLucro;
}

public Produto(String desc, double precoCusto) {
    this.descricao = desc;
    this.precoCusto = precoCusto;
    this.margemLucro = MARGEM_PADRAO;
}

public abstract double valorVenda();

public String toString() {
    return "Produto: " + descricao + " Custo:R$ " + precoCusto +
" Margem: " + (margemLucro * 100) + "%" + " Venda: R$ " + valorVenda();
}
}