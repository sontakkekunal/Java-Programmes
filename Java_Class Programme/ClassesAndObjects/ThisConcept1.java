class ThisConcept1{
	int x=15;
	static int  y=10;
	ThisConcept1(){
		System.out.println("No agruments");
	}
	void fun(){
		System.out.println("hi");
	}
	ThisConcept1(int x){
		System.out.println("parammter");
		System.out.println(this.y);
		this.fun();
	}
	ThisConcept1(ThisConcept1 this1){
		System.out.println(" paramater ThisConcept1");
		System.out.println(this1.x);
	}
	public static void main(String [] args){
		ThisConcept1 obj1=new ThisConcept1();
		ThisConcept1 obj2=new ThisConcept1(10);
		ThisConcept1 obj3=new ThisConcept1(obj1);
	}
}
