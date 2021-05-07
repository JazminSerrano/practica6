import java.util.*;

public class Entrada{
    public static String capturarCadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }
    public static double capturarDoble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextDouble());
    }
    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextInt());
    }
    public static boolean capturarSNMenu(String msg){
        String opcion="";
        boolean bandera=false;
        do{
            opcion = capturarCadena(msg);
            if(!Validacion.validarConsonante(opcion))
                System.out.print("Ingrese una S para si y una N para no.\n");
        }while(!Validacion.validarConsonante(opcion));
        if(opcion.equals("S"))
            bandera=true;
        return bandera;
    }
    public static int capturarOpcionMenu(String msg,int numOp){
        String opcion="";
	    System.out.print(msg+"\n");
        do{
            opcion = capturarCadena("Opcion");
            if(!Validacion.validarEntero(opcion)||Integer.parseInt(opcion)>numOp)
                System.out.print("Ingrese una opcion numerica del menu.\n");
        }while(!Validacion.validarEntero(opcion)||Integer.parseInt(opcion)>numOp);
        return (Integer.parseInt(opcion));
    }
}
