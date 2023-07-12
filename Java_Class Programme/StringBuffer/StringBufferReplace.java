class StringBufferReplace{
	public static void main(String [] args){
		StringBuffer sb1= new StringBuffer("Kunal");
		System.out.println("Indentity hash code of "+sb1+" is : "+System.identityHashCode(sb1)+"\nAnd hash code is : "+sb1.hashCode());
		System.out.println("After replacing");
		sb1=new StringBuffer("Sontakke");
		System.out.println("Indentity hash code of "+sb1+" is : "+System.identityHashCode(sb1)+"\nAnd hash code is : "+sb1.hashCode());
	}
}


