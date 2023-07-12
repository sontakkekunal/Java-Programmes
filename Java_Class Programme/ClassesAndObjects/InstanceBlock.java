class InstanceBlock{
	int x=10;
	InstanceBlock(){
		System.out.println("Constructor");
	}
	{
		System.out.println("Instance Block 1");
	}
	public static void main(String [] args){
		InstanceBlock obj =new InstanceBlock();
	}
	{
		System.out.println("Instance block 2");
	}
}
