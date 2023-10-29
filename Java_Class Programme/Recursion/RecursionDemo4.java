class Recusrion{
        int fun(int num){//non-tail recursion
                if(num==0)
                        return 1;
                return 5+fun(--num);
        }
        public static void main(String [] args){
                System.out.println("Start main");
                int ret=new Recusrion().fun(2);
		System.out.println(ret);
                System.out.println("end main");
        }
}

