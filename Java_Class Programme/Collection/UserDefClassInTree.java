import java.util.*;
class Movie implements Comparable{
	String movieName=null;
	float totColl=0.0f;
	Movie(String movieName,float totColl){
		this.movieName=movieName;
		this.totColl=totColl;
		System.out.println(this+" Object");
	}
	public int compareTo(Object obj){
		System.out.println(obj+" c");
		System.out.println(movieName);
		System.out.println(((Movie)obj).movieName);
		int n= movieName.compareTo(((Movie)obj).movieName);
		System.out.println(n);
		return n;
	}
	public String toString(){
		return movieName;
	}

}
class TreeSetDemo{
	public static void main(String [] args){
		TreeSet ts= new TreeSet();
		ts.add(new Movie("Gadar2",150.00f));
		ts.add(new Movie("OMG2",120.00f));
		ts.add(new Movie("Jailer",250.00f));
		//ts.add(new Movie("OMG2",120.00f));
		System.out.println(ts);
	}
}
