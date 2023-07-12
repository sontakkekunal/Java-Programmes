class First{
	void printing(){
		System.out.println("What to print ");
	}
}
class Second {
	static First fobj=new First();
	static int y=20;
}
class SimilarToSOP{
	public static void main(String [] args){
       	//	Second.fobj.println();
	//	System.out.println(Second.y);
	        Second obkk= new Second();
		obkk.fobj.printing();
	}
}
