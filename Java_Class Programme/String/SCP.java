class SCP{
	public static void main(String [] args){
		String str1="Core2Web";
		String str2=new String("Core2Web");

		System.out.println("Hash code of of str1: "+System.identityHashCode(str1));
		System.out.println("Hash code of of str2: "+System.identityHashCode(str2));

		String str3="Core2Web";
                String str4=new String("Core2Web");

                System.out.println("Hash code of of str3: "+System.identityHashCode(str3));
                System.out.println("Hash code of of str4: "+System.identityHashCode(str4));
	}
}

