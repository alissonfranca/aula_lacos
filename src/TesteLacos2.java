import java.util.Scanner;

public class TesteLacos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double somaAltura =0, media;
		//double altura1, altura2, altura3, altura4, altura5, altura6;
		Scanner leitor = new Scanner(System.in);
		int aluno = 1;
		while (aluno <= 6) {
			System.out.println("Digite a altura do " + aluno +"º aluno");
			somaAltura = somaAltura + leitor.nextDouble();
			aluno++;
		}
		media = somaAltura / 6;
		System.out.println("A media de altura dos alunos é de " + media);
		leitor.close();
	}

}
