import java.util.Comparator;
import java.util.PriorityQueue;

class Project{
    String projectName=null;
    int teamSize=0;
    int duration=0;
    Project(String projectName,int teamSize,int duration){
        this.projectName=projectName;
        this.teamSize=teamSize;
        this.duration=duration;
    }
    public String toString(){
        return "{"+projectName+","+teamSize+","+duration+"}";
    }
}
class SortByDuration implements Comparator{
    public int compare(Object obj1, Object obj2){
        return ((Project)obj1).duration-((Project)obj2).duration;
    }
}
class ProrityQueueDemo{
    public static void main(String args[]){
        PriorityQueue pq= new PriorityQueue(new SortByDuration());
        pq.offer(new Project("calender", 7, 20));
        pq.offer(new Project("Messanger", 10, 20));
        pq.offer(new Project("PDFReader", 16, 30));
        pq.offer(new Project("PhoneBook", 10, 32));

        System.out.println(pq);
    }
}