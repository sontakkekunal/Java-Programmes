class StringHashCode{
	public static void main(String [] args){
		String str1="Shashi";
		String str2=new String("Shashi");
		String str3="Shashi";
		String str4=new String("Shashi");

		System.out.println("Hashcode of str1 is : "+str1.hashCode());
		System.out.println("Hashcode of str2 is : "+str2.hashCode());
		System.out.println("Hashcode of str3 is : "+str3.hashCode());
		System.out.println("Hashcode of str4 is : "+str4.hashCode());
	}
}

