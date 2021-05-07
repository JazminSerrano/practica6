public class Bird extends Animal{
    public Bird(String name, int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println(name+" is eating fruits");
    }
}
