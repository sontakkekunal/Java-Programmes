import java.util.*;
class MyClass implements Comparable{
	String str=null;
	//static Object obb=null;
	//static int num=0;
	MyClass(String str){
		//num++;
		this.str=str;
	}
	public int compareTo(Object obj){
		/*
		if(num>1){
			System.out.println((obb.str).compareTo(obj.str));
			System.out.println((obb.str));

		}*/
		String str1=obj.toString();
		int n=str.compareTo(str1);
		//System.out.println(n);
		//System.out.println(str.compareTo(obj.str));
		//obb=this;
		return n;
	}
	public String toString(){
		return str;
	}
}
class TreeSetDemo{
	public static void main(String [] args){
		TreeSet ts= new TreeSet();
		ts.add(new MyClass("Kanha"));
		ts.add(new MyClass("Ashish"));
		ts.add(new MyClass("Rahul"));
		ts.add(new MyClass("Badhe"));

		System.out.println(ts);
	}
}
