//6. WAP to calculate the sum of digits of a given positive integer.
class Q6SumOfDigit{
	int sumOfDig(int num){
		if(num==0)
			return 0;
		return (num%10)+sumOfDig(num/10);
	}
	public static void main(String [] args){
		System.out.println(new Q6SumOfDigit().sumOfDig(1234));
	}
}
