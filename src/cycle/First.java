package cycle;

public class First {

	public static void main(String[] args) {
		for (int  n = 500;
				n <= 650;
				n = n + 10) {
			System.out.println(n+ "");
		}
		
		
		int x1 = 500;
		while (x1 <= 650) {
			System.out.println(x1+ "");
			x1 += 10;
		}
		int x2 = 500;
		do {
			System.out.println(x2);
			x2 += 10;
		}while (x2 <= 650);
	}

}
