//Q4
//write a program to print the following pattern
//1 2 3 4
//2 3 4
//3 4
//4
//
//int row=4;
//for(int i =1;i<=row;i++){
//}
class Pattern4{
    public static void main(String [] args){
        int row=4;
        int num=1;
        for(int i=1;i<=row;i++){
            int n=num;
            for(int j=1;j<=row-i+1;j++){
                if(j==2){
                    num=n;
                }
                System.out.print((n++)+" ");
            }
            System.out.println();
        }
    }
}
