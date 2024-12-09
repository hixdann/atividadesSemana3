package atividadesSemana3Dia11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class AtividadePilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();

		int opcao = -1;
		String nome;
		Scanner leia = new Scanner(System.in);

		System.out.println("*****************************************************");
		System.out.println("        1         |Adicionar Livro na Pilha          |");
		System.out.println("        2         |Listar todos os Livros            |");
		System.out.println("        3         |Retirar Livros da Pilha           |");
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
				pilha.push(nome);
				Iterator<String> iterator = pilha.iterator();
				System.out.println("\nPilha: ");
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				System.out.println("\nLivro Adicionado!");
				break;
			case 2:
				System.out.println("\nLista de Livros na Pilha: ");
				Iterator<String> iterator2 = pilha.iterator();
				while (iterator2.hasNext()) {
					System.out.println(iterator2.next());
				}
				break;
			case 3:
				String itemRemovido = pilha.pop();
				Iterator<String> iterator3 = pilha.iterator();
				System.out.println("Pilha: ");
				while (iterator3.hasNext()) {
					System.out.println(iterator3.next());
				}
				System.out.println("Um Livro foi retirado da pilha!");
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
