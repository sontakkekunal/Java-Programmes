class Outer{
	class Inner{  //<-- non static classs
		void m1(){  
			System.out.println("Inner-m1");
		}
	}
	void m2(){
		System.out.println("Outer-m2");
	}
	public static void main(String [] args){
		Inner obj = new Outer().new Inner();  //<--- need to make object of Outer class,for reffering inner class beacaue inner class is like a   treadted non-static variable
		obj.m1();
	}
}
