package cycle;

public class Third {

	public static void main(String[] args) {
		int number = 10;
		for (int n = 1; n <= 10; n++) {
			if (number % n == 0) {
				System.out.println(n);
			}
		}

	}

}
