import java.util.ArrayList;
class CricPlayer{
	int jrNo=0;
	String name=null;
	CricPlayer(int jrNo,String name){
		this.jrNo=jrNo;
		this.name=name;
	}
	public String toString(){  //public <-- maintaing scope because toString() method is public in Object class
		return name+":"+jrNo;
	}
}
class ArrayListDemo{
	public static void main(String [] args){
		ArrayList al= new ArrayList();
		al.add(new CricPlayer(18,"virat"));
		al.add(new CricPlayer(18,"virat").jrNo);//here the String is passed in the arraylist, but here while printing it calls different toStrin
							//-g . But Why?
		al.add(new CricPlayer(7,"Dhoni"));
		al.add(new CricPlayer(45,"Rohit"));
		System.out.println(al);
	}
}
// _________________
//|_10__|_20__|__60_|
//when an integer is given in arraylist , the address of object integer class is stored in arraylist
//and while printing it internally calls to toString() method , so toString() method on integer returns the integer 


// ______________________
//|_obj1__|_obj2__|_obj3_|
//Whenever the object of predefine method is stored in arraylist, while printing it internally calls to toString() method but it prints address of that
//object, so for printing the name which we have passed , we have to overide the toString() method as above, it then while printing it automatic
//calls our toString() method

