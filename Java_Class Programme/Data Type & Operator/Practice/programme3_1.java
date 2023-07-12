class CricPlayer{
        //this will rise error:- non-static variable x cannot be referenced from a static context
        //i.e. x is store in java heap and y is pushed and store in java stack
        //And in java stack main method is excuted
        //so it rise a error
        //int x=20;

        //Solution:-Make x variable static or make a object of class
        int x=20;
        public static void main(String [] args){
		CricPlayer obj= new CricPlayer();
                int y=30;
                System.out.println("Value of x is "+obj.x);
                System.out.println("Value of y is "+y);
               // System.out.println("Sum is "+((x.obj)+y));

        }
}

