package class18;

public class AccesModifierTester {
    public static void main(String[] args){
        AccesModifiers am=new AccesModifiers();

        //cannot access as name has private access
        //System.out.println(am.name);
        System.out.println(am.age);
        System.out.println(am.weight);
        System.out.println(am.color);

    }
}
