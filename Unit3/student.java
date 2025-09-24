package Unit3;

public class student implements Comparable<student> {
    int age;
    String name;
    int rollno;
    public student(int age, String name, int rollno) {
        this.age = age;
        this.name = name;
        this.rollno = rollno;
    }
    public int compareTo(student s) {
        if(age == s.age){
            return 0;
        }else if(age > s.age){
            return 1;
        }else{
            return -1;
        }
    }

}
