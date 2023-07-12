class Parent{
        //Static does not participate in overding 
	//But in static to static ,the parent method is hidded by child class method ,this is called method hidding ,not method overiding
        static void fun(){
                System.out.println("In parent fun");
        }       
}       
class Child extends Parent{
        static void fun(){  //this is new different method
                System.out.println("In Child fun");
        }       
}    
class Client{
	public static void main(String [] args){
		Parent obj1 = new Parent();
		obj1.fun();

		Child obj2 = new Child();
		obj2.fun();

		Parent obj3 = new Child();
		obj3.fun();  //<---- At compile time it checks fun method in parent and reference of parent fun is stored in obj3 ,but as fun method 
			     // is static , the that method is called with there parent referse during runtime also ,eventhough the child object is made
			     //  this is for static method and making parent refers and child object 
	}
}
