//Q7
//write a program to print the following pattern
//F
//E 1
//D 2 E
//C 3 D 4
//B 5 C 6 D
//A 7 B 8 C 9
//USE THIS FOR LOOP STRICTLY for the outer loop
//Int row=6;
//for(int i =1;i<=row;i++){
//}
class Pattern7{
    public static void main(String [] args){
        int row=6;
        char ch1='F';
        int num=1;
        for(int i=1;i<=row;i++){
            char ch2=ch1;
            for(int j=1;j<=i;j++){
                if(j%2==1){
                    System.out.print((ch2++)+" ");
                }
                else
                System.out.print((num++)+" ");
            }
            ch1--;
            System.out.println();
        }
    }
}
