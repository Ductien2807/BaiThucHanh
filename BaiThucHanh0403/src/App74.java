import java.util.Scanner;

public class App74 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				Sum += i;
			}
		}
		System.out.println("RESULT = " + Sum);
		sc.close();
	}
}