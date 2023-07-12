class SameString{
	public static void main(String [] args){
		String str1[] ={"Kunal","Kunal","kunal","lanuK"};
		for(int i=0;i<str1.length;i++){
         		System.out.println("HashCode of "+str1[i]+ " is "+System.identityHashCode(str1[i]));
		}
	}
}

