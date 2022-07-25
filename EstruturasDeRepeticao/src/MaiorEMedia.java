import java.util.Scanner;
public class MaiorEMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int maior = 0;
		int count=0;
		int soma = 0;
		
		
		do{
		    System.out.println("Numero:");
		    numero = sc.nextInt();
		    
		    soma += numero;
		    
		    if (numero > maior) maior = numero;
		    
		    count = ++count;
		}while(count<5);
		
		System.out.println("O maior numero é: " + maior);
		System.out.println("A media dos numeros é: " + (soma)/5);
	}

}
