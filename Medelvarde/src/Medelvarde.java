import java.util.Scanner;
public class Medelvarde {

	public static void main(String[] args) {
		
		getNumber();
		
	}

	public static void getNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Skriv in dit"
				+ "t första tal: ");
		int num1 = scan.nextInt();
		System.out.println("Skriv in ditt andra tal: ");
		int num2 = scan.nextInt();
		calculateValue(num1, num2);
	}
	
	public static void calculateValue(double x, double y) {
		System.out.println("Medelvärdet av talen är " + (x+y)/2);
	} 
}
