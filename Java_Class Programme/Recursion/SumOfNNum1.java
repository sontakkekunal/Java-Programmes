class SumOfNNum{
        int sumOfN(int num){
		if(num==0)
			return num;
		return num+sumOfN(--num);
		//return num+sumOfN(num-1); first addition operation is carred then function calling operation is carred so same output
        }
        public static void main(String [] args){
                System.out.println("Start main");
                System.out.println(new SumOfNNum().sumOfN(10));;
                System.out.println("end main");
        }
}

