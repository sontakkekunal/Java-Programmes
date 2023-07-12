class StringConcat{
	public static void main(String [] args){
		String str1="Sashi";
		String str2="Bagal";
		
		System.out.println(" str1 : "+str1);
		System.out.println(" str2 : "+str2);
		System.out.println("identity hash code of str1 : "+System.identityHashCode(str1)+ "\nHash code of str1 : "+str1.hashCode() );
		System.out.println("identity hash code of str2 : "+System.identityHashCode(str2)+ "\nHash code of str2 : "+str2.hashCode() );

		System.out.println("After conacat and storinng in str1");
		str1=str1.concat(str2);

		System.out.println(" str1 : "+str1);
                System.out.println(" str2 : "+str2);

		System.out.println("identity hash code of str1 : "+System.identityHashCode(str1)+ "\nHash code of str1 : "+str1.hashCode() );
                System.out.println("identity hash code of str2 : "+System.identityHashCode(str2)+ "\nHash code of str2 : "+str2.hashCode() );


	}
}
