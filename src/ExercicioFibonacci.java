import java.util.Scanner;

public class ExercicioFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um número para verificar se pertence à sequência de Fibonacci:");
        int numero = scanner.nextInt();
        
        if (verificaFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
    
    public static boolean verificaFibonacci(int numero) {
        int primeiro = 0;
        int segundo = 1;
        
        while (segundo < numero) {
            int temp = segundo;
            segundo += primeiro;
            primeiro = temp;
        }
        
        return segundo == numero;
    }
}
