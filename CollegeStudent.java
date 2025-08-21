public class CollegeStudent extends Students {
    CollegeStudent(int roll_no, String name){
        super(roll_no, name);
    }

    public void attend_class(){
        System.out.println(name + " attends lectures in college auditorium");
    }

    public void give_exam(){
        System.out.println(name + " gives exam in college auditorium");
    }
}
