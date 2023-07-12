//Q8
//write a program to print the following pattern
//J
//I H
//G F E
//D C B A
//USE THIS FOR LOOP STRICTLY for the outer loop
//int row =4;
//for(int i =1;i<=row;i++){
//}
class Pattern8{
    public static void main(String [] args){
        int row=4;
        char ch='J';
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print((ch--)+" ");
                
            }
            System.out.println();
        }
    }
}
