//Q8
//write a program to print the following pattern
//10
//I H
//7 6 5
//D C B A
//USE THIS FOR LOOP STRICTLY for the outer loop
//Int row=4;
//for(int i =1;i<=row;i++){
//}
class Pattern8{
    public static void main(String [] args){
        int row=4;
        char ch1='J';
        char ch2='A';
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(ch1+" ");
                }
                else{
                    int temp=(ch1-ch2)+1;
                System.out.print(temp+" ");
                }
                ch1--;
            }
            System.out.println();
        }
    }
}
