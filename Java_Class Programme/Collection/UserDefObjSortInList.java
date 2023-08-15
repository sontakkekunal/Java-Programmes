import java.util.*;
class Employee{
	String empName=null;
	float sal=0.0f;
	Employee(String empName,float sal){
		this.empName=empName;
		this.sal=sal;
	}
	public String toString(){
		return "{"+empName+":"+sal+"}";
	}
	
}
class SortByName implements Comparator<Employee>{   //this class implements the Comparator iterface so this class is of comparator type
	public int compare(Employee obj1,Employee obj2){//internally method is --> int compare(Object,Object) 
							//the parameters type is  object and if we overide this method by Employee parameters
							//it will not be overided ,so after giving generic as Employee to this class
							//the Object parameters of compare() method is typecasted to Employee parameters of compare() 
							//and it works
							//
							//Comparator interface has two method compare() and equals() but giving body to compare() is 
							//only neccessary , because the parent of this class is also a Object class
							//and Object class give body to equals() method
		return obj1.empName.compareTo(obj2.empName);
	}
}
class SortBySal implements Comparator<Employee>{
	public int compare(Employee obj1,Employee obj2){
		return (int)(obj1.sal-obj2.sal);
	}
}
class ListSortDemo{
	public static void main(String [] args){
		ArrayList al = new ArrayList();
		al.add(new Employee("Kanha",200000.00f));
		al.add(new Employee("Ashish",250000.00f));
		al.add(new Employee("Badhe",150000.00f));
		al.add(new Employee("Rahul",175000.00f));
		
		System.out.println(al);

		Collections.sort(al,new SortByName());//static void sort(list,Comparator) method sorts the object of the list by asending order value
						      //return from the compare() method 
						      //static void sort(list,Comparator) , this sort method internally call the compare method of
						      //class passed comparator type
		System.out.println(al);
		//sort(list,Comparator) method is used for sorting useredfine object is list by perticular format by logic of compare method from
		//Comparator type object

		Collections.sort(al, new SortBySal());
		System.out.println(al);
	}
}

