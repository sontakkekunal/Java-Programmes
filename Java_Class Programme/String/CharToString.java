class CharToString{
	public static void main(String [] args){
		char ch[]={'A','B','C'};
		String str1="ABC";
		String str2=new String(ch);


		System.out.print("character array(ch) is : ");
		System.out.println(ch);
		System.out.println("str1 : "+str1);
		System.out.println("str2 (new String(ch))  : "+str2);



		if(str2.equals(str1))
			System.out.println("String is same");
		if(str2.hashCode()==str1.hashCode())
			System.out.println("there hashcode is same");
		if(System.identityHashCode(str2) == System.identityHashCode(str1))
			System.out.println("there identity hash code is same");
		else
			System.out.println("there identity hash code is not same");


	}
}
