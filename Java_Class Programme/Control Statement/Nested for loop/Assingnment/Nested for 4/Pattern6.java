//Q6
//write a program to print the following pattern
//1
//2 3
//3 4 5
//4 5 6 7
//USE THIS FOR LOOP STRICTLY for the outer loop
//
//int row=4;
//for(int i =1;i<=row;i++){
//}
class Pattern6{
    public static void main(String [] args){
        int row=4;
        int num=1;
        for(int i=1;i<=row;i++){
            int n=num;
            for(int j=1;j<=i;j++){
                System.out.print((n++)+" ");
            }
            num++;
            System.out.println();
        }
    }
}
