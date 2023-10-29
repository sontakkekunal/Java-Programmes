//9. WAP to print string in reverse order.
class Q9PrintStrInReverse{
	void printInReverse(String str){
		if(str.length()==0)
			return;
		System.out.print(str.charAt(str.length()-1));
		str=str.substring(0,str.length()-1);
		printInReverse(str);
	}
	public static void main(String [] args){
		System.out.println();
		new Q9PrintStrInReverse().printInReverse("Kunal");
		System.out.println();
	}
}
