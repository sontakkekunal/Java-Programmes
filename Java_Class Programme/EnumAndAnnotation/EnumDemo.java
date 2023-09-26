//    |---- enum class  . enum class have parent Enum
enum Prolang{
	c,cpp,java,python;
}
//enum class creates the .class file , so it is a class
//enum  needs compile time constant value
//enum don't have constructor by default
//Enum class give body to all method in it,but then also it is abstract,because to avoid making Object Enum class
//all data writen in enum is object of type of its class_Name
//we cannot extend the enum class because it is final in the bytecode
class EnumDemo{
	public static void main(String [] args){
		System.out.println(Prolang.c);
		System.out.println(Prolang.java);//will return the object of the enum class_name type (Prolang) 
						 //but it internally calls toString() method , so name is printed
	}
}
//enum stores array of class_name type of object,which looks like String,but is reprent the index
