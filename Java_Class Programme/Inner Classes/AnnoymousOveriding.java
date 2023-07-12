class Demo{
	void marry(){
		System.out.println("Krite Sanon");
	}
}
class Client{
	public static void main(String [] args){
		Demo obj = new Demo(){
			void marry(){
				System.out.println("Disha patani");
			}
			/*
			void fun(){
				System.out.println("in fun");
			}
			*/  //<-- thsi function not persent in Demo , so during comiple time fun() is checked in Demo,, and not found to error
		}.fun();
		obj.marry();
		//obj.fun(); // <--above reason
	}
}
