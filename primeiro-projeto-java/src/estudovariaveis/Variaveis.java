package estudovariaveis;

public class Variaveis {
	
	/*Variável global é acessivel a todos e valor é compartilhado*/
	static int maiorIdadeGlobal = 30;
	
	
	/*Main é um metodo auto executavel em  java*/
	public static void main(String[] args) {
		
		/*Variaveis local pertence somente a esse método e valor fica dentro do medoto*/
		int maiorIdade = 18;
		
		System.out.println("valor da variavel local " + maiorIdade);
		metodo2();
	}
	
	
	public static void metodo2 () {
		System.out.println("valor da variavel global " + maiorIdadeGlobal); 	
	}
}
