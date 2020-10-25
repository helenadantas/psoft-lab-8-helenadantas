package formatacao;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Controller controller = new Controller();
		int valor = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um texto: ");
		String str = sc.next();
		System.out.println("Escolha a formatacao desejada: ");
		System.out.println("1 - Caixa Alta");
		System.out.println("2 - Caixa Baixa");
		System.out.println("3 - Italico");
		System.out.println("4 - Negrito");
		valor = sc.nextInt();
		
		String srtCaixaAlta = controller.formatarStr(valor, str);
		System.out.println(srtCaixaAlta);

	}
}