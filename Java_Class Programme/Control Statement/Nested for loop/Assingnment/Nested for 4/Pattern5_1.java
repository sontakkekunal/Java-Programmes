//Q5
//write a program to print the following pattern
//A B C D
//B C D
//C D
//D
//int row=4;
//for(int i =1;i<=row;i++){
//}
class Pattern5{
    public static void main(String [] args){
        int row=4;
        char ch1='A';
        for(int i=1;i<=row;i++){
            char ch2=ch1;
            for(int j=1;j<=row-i+1;j++){
                if(j==2){
                    ch1=ch2;
                }
                System.out.print((ch2++)+" ");
            }
            System.out.println();
        }
    }
}
