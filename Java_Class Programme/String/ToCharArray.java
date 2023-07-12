class ToCharArray{
    static int myStrLen(String str){
        char arr[]=str.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            count++;
        }
        return count;
    }
    public static void main(String [] args){
        String str1="ShashiBagal";
        System.out.println(str1.length());
        int len=myStrLen(str1);
        System.out.println(len);
    }
}