package aluno;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;	
	public double notaMaxima = 100;
	double media = notaMaxima * 60 / 100;
	
	public double resultado() {
		return  nota1 + nota2 + nota3 + nota4;
		
	}
	
	public void aprovacao() {
		double max =  nota1 + nota2 + nota3 + nota4;
		if(max >=  media) {
			System.out.println("APROVADO");
		}else {
			System.out.println("REPROVADO");
		}
	}
}
