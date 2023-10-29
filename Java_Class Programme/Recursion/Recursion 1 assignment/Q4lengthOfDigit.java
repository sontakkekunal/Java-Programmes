//4. WAP to print the length of digits in a number.
class Q4LenOfDigit{
	int count=0;
	void lenofDig(int num){
		if(num==0)
			return;
		count++;
		lenofDig(num/10);
	}
	public static void main(String [] args){
		Q4LenOfDigit obj= new Q4LenOfDigit();
		obj.lenofDig(1232);
		System.out.println(obj.count);
	}
}
