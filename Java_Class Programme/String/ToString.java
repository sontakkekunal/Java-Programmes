//When any object (variable ) come in contact with string it make call to 'toString()'
class ToString{
	public static void main(String[] args){
		char arr[]={'A','B','C'};
		System.out.println("(arr)<--(singel on new line)---- just show the string : ");
		System.out.println(arr);
		System.out.println("(joined with string)(shows address)(arr) Array: "+arr);
		System.out.println("(joined with toString)(show addresS)(singel on new line or with string)---(arr.toString()) : ");
		System.out.println(arr.toString());
	}
}

