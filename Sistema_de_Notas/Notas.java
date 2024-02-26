import java.util.Scanner;
import javax.swing.JOptionPane;

public class Notas {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String NomeAluno;
		float nota1; float nota2; float nota3; float nota4;
		float media;
		int continuar;
		
do {	
	
	
	NomeAluno = (JOptionPane.showInputDialog("\n" + "Bem Vindo!!! Ao Banco de Resultado de Notas do Ano Letivo 2023.     " + "\n" + " Da Escola Robotrix!" + "\n" + "\n" + "Informe o nome do Aluno: " + "\n"));
			
	
	nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a sua Primeira Nota: "));
	nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a sua Segunda Nota: "));
	nota3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a sua Terceira Nota: "));
	nota4 = Float.parseFloat(JOptionPane.showInputDialog("Informe a sua Quarta Nota: "));
	
	media = (nota1+nota2+nota3+nota4) / 4 ; 	
	
	if (media>=7) {
		
	JOptionPane.showInternalMessageDialog(null, "\n" + "Resultado do ano 2023 da Escola Robotrix" + "\n" + "\n" + NomeAluno+"," + " a sua média desse ano foi: " + media + "     "+ "\n" + "\n"  + NomeAluno + "," + " você foi Aprovado(a)!!!" + "\n" +  "\n" + "Meus Parabéns!!! Continue assim!!!   ");
	
	}
	else if (media>=4.5 && media<=7) {
		
	JOptionPane.showInternalMessageDialog(null, "\n" + "Resultado do ano 2023 da Escola Robotrix" + "\n" + "\n" + NomeAluno+"," + " a sua média desse ano foi: " + media + "     "+ "\n" + "\n" + NomeAluno +"," + " você Ficou de Recuperação. Do dia: 05/12 à 20/12, Cuidado! Estude Mais!!!  ");
	
	}
	else {
		JOptionPane.showInternalMessageDialog(null, "\n" + "Resultado do ano 2023 da Escola Robotrix" + "\n" + "\n" + NomeAluno+","+ " a sua média desse ano foi: " + media + "     "+ "\n" + "\n" + NomeAluno+","+ " Você foi, Reprovado!!!" +  "\n" + "\n" + "No próximo ano, estude mais!!!  ");
		
	}
	     		continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar com sistema?(1)Sim ou (0)Não: "));
	     		
	} while(continuar>0);
	
sc.close();

}}
			