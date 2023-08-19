//Using comparator we can sort it in more than one specific way
//For sorting in the list
//Using Collections.sort(list,userDefineObject)<-- works only on the list , but can work on Map with different approch
import java.util.*;
class Platform{
	String str=null;
	int foundYear=0;
	Platform(String str,int foundYear){
		this.str=str;
		this.foundYear=foundYear;
	}
	public String toString(){
		return "{"+str+":"+foundYear+"}";
	}
}
class SortByName implements Comparator{
	public int compare(Object obj1,Object obj2){
		return ((Platform)obj1).str.compareTo(((Platform)obj2).str);
	}
}
class SortByYear implements Comparator<Platform>{
	public int compare(Platform obj1,Platform obj2){
		return obj1.foundYear-obj2.foundYear;
	}
}
class TreeMapDemo{
	public static void main(String [] args){
		TreeMap tm= new TreeMap(new SortByName());//while adding the entry , it directly jump to compareTo() method of SortByName class for
							  //sorting
							  //because of adding comparator type of object passing in constructor of map
                tm.put(new Platform("Youtube",2005),"Google");
                tm.put(new Platform("Instagram",2010),"Meta");
                tm.put(new Platform("FaceBook",2004),"Meta");
                tm.put(new Platform("ChatGPT",2022),"OpenAI");
		System.out.println(tm);

		TreeMap tm1= new TreeMap(new SortByYear());
                tm1.put(new Platform("Youtube",2005),"Google");
                tm1.put(new Platform("Instagram",2010),"Meta");
                tm1.put(new Platform("FaceBook",2004),"Meta");
                tm1.put(new Platform("ChatGPT",2022),"OpenAI");
                System.out.println(tm1);
	}
}
