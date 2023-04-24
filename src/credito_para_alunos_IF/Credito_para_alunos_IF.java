package credito_para_alunos_IF;

import java.util.Scanner;

public class Credito_para_alunos_IF {

	public static void main(String[] args) {
		
		double salarioBruto, valorEmprestimo;
		int numParcela;
		double valMaxParcela;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o seu salário.");
		salarioBruto = input.nextDouble();
		
		System.out.println("Digite o valor do empréstimo.");
		valorEmprestimo = input.nextDouble();
		
		System.out.println("Digite a quantidade de parcelas.");
		numParcela = input.nextInt();
		
		if (valorEmprestimo / numParcela <= salarioBruto * 0.3) {
			System.out.println("O empréstimo será concedido");
		} else if (valorEmprestimo / numParcela > salarioBruto * 0.3) {
			valMaxParcela = (salarioBruto * 0.3);
			System.out.println("O empréstimo NÃO será concedido, valor máximo da parcela deve ser " + valMaxParcela);
		}
		
		input.close();
		
	}

}
