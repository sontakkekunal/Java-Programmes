class ThisConcept{
	int x=10;
	ThisConcept(){
		System.out.println("In Constructor");
		System.out.println(this);
		System.out.println(this.x);
	}
	void fun(){
		System.out.println(this);
		System.out.println(x);
	}
	public static void main(String [] args){
		ThisConcept obj = new ThisConcept();
		System.out.println(obj);
	}
}

