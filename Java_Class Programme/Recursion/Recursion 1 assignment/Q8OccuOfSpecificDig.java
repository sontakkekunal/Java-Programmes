//8. WAP to count the occurrence of a specific digit in a given number.
class Q8CountOfSpecificNum{
	int sumOfSpecficNum(int num,int n){
		if(num==0)
			return 0;
		int count=0;
		if(num%10==n)
			count++;
		return count+sumOfSpecficNum(num/10,n);
	}
	public static void main(String [] args){
		System.out.println(new Q8CountOfSpecificNum().sumOfSpecficNum(123242,2));
	}
}
