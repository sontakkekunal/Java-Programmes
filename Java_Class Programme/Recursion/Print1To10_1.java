class Print1to10{
        void numPrint(int num){
                if(num>10)
			return;
		System.out.println(num);
		numPrint(++num);
        }
        public static void main(String [] rg){
                new Print1to10().numPrint(1);
        }
}
//tail recursion:- recursion call at last
//non-tail recusrion: -reacursion call not at last

