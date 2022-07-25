import java.util.Scanner;

public class ParEImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int quantNumeros;
		int count = 0;
		
		
		System.out.println("Quantidade de numeros: ");
		quantNumeros = sc.nextInt();
		int numero;
		int qtdPares = 0, qtdImpares=0;
		
		do{
			System.out.println("Numero: ");
			numero = sc.nextInt();
			if(numero % 2 == 0) qtdPares++;
			else qtdImpares++; 
			
			count++;
		}while(count < quantNumeros);
		
		System.out.println("Quantidade de pares é: "+ qtdPares);
		System.out.println("Quantidade de impares é: "+ qtdImpares);
		
	}

}
