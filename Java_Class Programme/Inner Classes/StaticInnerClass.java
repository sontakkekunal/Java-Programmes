class Outer{
	void m1(){
		System.out.println("In m1-oueter");
	}
	static class Inner{
		void m1(){
			System.out.println("m1-Inner");
		}
	}
	public static void main(String [] args){
		Inner obj = new Inner();
		obj.m1();
	}
}
