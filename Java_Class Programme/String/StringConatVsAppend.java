class StringConatVsAppend{
	public static void main(String [] args){
		String str1="Shashi";
		String str2="Bagal";

		String str3=str1+str2;  //<-------Internally calls append method in StringBuilder class
	        String str4=str1.concat(str2);  //<------concat method is in the String class

		System.out.println("result by conacat method "+str4);
		System.out.println("result by append methdod  "+str3);
	}
}



