package Controller;

public class OperacoesController {
	
	public int fibonacci(int N) {
		//Condi��o de parada: 
		if (N == 0) {
			return 0;
		} else if (N == 1 || N == 2) {
			return 1;//Retorna a primeira e a segunda posi��o do Fibonacci.
		}
			return fibonacci (N - 1) + fibonacci (N - 2);//Retorna a fun��o de fibonacci.
	}

}
