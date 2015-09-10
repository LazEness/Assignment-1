import java.util.Scanner;
public class Question12 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String binary, n1, n2, n3, n4; 
		int b1, b2, b3, b4, decimal;
		binary = keyboard.nextLine();
		n1 = binary.substring(0,1);
		n2 = binary.substring(1,2);
		n3 = binary.substring(2,3);
		n4 = binary.substring(3,4);
		b1 = Integer.parseInt(n1);
		b2 = Integer.parseInt(n2);
		b3 = Integer.parseInt(n3);
		b4 = Integer.parseInt(n4);
		
		decimal = (8 * b1) + (4 * b2) + (2 * b3) + (b4);
		System.out.println(decimal);

	}

}
