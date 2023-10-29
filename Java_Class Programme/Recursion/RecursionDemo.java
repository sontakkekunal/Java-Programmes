class Recusrion{
	void fun(int num){//tail recursion
		if(num==0)
			return;
		System.out.println(num);
		//fun(num);  -->StackOverFlowError , because no way to pop the frame
		fun(--num);
	}
	public static void main(String [] args){
		System.out.println("Start main");
		new Recusrion().fun(2);
		System.out.println("end main");
	}
}
