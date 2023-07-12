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
        int n=10;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    int temp=65+n-1;
                    char ch=(char)temp;
                    System.out.print(ch+" ");
                }
                else{
                System.out.print(n+" ");
                }
                n--;
            }
            System.out.println();
        }
    }
}
