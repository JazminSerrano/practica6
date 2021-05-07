public class Animal{
    String name;
    int age;
    boolean vaccinated;
    boolean sickly;
    boolean wounded;

    public Animal(String name, int age){
        this.name=name;
        this.age=age;
        setVaccinated(false);
    }

    public void setVaccinated(boolean vaccinated){this.vaccinated=vaccinated;}
    public boolean getVaccinated(){return vaccinated;}
    public void setSickly(boolean sickly){this.sickly=sickly;}
    public boolean getSickly(){return sickly;}
    public void setWounded(boolean wounded){this.wounded=wounded;}
    public boolean getWounded(){return wounded;}
    public String getName(){return name;}

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
}
