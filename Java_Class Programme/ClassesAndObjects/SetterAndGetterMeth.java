class Player{
	private int jerNo=0;
	private String name=null;
	Player(int jerNo,String name){  // constructor used as setter method // we can use another for this work also
		this.jerNo=jerNo;
		this.name=name;
		System.out.println("In Constructor");
	}
	void info(){  // getter method
		System.out.println(jerNo+" = "+name);
	}
}
class SetterAndGetterMeth{
	public static void main(String [] args){
		Player obj1= new Player(10,"Virat");
		obj1.info();
		Player obj2= new Player(07,"MSD");
                obj2.info();
		Player obj3= new Player(45,"Rohit sharma");
                obj3.info();
	}
}


