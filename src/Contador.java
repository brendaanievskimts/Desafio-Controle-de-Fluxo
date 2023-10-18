import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = in.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = in.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O SEGUNDO PARÂMETRO DEVE SER MAIOR DO QUE O PRIMEIRO.");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}    
}
