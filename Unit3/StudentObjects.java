package Unit3;

import java.util.ArrayList;
import java.util.Collections;

public class StudentObjects {
    public static void main(String[] args) {
        ArrayList<student> stobj = new ArrayList<>();
        stobj.add(new student(21, "abhay", 1000));
        stobj.add(new student(2, "aman", 1022));
        stobj.add(new student(21, "abhay", 1034));
        stobj.add(new student(281, "abhay", 1002));
        stobj.add(new student(211, "abhay", 1001));
        Collections.sort(stobj);
        for(student s:stobj){
            System.out.println("name : " + s.name + "rollno : " + s.rollno + " age : " + s.age);
        }
    }

}
