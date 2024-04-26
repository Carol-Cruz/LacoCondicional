package lacocondicional2;

import java.util.Scanner;

public class LacoCondicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner captura = new Scanner(System.in);
		int numero;
		System.out.println("Digite um número inteiro");
		numero = captura.nextInt();
		
		if(numero % 2 == 0 && numero < 0)   {
			System.out.println("Esse número é par e negativo");
		}
		
		else if(numero % 2 == 0 && numero > 0)  {
			System.out.println("Esse número é par e positivo");
		}
		else if(numero % 2 != 0 && numero < 0){
				System.out.println("Esse número é ímpar e negativo");
		}
		else if(numero % 2 != 0 && numero > 0){
					System.out.println("Esse número é ímpar e positivo");
				}
		else {
			System.out.printf("O '%d' é o número zero",numero);
		}
		captura.close();
	}
}