//10. WAP to check whether the given number is palindrome or not.
class Q10PalindromeOrNot{
	int palindrome(int num,int n){
		if(num==0)
			return 0;
		return ((num%10)*n)+palindrome(num/10,n/10);

	}
	public static void main(String [] args){
		int n=555;
		int temp=n;
		int count=0;
		while(temp!=0){
			count++;
			temp=temp/10;
		}
		int n1=1;
		for(int i=0;i<count-1;i++){
			n1=n1*10;
		}
		int test=new Q10PalindromeOrNot().palindrome(n,n1);
		//System.out.println(test);
		if(test==n)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}

