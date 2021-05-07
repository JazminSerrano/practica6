public class Hamster extends Animal{
    public Hamster(String name, int age){
        super(name,age);
    }
    public void gnaw(){
        System.out.print(name+": *chew chew chew*");
    }
}
