public class Veterinarian{
    String name;
    double salary;

    public Veterinarian(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){return name;}

    public void printData(){
        System.out.println("$"+salary+"\t"+name);
    }

    public void checkUp(Animal animal){
        if(Entrada.capturarSNMenu("Is "+animal.getName()+" vaccinated?(S/N)"))
            animal.setVaccinated(true);
        else
            animal.setVaccinated(false);
        if(Entrada.capturarSNMenu("Is "+animal.getName()+" sick?(S/N)"))
            animal.setSickly(true);
        else
            animal.setSickly(false);
        if(Entrada.capturarSNMenu("Is "+animal.getName()+" wounded?(S/N)"))
            animal.setWounded(true);
        else
            animal.setWounded(false);

        //System.out.println("\n"+animal.getVaccinated()+"\n"+animal.getSickly()+"\n"+animal.getWounded());

        if(animal.getVaccinated()){
            if(animal.getSickly()){
                if(animal.getWounded())
                    treatWound(animal);
                else
                    treatSickness(animal);
            }else
                if(animal.getWounded())
                    treatWound(animal);
                else
                    System.out.println(animal.getName()+" is healthy");
        }else{
            if(animal.getSickly()){
                System.out.println(animal.getName()+" cannot be vaccinated");
                if(animal.getWounded()){
                    treatWound(animal);
                }else
                    treatSickness(animal);
            }else{
                System.out.println(animal.getName()+" is healthy");
                vaccinate(animal);
                if(animal.getWounded()){
                    System.out.println(animal.getName()+" cannot be vaccinated");
                    treatWound(animal);
                }else{
                    System.out.println(animal.getName()+" is healthy");
                    vaccinate(animal);
                }
            }

        }
    }

    public void vaccinate(Animal animal){
        animal.setVaccinated(true);
        System.out.println(animal.getName()+" was vaccinated");
    }
    public void treatWound(Animal animal){
        System.out.println(animal.getName()+" wounds has been treated");
    }
    public void treatSickness(Animal animal){
        System.out.println("Medicine has been prescribed for "+animal.getName()+"'s sickness");
    }

}
