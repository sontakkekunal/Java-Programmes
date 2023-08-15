import java.util.*;
class CursorOnLinkedHashSet{
        public static void main(String [] args){
                LinkedHashSet lhs= new LinkedHashSet();
                lhs.add("Kunal");
                lhs.add("Swarup");
                lhs.add("Pawar");
                lhs.add("tanmay");
                lhs.add("prasad");

                System.out.println(lhs);

                Iterator itr=lhs.iterator();
                System.out.println(itr.getClass().getName());
                while(itr.hasNext()){
                        System.out.println(itr.next());
                }
                //ListIterator cursor =hs.listIterator();<-- ListIterator is not persent in Set
        }
}
 
