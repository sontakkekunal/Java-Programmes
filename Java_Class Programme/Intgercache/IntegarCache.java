class IntegarCache{
	public static void main(String [] args){
		char ch='A';
		int n=65;
		System.out.println(System.identityHashCode(ch));
		System.out.println(System.identityHashCode(n));
	}
}
