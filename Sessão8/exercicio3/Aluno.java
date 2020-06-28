package exercicio3;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaTotal() {
		return nota1+nota2+nota3;
	}
	
	public String toString() {
		if(notaTotal()>60) 
			return "FINAL GRADE = " + notaTotal() + "\n" 
				+ "PASS";
		else
			return "FINAL GRADE = " + notaTotal() + "\n" 
		+ "FAILED" +"\n" + "MISSING "+ (60-notaTotal() +" POINTS");
	}
}
