//the finilize method from Object is called when garbage collector removes any un-referred object
//this method notifes class that perticular object is deleted
class Demo{
	String str=null;
	Demo(String str){
		this.str=str;
	}
	public String toString(){
		return str;
	}
	public void finalize(){//maintaing scope and primivitive return type of overided method
		System.out.println("Notification: "+/*+str+*/" Object deleted");
	}
}
class GCDemo{
	public static void main(String [] args){
		Demo obj1= new Demo("Core2Web");
		Demo obj2= new Demo("Biencaps");
		Demo obj3= new Demo("Incubater");

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

		obj1=null;//un-referring object
		obj2=null;//un-referring objecty
		System.gc();//calling garbage collector manullay
			    //here two object was un-referred  so when gc removes that two object the finalize() method is called that each two time
		System.out.println("In main");
	}
}
