import java.util.*;
//In set the index is not present
class CricPlayer{
	int jrNo=0;
	String name=null;
	CricPlayer(int jrNo,String name){
		this.jrNo=jrNo;
		this.name=name;
	}
	public String toString(){
		return name+":"+jrNo;
	}
}
//the cursor is given as reference in the interface of collection for parent referring and child object
class HashSetDemo{
	public static void main(String [] args){
		LinkedHashSet lhs= new LinkedHashSet();
		lhs.add(new CricPlayer(18,"Virat"));
		lhs.add(new CricPlayer(7,"Dhoni"));
		lhs.add(new CricPlayer(45,"Rohit"));
		lhs.add(new CricPlayer(18,"Virat"));
		lhs.add(new CricPlayer(7,"Dhoni"));
		//here each object is different from each other,
		//parameter is same that dosenot matter
		System.out.println(lhs);
	}
}


