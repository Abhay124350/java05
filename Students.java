public class Students {
    private int roll_no;
    public String name;
    Students(int roll_no, String name){
        this.setRoll_no(roll_no);
        this.name = name;
    }

    void register(){
        System.out.println("Name is "+name+" is registered with roll no "+ getRoll_no());
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}
