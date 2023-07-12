class StringBufferDemo{
    public static void main(String [] args){
        StringBuffer sb= new StringBuffer();
        
        System.out.println("StringBuffer is : "+sb);
        System.out.println("capacity :-  "+sb.capacity());
        System.out.println("Identity hash code is : "+System.identityHashCode(sb)+"Hash code is : "+sb.hashCode());
        
        sb.append("Shashi");
        System.out.println("Atfer appending ");
        
        System.out.println("StringBuffer is : "+sb);
        System.out.println("capacity :-  "+sb.capacity());
        System.out.println("Identity hash code is : "+System.identityHashCode(sb)+"Hash code is : "+sb.hashCode());
        
        sb.append("Bagal");
        System.out.println("Atfer appending ");
        
        System.out.println("StringBuffer is : "+sb);
        System.out.println("capacity :-  "+sb.capacity());
        System.out.println("Identity hash code is : "+System.identityHashCode(sb)+"Hash code is : "+sb.hashCode());
        
        sb.append("Core2Web");
        System.out.println("Atfer appending ");
        
        System.out.println("StringBuffer is : "+sb);
        System.out.println("capacity :-  "+sb.capacity());
        System.out.println("Identity hash code is : "+System.identityHashCode(sb)+"Hash code is : "+sb.hashCode());
    }
}
