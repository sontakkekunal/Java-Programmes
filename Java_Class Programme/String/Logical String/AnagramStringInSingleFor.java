import java.io.*; 
 class AnagramString{ 
         boolean checkAnagramStrings(String str1,String str2){ 
                 str1=str1.toUpperCase(); 
                 str2=str2.toUpperCase(); 
                 if(str1.length()!=str2.length()) 
                         return false; 
                 char ch1[]=str1.toCharArray(); 
                 char ch2[]=str2.toCharArray(); 
                 int len=ch1.length; 
                 int j=0;
                 int k=0;
                 int count1=0;
                 int count2=0;
                 int a=len;
                 for(int i=1;i<=len*len;i++){
                    // System.out.println(j+" "+k+" "+i);
                     if(ch1[j]==ch1[k]){
                         count1++;
                     }
                     if(ch1[j]==ch2[k]){
                         count2++;
                     }
                     k++;
                     if(i!=1 &&(a==i)){
                         if(count1!=count2){
                             return false;
                         }
                         j++;
                         k=0;
                         a=a+len;
                         count1=0;
                         count2=0;
                     }
                 }                     
                 return true; 
         } 
         public static void main(String [] args)throws IOException{ 
                 BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
                 System.out.println("Enter Strings for checking it is Anagram string or not : "); 
                 System.out.println("Enter first string : "); 
                 String str1=br.readLine(); 
                 System.out.println("Enter second string : "); 
                 String str2=br.readLine(); 
                 AnagramString obj= new AnagramString(); 
                 boolean boolValue=obj.checkAnagramStrings(str1,str2); 
                 if(boolValue) 
                         System.out.println(str1+" and "+str2+" are anagram string "); 
                 else 
                         System.out.println(str1+" and "+str2+" are not anagram string "); 
         } 
 }
