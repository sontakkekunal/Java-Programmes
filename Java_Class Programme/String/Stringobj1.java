class Stringobj1{
	public static void main(String [] args){
		String str1="Kanha";
		String str2=str1;
		String str3=new String(str2);

		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);

		System.out.println("identity hash code of str1 is  "+System.identityHashCode(str1));
		System.out.println("identity hash code of str2 is  "+System.identityHashCode(str2));
		System.out.println("identity hash code of str3 is  "+System.identityHashCode(str3));

		System.out.println("hash code of str1 is : "+str1.hashCode());
		System.out.println("hash code of str2 is : "+str2.hashCode());
		System.out.println("hash code of str3 is : "+str3.hashCode());
	}
}


