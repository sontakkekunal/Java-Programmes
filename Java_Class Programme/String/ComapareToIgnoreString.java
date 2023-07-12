class CompareToIgnoreCaseString{
	public static void main(String [] args){
		String str1="SHASHI";
		String str2="Shashi";
//case insensetive
		System.out.println(str1.compareToIgnoreCase(str2));  //return o if string is same

		String str3="Shashikant";

		System.out.println(str1.compareToIgnoreCase(str3));  //return difference of length  if string length is not same
								     //if the string length is same then it return  ascii differnece of first non same character
	}
}
