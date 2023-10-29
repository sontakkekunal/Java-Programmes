//5. WAP to check whether the number is prime or not.
class Q5NumPrimeOrNot{
	int num1=0;
	int i=1;
	boolean primeCheck(int num){
		if(i==1){
			num1=num;
			num=0;
		}
		if(i>num1){
			if(num==2)
				return true;
			else
				return false;
		}
		if(num1%i==0)
			num++;
		i++;
		return primeCheck(num);
	}
	public static void main(String [] args){
		System.out.println(new Q5NumPrimeOrNot().primeCheck(10));

	}
}
