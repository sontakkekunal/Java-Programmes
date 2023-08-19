import java.util.*;
class Platform implements Comparable{
	String str=null;
	int foundYear=0;
	Platform(String str,int foundYear){//if not written ,it gives CastClassException
		this.str=str;
		this.foundYear=foundYear;
	}
	public String toString(){
		return "{"+str+":"+foundYear+"}";
	}
	public int compareTo(Object obj){
		return this.foundYear-((Platform)obj).foundYear;
	}
}
class TreeMapDemo{
	public static void main(String [] args){
		TreeMap tm= new TreeMap();
		tm.put(new Platform("Youtube",2005),"Google");
		tm.put(new Platform("Instagram",2010),"Meta");
		tm.put(new Platform("FaceBook",2004),"Meta");
		tm.put(new Platform("ChatGPT",2022),"OpenAI");
		System.out.println(tm);
	}
	
}
