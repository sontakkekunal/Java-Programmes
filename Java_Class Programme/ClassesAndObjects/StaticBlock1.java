class DemoStatic{
	static{
		System.out.println("Static Block 1");
	}
	public static void main(String [] args){
		System.out.println("In Demo main");
	}
}
class StaticBlock1{
	static {
		System.out.println("Static Block 2");
	}
	public static void main(String [] armm){
		System.out.println("In client main");
	}
	static {
		System.out.println("static block 3");
	}
}
		
