class StringBufferInsert{
	public static void main(String [] args){
		StringBuffer sb=new StringBuffer("ShashiCore2Web");

		System.out.println("sb is : "+sb);
	        System.out.println("After inserting ");
		StringBuffer str =new StringBuffer("Bagal");
		//sb.insert(6,"Bagal");
		sb.insert(6,str);
		System.out.println(sb);
	}
}

