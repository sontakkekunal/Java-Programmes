class StringBufferInitialCapacity{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer(100);
        
        sb.append("Bienscaps");
        sb.append("Core2Web");
        
        System.out.println("StringBuffer is : "+sb);
        System.out.println("capacity is : "+sb.capacity());
        
        sb.append("Insubator");
        
        System.out.println("After appending");
        
        System.out.println("StringBuffer is : "+sb);
        System.out.println("Capacity is : "+sb.capacity());
    }
}