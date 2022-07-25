import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int tabuada;
		
		System.out.println("Digite a tabuada desejada: ");
		tabuada = sc.nextInt();
		
		System.out.println("Tabuada do "+ tabuada);
		
		for (int i = 1 ; i <= 10; i++) {
			System.out.println(tabuada + "x" + i + "= " + (tabuada*i));
			
		}
		
	}

}
