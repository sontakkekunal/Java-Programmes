import java.util.*;
class ArrayListDemo{
	public static void main(String [] args){
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(20);
		al.add(20.5f);
		al.add(20.5d);
		//public void add(element)
		al.add("Shashi");// add() method adds object last of the list

		System.out.println("After using add(E) method: "+al);

		//public int size() <-- returns size of ArrayList()
		System.out.println("After using size() method: "+al.size());

		//public boolean contains(Object) <-- returns true if has that passed object in the method
		System.out.println("After using contains(Object) method: "+al.contains("Shashi"));
		System.out.println("After using contains(Object) method: "+al.contains(20));

		//public int indexOf(Object) <--returns index of object in the list from first
		System.out.println("After using indexOf(Object) method: "+al.indexOf(20));

		//public int lastIndexOf(Objet) <--returns index of object from last in the last
		System.out.println("After using lastIndexOf(Object) method: "+al.lastIndexOf(20));

		//public E get(int) <--returns object at that index
		System.out.println("After using get(int) method: "+al.get(4));

		//public E set(int,E)  <--replace old object of that index by new Object at that index location
		System.out.println("After using set(int,E) method: "+al.set(2,"C2W"));
		System.out.println("After using set(int,E) method: "+al);

		//public void add(int,E) <--adds the element at perticular index
		al.add(0,"Core2Web");
		System.out.println("Afte using add(int,E) method: "+al);

		//public  Object[] toArray() <-- returns list in form of array with Object datatype
		//Object datatype because it has all kind of data
		Object arr[]=al.toArray();//returns address of the array
		System.out.println("After using toArray() method \n address: "+arr);
		System.out.println("After using toArray() array is :");
		for(Object data: arr){
			System.out.print(data+" ");
		}

		//public E remove(int) <--remove object at perticlar index & it return object at that index
		System.out.println("\nAfter using remove(int) method it return: "+al.remove(1));
		System.out.println("After using remove(int) method: "+al);

		//boolean remove(Object) <--remove object which is passed to remove() method & returns true if it is removed
		System.out.println("After using remove(Object) method it return: "+al.remove("C2w"));
		System.out.println("After using remove(Object) method: "+al);

		ArrayList al2= new ArrayList();
		al2.add("My");
		al2.add("House");
		al2.add(07);
		//public boolean addAll(Collection) <--adds another list at last of this last
		System.out.println("After using addAll(Collection) method it return: "+al.addAll(al2));
		System.out.println("After using addAll(Collection) method : "+al);

		//public boolean addAll(int,Collection) <--adds list at perticular index of list
		System.out.println("After using addAll(int,Collection) method it returns: "+al.addAll(1,al2));
		System.out.println("After using addAll(int,Collection) method : "+al);

		//ppublic void clear() <--remove all objects of list
		al.clear();
		System.out.println("After using clear() method "+al);


	}
}

