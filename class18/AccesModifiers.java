package class18;

public class AccesModifiers {
    private String name="Naughty Tarik";
    int age=50;//default access
    protected double weight=50;
    public String color="white";

    public static void main(String[] args){
        AccesModifiers am=new AccesModifiers();
        System.out.println(am.name);
        System.out.println(am.age);
        System.out.println(am.weight);
        System.out.println(am.color);

    }


}
