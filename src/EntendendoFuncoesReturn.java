import java.util.Scanner;

public class EntendendoFuncoesReturn {

	public static void saudacao(String nome) {
		System.out.println("Ola, " + nome + "!");
	}

	public static String funcaoExemplo(double altura) {
		if (altura > 1.65) {
			return "Pessoa alta";
		}else {
			return "Pessoa baixa";
		}
	}
	
	
	public static int anoLancamento(int numeroFilme) {
		switch(numeroFilme) {
		case 1:
			return 1999;
		case 2:
			return 2002;	
		case 3:
			return 2005;
		case 4:
			return 1977;
		case 5:
			return 1980;
		case 6:
			return 1983;
		default:
			return -1;

		}
		
	}
	
	public static String mensagemFilme(int filme) {
		if (anoLancamento(filme) > 0) {
			return "O filme foi lançado em " + anoLancamento(filme);
		}else {
			return "Não reconheço esse filme";
		}
	}
	
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int filme;
		System.out.println("Informe o número do filme de Star Wars que você deseja saber o ano de lançamento");
		filme = leitor.nextInt();
		
		System.out.println(mensagemFilme(filme));
		leitor.close();
		
	}
}
