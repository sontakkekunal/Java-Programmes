//7. WAP to find the factorial of a number.
class Q7FactOfNum{
	int factOfNum(int num){
		if(num==1)
			return 1;
		return num*factOfNum(--num);
	}
	public static void main(String [] args){
		System.out.println(new Q7FactOfNum().factOfNum(4));
	}
}
