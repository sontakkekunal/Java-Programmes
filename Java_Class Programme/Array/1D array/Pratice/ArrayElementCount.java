class HelloWorld {
    public static void main(String[] args) {
        int arr[]={10,290,9999,8};
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            int count =0;
            while(temp!=0){
                count++;
                temp=temp/10;
            }
            System.out.print(count+" ");
            
                
            }
            
        }
        
        }
    
