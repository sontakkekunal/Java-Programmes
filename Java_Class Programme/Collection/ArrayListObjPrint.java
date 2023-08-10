import java.util.*;
class ArrayListObjPrint{
	public static void main(String [] args){
		ArrayList al= new ArrayList();
		al.add(30);
		al.add(10);
		al.add(20);
		al.add(new Integer(10));
		/*
		for(Integer data: al){
			System.out.println(data);
		}
		*/ //error: incompatible types: Object cannot be converted to Integer
		//new Integer() -->object created in upper line cannot fit in the Integer data type
		for(var data: al){
			System.out.println(data);
		}
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
	}
}
