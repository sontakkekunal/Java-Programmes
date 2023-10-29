//3. WAP to print the sum of n natural numbers.
class Q3SumOfNNaturalNum{
	int sumOfN(int num){
		if(num==0)
			return num;
		return num+sumOfN(--num);
	}
	public static void main(String [] args){
		System.out.println(new Q3SumOfNNaturalNum().sumOfN(10));
	}
}
