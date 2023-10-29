//1. WAP to print the numbers between 1 to 10.
class Q1Print1To10{
	void printNum(int num){
		if(num>10)
			return;
		System.out.println(num);
		printNum(++num);
	}
	public static void main(String [] args){
		new Q1Print1To10().printNum(1);
	}
}
