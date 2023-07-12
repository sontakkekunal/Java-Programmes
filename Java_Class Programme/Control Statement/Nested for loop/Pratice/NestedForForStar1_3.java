//write program to create below star structure using nested for loop
//    *
//   * *
//  * * *
// * * * *
//* * * * *
class NestedForForStar{
       public static void main(String [] star){
                 int N=5;
		 for(int i=N;i>0;i--){
			 for(int j=i-1;j>0;j--){
				 System.out.print(" ");
			 }
			 for(int k=(N+1-i);k>0;k--){
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
       }
}

