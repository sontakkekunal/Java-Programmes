class OnlyInStatic{
	int x=10;
	void methods(){
		System.out.println("In methods method");
		System.out.println(x);
	}
	static{
		System.out.println("In static block");
		OnlyInStatic obj =new OnlyInStatic();
		System.out.println(obj.x);
		obj.methods();
		System.exit(0);
	}
	public static void main(String [] args){
		System.out.println("In main");
	}
}
