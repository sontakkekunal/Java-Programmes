class Core2Web{
	public static void main(String [] args){
		StringBuffer str= new StringBuffer("Demo");
		StringBuffer stu= new StringBuffer();
		stu=stu.append("Demo");
		System.out.println(str.capacity()==stu.capacity());
	}
}
