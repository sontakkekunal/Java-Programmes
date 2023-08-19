import java.util.*;
class TreeMapDemo{
	public static void main(String [] args){
		TreeMap tm = new TreeMap();
		tm.put("Ind","India");
		tm.put("Pak","Pakistan");
		tm.put("SL","SriLanka");
		tm.put("Aus","Australia");
		tm.put("Ban","Bangaladesh");
		System.out.println(tm);//as a treemap is child of sortedmap , it stores the elements in sorted key sequence
	}
}
