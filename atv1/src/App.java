import java.time.LocalDate;

import src.ProdutoNaoPerecivel;
import src.ProdutoPerecivel;

public class App {

	public static void main(String[] args) {

		ProdutoNaoPerecivel p1 = new ProdutoNaoPerecivel("Caderno",10.0);
		ProdutoNaoPerecivel p2 = new ProdutoNaoPerecivel("Caneta",5.0,0.3);
		ProdutoNaoPerecivel p3 = new ProdutoNaoPerecivel("Lápis",2.0,0.2);

		ProdutoPerecivel p4 = new ProdutoPerecivel("Leite", 4.0, 0.2, LocalDate.of(2028, 6, 30));
		ProdutoPerecivel p5 = new ProdutoPerecivel("Iogurte", 3.0, 0.25, LocalDate.of(2028, 6, 20));
		ProdutoPerecivel p6 = new ProdutoPerecivel("Queijo", 8.0, 0.3, LocalDate.of(2028, 6, 15));

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);

	}
}
