package cycle;

public class Fourth {

	public static void main(String[] args) {
		int num = 10;
        int factorial = 1;
        for(int i = 1; i <= num; ++i){
            
        	factorial *= i;
        	
        }
        System.out.println("Factorial of "+ num + " --> "+ factorial);
        
        
        int number = 10, i = 1;
        int factorial_1 = 1;
        while(i <= number){
            
        	factorial_1 *= i;
            i++;
            
        }
        System.out.println("Factorial of "+ number + " --> "+ factorial_1);
	}

}
