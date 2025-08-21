public class collstudent extends student1{
    public int roll_no;
    public collstudent(String address,int roll_no) {
        super(address);
        this.roll_no = roll_no;
        this.address = address;
    }
    public void show_roll_no(){
        System.out.println("roll no is "+roll_no);
    }
}
