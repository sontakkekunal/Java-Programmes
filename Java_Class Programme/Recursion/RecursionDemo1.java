class Recusrion{
        void fun(int num){//non-tail recursion
                if(num==0)
                        return;
                //fun(num);  -->StackOverFlowError , because no way to pop the frame
                fun(--num);//num decreased before passing to the function
		System.out.println(num);
        }
        public static void main(String [] args){
                System.out.println("Start main");
                new Recusrion().fun(2);
                System.out.println("end main");
        }
}

