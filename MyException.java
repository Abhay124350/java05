public class MyException {
    public static void main(String[] args) {
        userdefinedexception obj = new userdefinedexception();
        try
        {
            obj.validate(87);
            obj.validate(18);

        }
       catch (InvalidAgeException e)
           {
            System.out.println(e.getMessage());
           }
    }
}
