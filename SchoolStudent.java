public class SchoolStudent extends Students {
    SchoolStudent(int roll_no, String name){
        super(roll_no, name);

    }
    public void attend_class(){
        System.out.println(name + " Attending class offline");
    }
    public void give_exam(){
        System.out.println(name + " Giving exam offline");
    }
}
