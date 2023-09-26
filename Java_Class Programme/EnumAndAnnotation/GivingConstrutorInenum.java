//by default constructor is not in enum class , but if we write it ,then it give call to construvtor autmaticaally that many line , the number of object presnet is enum
enum LineUp{
        Rohit,
        Gill,
        Virat,
        KLRahul;

	LineUp(){
		System.out.println("In conatrutor");
	}
	//gives call to constructor 4 times , beacuse 4 object  is made in enum,so it is proof that object is made in enum
        public static void main(String [] args){
	}
}
