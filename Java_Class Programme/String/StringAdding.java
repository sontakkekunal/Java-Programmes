class StringAdding{
	public static void main(String [] args){
		String str1="Kunal";
		String str2="Sontakke";
		String str3="KunalSontakke";
		String str4=str1+str2;

		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("str4  (str1+str2) : "+str4);

		System.out.println("identity hash code of str3 : "+System.identityHashCode(str3));
		System.out.println("identity hash code of str4 : "+System.identityHashCode(str4));

		System.out.println("hash code of str3 : "+str3.hashCode());
		System.out.println("hash code of str4 : "+str4.hashCode());
	}
}
