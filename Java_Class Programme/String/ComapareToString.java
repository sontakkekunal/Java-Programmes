class CompareToString{
	public static void main(String [] arsg){
		String str1="Ashish";
		String str2="Ashish";
		System.out.println(str1.compareTo(str2));  //<--- If same then it return 0 i.e(O ascii number difference )

		String str3="ashish";
		System.out.println(str1.compareTo(str3));  //<---- if not same ,then it return ascii difference between first non same character
	}
}
