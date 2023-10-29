//2. WAP to display the first 10 natural numbers in reverse order.
class Q2PrintReverse{
	void numPrint(int num){
		if(num==0)
			return;
		System.out.println(num);
		numPrint(--num);
	}
	public static void main(String [] args){
		new Q2PrintReverse().numPrint(10);
	}
}
