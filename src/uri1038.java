import java.util.Scanner;

public class uri1038 {

	public static void main(String[] args) {

		/*Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();*/

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int quantidade, codigo;
		double cachorroQuente, xSalada, xBacon, torradaSimples, refrigerante, valorTotal;
		
		
		cachorroQuente = 4.00;
		xSalada = 4.50;
		xBacon = 5.00;
		torradaSimples = 2.00;
		refrigerante = 1.50;
		
		System.out.println("Digite o código do produto:");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade que deseja comprar:");
		quantidade  = sc.nextInt();
		
		if (codigo == 1) {
			valorTotal = cachorroQuente * quantidade;
		}else if (codigo == 2) {
			valorTotal = xSalada * quantidade;
		}else if (codigo == 3) {
			valorTotal = xBacon * quantidade;
		}else if (codigo == 4) {
			valorTotal = torradaSimples * quantidade;
		}
		else {
			valorTotal = refrigerante * quantidade;
		}
		
		System.out.printf("O valor total da sua compra é de: R$%.2f", valorTotal);
		
		sc.close();
	}
}
