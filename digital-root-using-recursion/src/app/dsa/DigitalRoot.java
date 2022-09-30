package app.dsa;

public class DigitalRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOfDigits = digitalRoot(1355);
		System.out.println(sumOfDigits);
	}
	 public static int sumOfDigits(int n)
	  {
	        // add your code here
	        if(n == 0)
	            return 0;
	        int sum = sumOfDigits(n/10);
	        sum = n%10 + sum;
	        return sum;
	 }
	public static int digitalRoot(int n) {
		int total = sumOfDigits(n);
		if(total> 9) {
			total = digitalRoot(total);
		}
		else {
			return total;
		}
		return total;
	}
}