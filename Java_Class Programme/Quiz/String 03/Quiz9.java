class Core2Web{
	public static void main(String [] args){
		StringBuffer sbvar1= new StringBuffer("core2web");
		long lvar1 = System.identityHashCode(sbvar1);
		sbvar1.append("technologies");
		long lvar2 = System.identityHashCode(sbvar1);
		if(lvar1==lvar2)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
