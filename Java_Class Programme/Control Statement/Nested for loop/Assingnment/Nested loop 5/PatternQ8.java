//row=8 
 //$ 
 //@ @ 
 //& & & 
 //# # # # 
 //$ $ $ $ $ 
 //@ @ @ @ @ @ 
 //& & & & & & &  
 //# # # # # # # #  
 //Use this loop strictly for the outer loop 
 //int row; 
 //Take the number of rows from user 
 //for(int i=1;i<=row;i++){ 
 //} 
 import java.io.*; 
 class Pattern1{ 
         public static void main(String [] args)throws IOException{ 
                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                 System.out.println("Enter rows "); 
                 int row=Integer.parseInt(br.readLine()); 
                 int a=0,b=0,c=0,d=0;
                 for(int i=1;i<=row;i++){ 
                         for(int j=1;j<=i;j++){ 
                                 if(i==1 || i==a){
                                         System.out.print("$ ");
                                         a=i;              
				 }
                                 else if(i==2 || i==b){
                                         System.out.print("@ "); 
                                         b=i;         
                                 }
                                 else if(i==3 || i==c){
                                         System.out.print("& ");
                                         c=i;             
				 }
                                 else if(i==4 || i==d){ 
                                         System.out.print("# "); 
                                         d=i;         
                                 }
			 }
                         if(a==i){
                             a=i+4;
                         }
                         if(b==i){
                             b=b+4;
                         }
                         if(c==i){
                             c=c+4;
                         }
                         if(d==i){
                             d=d+4;
                         }
                         System.out.print("\n"); 
                 } 
         } 
 }
