import java.util.*;
class Employee {
	int empId=0;
	String name=null;
	Employee(int empId,String name){
		this.empId=empId;
		this.name=name;
	}
	public String toString(){
		return empId+":"+name;
	}
}
class Demo{
	public static void main(String [] args){
		ArrayList al= new ArrayList();
		al.add(new Employee(25,"Kanha"));
		al.add(new Employee(15,"Ashish"));
		al.add(new Employee(22,"Rahul"));

		Collections.sort(al,(obj1,obj2)->{//directly passing overided compare method from comparator interface with help of lambda function
			return ((Employee)obj1).name.compareTo(((Employee)obj2).name);
		}
		);
		System.out.println(al);
	}
}
