class Recusrion{
        void fun(int num){//non-tail recursion
                if(num==0)
                        return;
                num=5+fun(--num);// return type is void ,so error
		System.out.println(num);

        }
        public static void main(String [] args){
                System.out.println("Start main");
                new Recusrion().fun(2);
                System.out.println("end main");
        }
}

