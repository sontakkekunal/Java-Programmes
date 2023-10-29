class SumOfNNum{
	int sumOfN(int sum,int N){
		if(sum>N)
			return 0;
		sum=sum+sumOfN(sum+1,N);
		return sum;
	}
	public static void main(String [] args){
		System.out.println("Start main");
                System.out.println(new SumOfNNum().sumOfN(1,10));
                System.out.println("end main");
	}
}
