//Q10
//write a program to print the following pattern
//1 2 3 4
//4 5 6
//6 7
//7
//
//USE THIS FOR LOOP STRICTLY
//for(int i =1;i<=4;i++){
//
//}
class Pattern10{
    public static void main(String [] args){
        int row=4;
        int num1=1;
        for(int i=1;i<=row;i++){
            int num2=num1;
            for(int j=1;j<=row-i+1;j++){
                if(j==row-i+1){
                    num1=num2;
                }
                System.out.print((num2++)+" ");
            }
            System.out.println();
        }
    }
}
