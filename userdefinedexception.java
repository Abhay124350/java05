// step 2 continued
public class userdefinedexception{
    public void validate(int age) throws InvalidAgeException{
        if(age <= 18){
            throw new InvalidAgeException("Not eligible to vote");
        }else{
            System.out.println("You are eligible to vote");
        }
    }
}
