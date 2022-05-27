package cycle;

public class Second {

	public static void main(String[] args) {
		int n = 2;
		while (n <= 5000) {
			System.out.println(n + "");
			n = 2 * n - 1;
		}

	}

}
