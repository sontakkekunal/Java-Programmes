class Stringobj{
	public static void main(String [] asg){
		String str1="Kanha";
		String str2="Kanha";
		String str3=new String("Kanha");
		String str4=new String("Kanha");
		String str5=new String("Rahul");
		String str6="Rahul";


		System.out.println("str1 :"+str1);
		System.out.println("str2 :"+str2);
		System.out.println("str3 :"+str3);
		System.out.println("str4 :"+str4);
		System.out.println("str5 :"+str5);
		System.out.println("str6 :"+str6);



		System.out.println("str1 identity hash code : "+System.identityHashCode(str1));
		System.out.println("str2 identity hash code : "+System.identityHashCode(str2));
		System.out.println("str3 identity hash code : "+System.identityHashCode(str3));
		System.out.println("str4 identity hash code : "+System.identityHashCode(str4));
		System.out.println("str5 identity hash code : "+System.identityHashCode(str5));
		System.out.println("str6 identity hash code : "+System.identityHashCode(str6));
		System.out.println("str1 hashcode: "+str1.hashCode());
		System.out.println("str2 hashcode: "+str2.hashCode());
		System.out.println("str3 hashcode: "+str3.hashCode());
		System.out.println("str4 hashcode: "+str4.hashCode());
		System.out.println("str5 hashcode: "+str5.hashCode());
		System.out.println("str6 hashcode: "+str6.hashCode());
		if(str1==str2)
			System.out.println("str1 and str2 are same(same obj)");
		if(str1==str3)
			System.out.println("str1 and str3 are same(same obj )");
		else
			System.out.println("str1 and str3 are not same (non same obj)");
		if(str5.equals(str6))
			System.out.println("str5 and str6 have same string(obj may or may not be same)");


	}
}
