import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeriro número: ");
		int firstNumber = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		int secondNumber = entrada.nextInt();
		
		try {
			contar(firstNumber, secondNumber);
		}catch(ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}finally {
			entrada.close();
		}
	}
	
	static void contar(int numberOne, int numberTwo) throws ParametrosInvalidosException{
		if(numberOne > numberTwo) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		int result = numberTwo - numberOne;
		for(int x=1; x<=result; x++) {
			System.out.println("O contador é: " + x);
		}
	}
}
