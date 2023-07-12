class StringBufferDelete{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer("Core2Web");
		System.out.println("sb is : "+sb);
	//	System.out.println(System.identityHashCode(sb));
		sb.delete(2,7);
		System.out.println("After deleteig : "+sb);
	//	System.out.println(System.identityHashCode(sb));
	}
}

