class Employee1{
	int empId=10;
	String name="Kanha";
	static int y=50;
	void empInfo(){
		System.out.println("Id = "+empId);
		System.out.println("Name= "+name);
		System.out.println("y = "+y);
	}
}
class MainDemo1{
	public static void main(String [] args){
		Employee1 emp1= new Employee1();
		Employee1 emp2= new Employee1();

		emp1.empInfo();
		emp2.empInfo();

		System.out.println("--------------------");

		emp2.empId=20;
		emp2.name="Rahul";
		emp2.y=50000;

		emp1.empInfo();
		emp2.empInfo();
	}
}

