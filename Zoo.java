import java.util.*;

public class Zoo{
    public static void main(String args[]){
        int opcion;
        String doctor,animal;
        boolean flag=true;
        int i,j;
            Veterinarian backup;
            Animal backup2;
        ArrayList<Animal> animals = new ArrayList<Animal>();
        ArrayList<Veterinarian> doctors = new ArrayList<Veterinarian>();

        System.out.println("\n. : Z o o  V e t e r i n a r i a n : .");
        do{
            opcion = Entrada.capturarOpcionMenu("\n1.Register veterinarian\n2.Register patient\n3.Do a Check Up\n4.Erase a patient register\n5.Erase a veterinarian register\n0.Exit",5);
            switch(opcion){
            case 1:
                Veterinarian vet = new Veterinarian(Entrada.capturarCadena("Name"),Entrada.capturarDoble("Salary"));
                doctors.add(vet);
                System.out.print("\nSalary\tDoctor\n");
                for(Veterinarian v: doctors)
                    v.printData();
                break;
            case 2:
                opcion = Entrada.capturarOpcionMenu("\nWhat animal is?\n1.Dog\n2.Cat\n3.Bird\n4.Hamster",4);
                switch(opcion){
                case 1:
                    Animal pet1 = new Dog(Entrada.capturarCadena("Name"),Entrada.capturarEntero("Age"));
                    animals.add(pet1);
                    break;
                case 2:
                    Animal pet2 = new Cat(Entrada.capturarCadena("Name"),Entrada.capturarEntero("Age"));
                    animals.add(pet2);
                    break;
                case 3:
                    Animal pet3 = new Bird(Entrada.capturarCadena("Name"),Entrada.capturarEntero("Age"));
                    animals.add(pet3);
                    break;
                case 4:
                    Animal pet4 = new Hamster(Entrada.capturarCadena("Name"),Entrada.capturarEntero("Age"));
                    animals.add(pet4);
                }
                break;
            case 3:
                doctor = Entrada.capturarCadena("Doctor's name?");
                i=0; flag=true;
                do{
                    backup = doctors.get(i);
                    if(backup.getName()==doctor)
                        flag=false;
                    else
                        i++;
                }while(flag&&(i<doctors.size()));
                animal = Entrada.capturarCadena("Pet's name?");
                j=0; flag=true;
                do{
                    backup2 = animals.get(j);
                    if(backup2.getName()==animal)
                        flag=false;
                    else
                        j++;
                }while(flag&&(j<animals.size()));
                System.out.println("\nDoctor "+backup.getName()+" is going to check up "+backup2.getName());
                backup.checkUp(backup2);
                break;
            case 4:
                animal = Entrada.capturarCadena("Pet's name?");
                i=0; flag=true;
                do{
                    backup2 = animals.get(i);
                    if(backup2.getName()==animal)
                        flag=false;
                    else
                        i++;
                }while(flag&&(i<animals.size()));
                animals.remove((i-1));
                System.out.println(backup2.getName()+" has been remove from register");
                break;
            case 5:
                doctor = Entrada.capturarCadena("Doctor's name?");
                i=0; flag=true;
                do{
                    backup = doctors.get(i);
                    if(backup.getName()==doctor)
                        flag=false;
                    else
                        i++;
                }while(flag&&(i<doctors.size()));
                doctors.remove((i-1));
                System.out.println(backup.getName()+" has been remove from register");
            }
        }while(opcion!=0);
    }
}
