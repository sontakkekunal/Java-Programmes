//Q3
//write a program to print the following pattern
//10
//10 9
//9 8 7
//7 6 5 4
//
//USE THIS FOR LOOP STRICTLY for the outer loop
//int row=4;
//for(int i =1;i<=row;i++){
//}
class Pattern3{
    public static void main(String [] args){
        int row=4;
        int num1=10;
        for(int i=1;i<=row;i++){
            int num2=num1;
            for(int j=1;j<=i;j++){
                if(i==j){
                    num1=num2;
                }
                System.out.print((num2--)+" ");
            }
            System.out.println();
        }
    }
}
