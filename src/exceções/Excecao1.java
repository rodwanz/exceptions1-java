package exce��es;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("Invalid position!");
		}
		catch(InputMismatchException e ) {
			System.out.println("Input Error!");
		}
		
		System.out.println("End of Program!");
		
		
		sc.close();

	}

}
