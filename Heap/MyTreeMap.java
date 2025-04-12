import java.util.TreeMap;
import java.util.Map;

public class MyTreeMap {

    static class Student implements Comparable<Student>{
        int rollNo;
        int marks;
        String name;
    
        Student( int rollNo, int marks, String name){
            this.rollNo = rollNo;
            this.marks = marks;
            this.name = name;
        }
        
        public int compareTo(Student s2){
            if(s2.marks == this.marks){
                 return this.rollNo - s2.rollNo;
            }
            else{
                return s2.marks - this.marks;
            }
        }
    }

    public static void main(String[] args) {
        TreeMap<Student, Integer>tmap = new TreeMap<>();
        
        //TreeMap<Integer, Integer>tmap = new TreeMap<>(Collections.reverseOrder());

        tmap.put(new Student(4, 50, "AMAN"), 10);
        tmap.put(new Student(1, 50, "RUTU"), 12);
        tmap.put(new Student(2, 80, "RUPALI"),12);

        //System.out.println(tmap);

        for(Map.Entry<Student, Integer>entry : tmap.entrySet()){
            System.out.print("Key -> "+entry.getKey().marks);
            System.out.println(", Value -> "+entry.getValue());
        }

       // System.out.println(tmap);

       
    }
}
