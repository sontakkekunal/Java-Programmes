class Demo{
	static{
		System.out.println("In Demo stattic 1");
	}
	Demo(){
		System.out.println("In Demo constructor");
	}
	static{
		System.out.println("In Demo static 2");
	}
}
class StaticForOtherClass{
	public static void main(String [] args){
		System.out.println("In main");
		Demo obj = new Demo();
	}
}
