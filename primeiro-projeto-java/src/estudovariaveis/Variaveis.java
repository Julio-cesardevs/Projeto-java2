package estudovariaveis;

public class Variaveis {
	
	/*Vari�vel global � acessivel a todos e valor � compartilhado*/
	static int maiorIdadeGlobal = 30;
	
	
	/*Main � um metodo auto executavel em  java*/
	public static void main(String[] args) {
		
		/*Variaveis local pertence somente a esse m�todo e valor fica dentro do medoto*/
		int maiorIdade = 18;
		
		System.out.println("valor da variavel local " + maiorIdade);
		metodo2();
	}
	
	
	public static void metodo2 () {
		System.out.println("valor da variavel global " + maiorIdadeGlobal); 	
	}
}
