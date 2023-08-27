//lambda function expression work only on functional interface
//lambda function is launched at java 1.8
//Functional interface:- the interface that have only one method
interface Core2Web{
        String lang(int numCourse);
}
//lamdbda expression is used to create instances of funstional interface (method referance or constructor refernce)
//new annmyous inner class is not created here,beacsuse pushing byte code of class is heavy operation
class Year2022{
        public static void main(String [] args){
			    //(String xyz) -> internaly , also can give this
                Core2Web c2w=(xyz)->"bootcamp/Java/python/c"+xyz;
				//based on the parameter list it matches lambda function
				     //work for only one parameter
                
                System.out.println(c2w.lang(8));
        }
}

