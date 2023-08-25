import java.util.PriorityQueue;

class Project implements Comparable{
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
    public int compareTo(Object obj){
        return ((Project)obj).projectName.compareTo(projectName);
    }
}
class ProrityQueueDemo{
    public static void main(String args[]){
        PriorityQueue pq= new PriorityQueue();
        pq.offer(new Project("calender", 7, 20));
        pq.offer(new Project("Messanger", 10, 20));
        pq.offer(new Project("PDFReader", 16, 30));

        System.out.println(pq);
    }
}
