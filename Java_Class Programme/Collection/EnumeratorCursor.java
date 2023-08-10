import java.util.*;
class EnumeratorCursor{
	public static void main(String [] args){
		Vector v = new Vector();
		v.add("Something");
		v.add(2);
		v.add(10);
		v.add(5);
		v.add(7);

		Enumeration cursor = v.elements(); //Enumerator cursor only works on the vector class
		//here elements() from anominotous inner is called from vector outer class
		System.out.println(cursor.getClass().getName());
		//here cursor return type is Vector$1 <--annonimous inner class
		while(cursor.hasMoreElements()){
			System.out.println(cursor.nextElement());
		}
	}
}

