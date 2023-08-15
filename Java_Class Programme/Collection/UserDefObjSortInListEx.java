import java.util.*;
class Movie{
	String movieNam=null;
	float coll=0.0f;
	double imdb=0;
	Movie(String movieNam,float coll,double imdb){
		this.movieNam=movieNam;
		this.coll=coll;
		this.imdb=imdb;
	}
	public String toString(){
		return "{"+movieNam+","+coll+","+imdb+"}";
	}
}
class SortByName implements Comparator<Movie>{
	public int compare(Movie obj1,Movie obj2){
		return obj1.movieNam.compareTo(obj2.movieNam);
	}
}
class SortByCollection implements Comparator<Movie>{
	public int compare(Movie obj1,Movie obj2){
		return (int)(obj1.coll-obj2.coll);
	}
}
class SortByImdb implements Comparator<Movie>{
	public int compare(Movie obj1,Movie obj2){
		return (int)((obj1.imdb-obj2.imdb)*10);
	}
}
class ArrayListDemo{
	public static void main(String [] args){
		ArrayList al= new ArrayList();
		al.add(new Movie("Intesteller",230000.00f,9.2));
		al.add(new Movie("Jobs",150000.0f,8.6));
		al.add(new Movie("Sairat",200000f,7.8));
		al.add(new Movie("Avengers",300000.0f,8.4));

		System.out.println("List is: "+al);
		Collections.sort(al, new SortByName());

		System.out.println("Sorting by name: "+al);
		Collections.sort(al, new SortByCollection());
		System.out.println("Sorting by collection: "+al);
		Collections.sort(al,new SortByImdb());
		System.out.println("Sorting by imdb: "+al);
	}
}
