import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Fatorial: ");
		int numero = sc.nextInt();
		
		int multiplicacao = 1;
		
		System.out.println(numero + "!=" + multiplicacao);
		
		for( int i = numero; i>=1 ; i-- ) {
			multiplicacao = multiplicacao * i;
		}
		
	}

}
