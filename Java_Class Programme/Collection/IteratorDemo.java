import java.util.*;
class InteratorDemo{
	public static void main(String [] args){
		ArrayList al= new ArrayList();
		al.add("Kanhna");
		al.add("Rahul");
		al.add("Ashish");

		Iterator itr=al.iterator();
		/*
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		while(itr.hasNext()){
			System.out.println(itr.next());
			if((itr.next()).equals("Rahul")){
				itr.remove();
				System.out.println("gere");
			}
			//System.out.println(itr.next());
		}
				
	}
}
