package class18;

public class Facebook {
    private String userName;
    private String password;
    private int age;
    void setAge(int personAge){
        if(age>13&& age<120){
            age=personAge;
        }else{
            System.out.println("Not " + "allowed its not Horse");
        }
    }

}
