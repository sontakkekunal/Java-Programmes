//4. WAP to print the length of digits in a number.
class Q4LenOfDigit{
        int lenofDig(int num){
                if(num==0)
                        return 0;
		return 1+lenofDig(num/10);
        }
        public static void main(String [] args){
                Q4LenOfDigit obj= new Q4LenOfDigit();
                int count=obj.lenofDig(232);
                System.out.println(count);
        }
}

