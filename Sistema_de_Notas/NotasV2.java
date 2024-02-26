import java.util.Scanner;
import javax.swing.JOptionPane;

public class NotasV2 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String NomeAluno;
		float nota1; float nota2; float nota3; float nota4;
		float media;
		int continuar;
		
do {	
	
	
	NomeAluno = (JOptionPane.showInputDialog("\n" + "Bem Vindo!!! Ao Banco de Resultado de Notas do Ano Letivo 2023.     " + "\n" + " Da Escola Robotrix!" + "\n" + "\n" + "Informe o nome Completo do Aluno: " + "\n"));
			
	
	nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do seu Primeiro Bimestre: " + "\n"  + "\n" + "Obs.: Usar ponto ex.:(.), ao invés da vírgula (,) quando: Ex.: Quando for usar: 5.5, etc... em notas.   "));
	nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do seu Segundo Bimestre: " +  "\n " + "\n" + "Obs.: Usar ponto ex.:(.), ao invés da vírgula (,) quando: Ex.: Quando for usar: 5.5, etc... em notas.   "));
	nota3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do seu Terceiro Bimestre: " + "\n"  + "\n" + "Obs.: Usar ponto ex.:(.), ao invés da vírgula (,) quando: Ex.: Quando for usar: 5.5, etc... em notas.   "));
	nota4 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do seu Quarto Bimestre:  " +  "\n" + "\n" + "Obs.: Usar ponto ex.:(.), ao invés da vírgula (,) quando: Ex.: Quando for usar: 5.5, etc... em notas.    "));
	
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
			
