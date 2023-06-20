package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		
		System.out.println("First Number is: " +firstNum);
		
		for(int i = 0; i <= range; i++) {
			System.out.print(firstNum + ", ");
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
		}
		
	}

}
