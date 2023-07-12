//write program to print 1-40 , if the number in range is divislble by 3 and 5 then break the loop
class DivisibleBreak{
	public static void main(String [] hh){
		int N=40;
		for(int i=1;i<(N+1);i++){
			if(i%3==0 && i%5==0){
				System.out.println(i+" is divisible by both 3 and 5 . \n Hence loop breaked according to condition");
				break;
			}
			System.out.println(i);
		}
	}
}

