class Parent{
        //Static does not participate in overding 
        void fun(){
                System.out.println("In parent fun");
        }       
}       
class Child extends Parent{
        static void fun(){
                System.out.println("In Child fun");
        }       
}    
