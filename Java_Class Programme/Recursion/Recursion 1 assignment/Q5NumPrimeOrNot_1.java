//5. WAP to check whether the number is prime or not.
class Q5NumPrimeOrNot{
	int i=1;
	int primeCheck(int num){
		if(i>num)
			return 0;
		int count=0;
		if(num%i==0)
			count++;
		i++;
		return count+primeCheck(num);
	}
	public static void main(String [] args){
		Q5NumPrimeOrNot obj= new Q5NumPrimeOrNot();
		if(obj.primeCheck(12)==2)
			System.out.println("yes");
		else
			System.out.println("no");

	}
}
