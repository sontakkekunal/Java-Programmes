class StringBufferReverse{
	public static void main(String [] args){
		String str1 ="Core2web";
		StringBuffer sb2= new StringBuffer(str1);
		System.out.println("Sb is : "+sb2);
		str1=sb2.reverse().toString();
		System.out.println("after appending : "+str1);
		}
}

