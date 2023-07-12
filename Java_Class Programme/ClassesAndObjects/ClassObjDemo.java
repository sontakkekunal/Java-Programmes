class ClassObjDemo{
	ClassObjDemo(){
		System.out.println("In Constructor");
	}
	int x=10;
	public static void main(String [] args){
		System.out.println("In main");
		ClassObjDemo obj= new ClassObjDemo();
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
	int y=20;
}

		
