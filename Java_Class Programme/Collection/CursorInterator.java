import java.util.*;
class CursorIterator{
	public static void main(String [] args){
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20);
		al.add(20.5);
		al.add(30.5f);
		al.add("C2W");
		for(var x:al){
			System.out.println(x.getClass().getName());
		}
		//getClass() method is present in the class Class
		//Our class is made by referring class Class
		//Our class has its  type Class
		

		//iterator
		Iterator cursor = al.iterator();//iterator() methods Interator Object of the list
		//So cursor of type Iterator is required to store the iterator
		//but the iterator() method is present in the interface Interator,i.e. iterator() is public abstract i.e. no body to method iterator()so
		//it must give error , but it doesn't, Because
		//Actully al.iterator() method is called form al i.e. object of the any list 
		//And each list have inner class ,which gives body to iterator() method from Interator interface 
		//Inner class name varies with List type 


		System.out.println(cursor.getClass().getName());//so actually return type of cursor is that inner class name , not Iterator interface
								//here name of inner class is ArrayList$Itr , which gives body to that abstract method
		while(cursor.hasNext()){
			System.out.println(cursor.next());
		}
		cursor= al.iterator();  //cursor is reseted
		while(cursor.hasNext()){
			if("C2W".equals(cursor.next()))
				cursor.remove();
		}
		System.out.println(al);

		//at starting the cursor is before the first Object or starting of list
		//when next() method is called , first next() method increment the cursor to next object and then prints that current object at that time
		//hasNext() method checks the next Object   is present or not , and if yes then retunr true , if not then return false
	}
}

