package program;

import java.util.Scanner;

import aluno.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aluno aluno;
		aluno = new Aluno();
		
		System.out.print("Nome do aluno: ");
		aluno.nome = scanner.nextLine();
		System.out.print("Nota da primeira avaliação: ");
		aluno.nota1 = scanner.nextDouble();
		System.out.print("Nota da segunda avaliação: ");
		aluno.nota2 = scanner.nextDouble();
		System.out.print("Nota da terceira avaliação: ");
		aluno.nota3 = scanner.nextDouble();
		System.out.print("Nota da quarta avaliação: ");
		aluno.nota4 = scanner.nextDouble();
		
		System.out.printf("Nota final: %.2f",aluno.resultado());
		System.out.println();
		aluno.aprovacao();
		scanner.close();
	}

}
