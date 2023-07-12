//write program to print 1-50 , if the number in range is divislble by 3 and 5 or 4 then contiue the loop(skip that number)
class DivisbleContinue{
	public static void main(String [] ahh){
		int N=50;
		int count=0;
		for(int i=1;i<(N+1);i++){
			if((i%3==0 && i%5==0)||(i%4==0)){
				System.out.println("Number skiped");
				continue;
			}
			System.out.println(i);
			count++;
		}
		System.out.println("Number of digit not skiped between 1-"+N+" is "+count);
	}
}

