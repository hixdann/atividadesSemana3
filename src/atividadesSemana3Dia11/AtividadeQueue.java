package atividadesSemana3Dia11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeQueue {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		int opcao = -1;
		String nome;
		Scanner leia = new Scanner(System.in);

		System.out.println("*****************************************************");
		System.out.println("        1         |Adicionar Cliente na Fila         |");
		System.out.println("        2         |Listar todos os Clientes          |");
		System.out.println("        3         |Retirar Cliente da Fila           |");
		System.out.println("        0         |Sair                              |");
		System.out.println("******************************************************");

		while (opcao != 0) {
			System.out.println("\nEntre com a Opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				nome = leia.nextLine();
				fila.add(nome);
				Iterator<String> iterator = fila.iterator();
				System.out.println("\nFila: ");
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				System.out.println("\nCliente Adicionado!");
				break;
			case 2:
				System.out.println("\nFila: ");
				Iterator<String> iterator2 = fila.iterator();
				while (iterator2.hasNext()) {
					System.out.println(iterator2.next());
				}
				break;
			case 3:
				fila.remove();
				System.out.println("\nFila: ");
				Iterator<String> iterator3 = fila.iterator();
				while (iterator3.hasNext()) {
					System.out.println(iterator3.next());
				}
				System.out.println("\nO cliente foi chamado! ");
				break;
			case 0:
				System.out.println("\nPrograma Finalizado! ");
				break;
			default:
				System.out.println("Opção inválida");
			}
		}

		leia.close();
	}

}
