package beecrowd_1071;

/*
beecrowd | 1071 - Soma de Impares Consecutivos I

Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares
que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = 0;
		
		if(y > x) {
			int aux = x;
			x = y;
			y = aux;
		}
		
		for(int i = y + 1; i < x ; i++) {
			if(i % 2 != 0) {
				soma += i;
			}
		}
		System.out.println(soma);
		sc.close();
	}
}
