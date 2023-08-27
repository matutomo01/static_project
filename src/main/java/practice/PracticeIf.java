package practice;

public class PracticeIf {

	public static void main(String[] args) {
		int num = 0;
		
		for (int i = 1; i <= 100; i++) {
			num++;	
		
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (num % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (num % 5 == 0) {
				System.out.println("Buzz");
		  }
		}
	}

}
