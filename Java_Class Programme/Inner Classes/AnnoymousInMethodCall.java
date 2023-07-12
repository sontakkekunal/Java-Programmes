class Demo{
	Demo(){
		System.out.println("In Demo Constructor");
	}
        void marry(){
                System.out.println("Krite Sanon");
        }
	Object fun(){
		System.out.println("In fun Demo");
		return new Demo();
	}
}
class Client{
        public static void main(String [] args){
                Demo obj = new Demo(){
                        void marry(){
                                System.out.println("Disha patani");
                        }
                        
                        Demo fun(){
                                System.out.println("in fun Client");
				return new Demo();
                        }
                }.fun();
                obj.marry();
                obj.fun();
        }
}

