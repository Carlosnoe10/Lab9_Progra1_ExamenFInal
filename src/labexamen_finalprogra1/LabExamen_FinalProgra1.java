
package labexamen_finalprogra1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class LabExamen_FinalProgra1 {

    public static void main(String[] args) {
        Began();
    }
    public static void Began(){
    Scanner G2HOPE=new Scanner(System.in);
    System.out.println("Ingrese el nombre de su granja");
    String Name=G2HOPE.nextLine();
    Granja granja =  new Granja(Name);
    boolean intro=true;
    System.out.println("---------"+granja.nombre+"---------");
    int contDias=1;
    int contcos=0;
    int vida= new Random().nextInt((120-60)+1)+60;
    while(intro=true){
        for (int i = 0; i < 1; i++) {
        System.out.println("---------"+contDias+"---------");
        System.out.println("Ingrese que hacer en el dia");
        System.out.println("1. Plantar cosechas");
        System.out.println("2. Cosechar las cosechas");
        System.out.println("3. Conseguir animales");
        System.out.println("4.Vender cosas");
        System.out.println("5. Dormir");
        System.out.println("6. Fin?");
        int choice=G2HOPE.nextInt();
            if ((choice>0)&&(choice<7)) {
            i++;
        switch(choice){
            case 1:
                if (contcos==0) {
                for (int q = 0; q < 1; q++) {
                System.out.println("Cuantas plantas desea cosechar? ");
                int plants=G2HOPE.nextInt();
                    for (int t = 0; t < plants; t++) {
                        granja.addVegetal();
                    }
                    if (plants >0) {
                        q++;
                    }else{
                        System.out.println("Valor Invalido");
                        q--;
                    }
                }
                System.out.println("Plantando cosechas");
                contcos=5;
                System.out.println("Las cosechas tardan "+contcos+" en estar listas");
                }else{
                    System.out.println("No se puede cosechas (Ya hay cosecha cosechandose XD)");
                }
                break;
            case 2:
                int contSpeed=0;
                if (contcos<0) {
                    for (int j = 0; j < (granja.vegetales).size(); j++) {
                        contSpeed=+1;
                        (granja.vegetales).remove(j);
                    }
                        int dinero=granja.getDinero();
                        dinero+=(100*contSpeed);
                        granja.setDinero(dinero);
                        contcos=-1;
                }else{
                    System.out.println("No se pueden cosechar a un estan tiernitas faltan "+contcos+" dias");
                }
                break;
            case 3:
                for (int w = 0; w < 10; w++) {
                System.out.println("Cantidad de dinero actual es: "+granja.dinero);
                System.out.println("1-Conejos -> 150 diners ");
                System.out.println("2-Vacas -> 360 diners ");
                int pets=G2HOPE.nextInt();
                    if ((pets==1)&&(pets==2)) {
                        w++;
                        switch(pets){
                            case 1:
                                if (granja.getDinero()>=150) {
                                    
                                for (int e = 0; e < 1; e++) {
                                System.out.println("Cuantos conejos desea?");
                                int shady=G2HOPE.nextInt();
                                    if ((shady>0)&&(150*shady<granja.getDinero())) {
                                        e++;
                                        for (int d = 0; d < shady; d++) {
                                            System.out.println("Ingrese el nombre del conejito");
                                            G2HOPE=new Scanner(System.in);
                                            String nameRab=G2HOPE.nextLine();
                                            granja.addConejo(nameRab);
                                            System.out.println(nameRab+" Ha sido enviado a la granja");
                                            int dinero=granja.getDinero();
                                            dinero-=150;
                                            granja.setDinero(dinero);
                                            System.out.println("Tu nueva cantidad de dinero es"+dinero);
                                        }
                                    }else{
                                        e--;
                                        System.out.println("Valor Invalido");
                                    }
                                }
                                }else{
                                    System.out.println("No tiene dinero");
                                    
                                }
                                break;
                            case 2:
                                if (granja.getDinero()>=350) {
                                for (int e = 0; e < 1; e++) {
                                System.out.println("Cuantas vaquitas desea?");
                                int cowis=G2HOPE.nextInt();
                                    if ((cowis>0)&&(350*cowis<granja.getDinero())) {
                                        e++;
                                        for (int d = 0; d < cowis; d++) {
                                            System.out.println("Ingrese el nombre del conejito");
                                            G2HOPE=new Scanner(System.in);
                                            String nameCow=G2HOPE.nextLine();
                                            granja.addConejo(nameCow);
                                            System.out.println(nameCow+" Ha sido enviado a la granja");
                                            int dinero=granja.getDinero();
                                            dinero-=350;
                                            granja.setDinero(dinero);
                                            System.out.println("Tu nueva cantidad de dinero es"+dinero);
                                        }                                    
                                    }else{
                                        e--;
                                        System.out.println("Valor Invalido o dinero insuficiente");
                                    }
                                }
                                break;
                        }else{
                                    System.out.println("No tiene dinero");               
                                }
                        }  
                    }else{
                        System.out.println("Valor invalido");
                        w--;
                    }
                    }
                break;
            case 4:
                System.out.println("-----------Analisis de granja-------------");
                int vegetales=granja.printSizeVe();
                int conejos=granja.printSizeC();
                int vacas=granja.printSizeV();
                System.out.println("Tienes "+vegetales+" Vegetales");
                System.out.println("Tienes "+conejos+" Conejos");
                System.out.println("Tienes "+vacas+" Vacas");
                System.out.println("Tienes "+granja.dinero+" Dinero");
                System.out.println("-------------------------------------------");
                for (int j = 0; j < 1; j++) {
                    System.out.println("Seleccione");
                    System.out.println("1.-Vegetales");
                    System.out.println("2.-Conejos");
                    System.out.println("3.-Vacas");
                    int select=G2HOPE.nextInt();
                    if ((select==1)&&(select==2)&&(select==3)) {
                        j++;
                        switch(select){
                            case 1:
                                for (int l = 0; l < 1; l++) {
                                System.out.println("Ingrese la cantidad que desea vender");
                                int sell=G2HOPE.nextInt();
                                    if (sell>(granja.getVegetales()).size()) {
                                        l++;
                                     for (int k = 0; k < sell; k++) {
                                         System.out.println("Adios "+ granja.getNombre()+" Murio por mujeriego");
                                    (granja.getVegetales()).remove(0);
                                    granja.setDinero(+100);
                                    }    
                                }else{
                                    l--;
                                    }
                                    System.out.println("Se han vendido "+sell+" vegetales");
                                    System.out.println("Tienes "+granja.dinero+" Dinero");
                                }
                                break;
                            case 2:
                                for (int l = 0; l < 1; l++) {
                                System.out.println("Ingrese la cantidad que desea vender");
                                int sell=G2HOPE.nextInt();
                                    if (sell>(granja.getConejos1()).size()) {
                                        l++;
                                     for (int k = 0; k < sell; k++) {
                                         System.out.println("Adios "+ granja.getNombre()+" Murio por mujeriego");
                                    (granja.getConejos1()).remove(0);
                                    granja.setDinero(+170);
                                    }    
                                }else{
                                    l--;
                                    }
                                    System.out.println("Se han vendido "+sell+" conejos");
                                    System.out.println("Tienes "+granja.dinero+" Dinero");
                                }    
                                break;
                            case 3:
                                for (int l = 0; l < 1; l++) {
                                System.out.println("Ingrese la cantidad que desea vender");
                                int sell=G2HOPE.nextInt();
                                    if (sell>(granja.getVacas()).size()) {
                                        l++;
                                     for (int k = 0; k < sell; k++) {
                                    (granja.getVacas()).remove(0);
                                    granja.setDinero(+400);
                                    }    
                                }else{
                                    l--;
                                    }
                                    System.out.println("Se han vendido "+sell+" Vacas");
                                    System.out.println("Tienes "+granja.dinero+" Dinero");
                                }
                                break;
                        }
                    }else{
                        System.out.println("Valor invalido");
                        i--;
                    }
                }
                
                
                break;
            case 5:
                break;
            case 6:
                vida=vida-contDias;
                System.out.println("Tu sabias los dias que te faltan, no te acuerdas pero fue una maldicion del pueblo donde vives dias faltantes "+vida);
                break;            
        }
        System.out.println("Fin del dia");
        contDias+=1;
        contcos-=1;
    }else{
                System.out.println("Valor Invalido");
                i--;
            }
    }    
        if ((contcos>0)&&(contDias>=1)) {
            System.out.println("Faltan "+contcos+" para que las csechas esten listas");
        }else if(contcos==0) {
            System.out.println("Su cosecha esta lista");
        }else{
            System.out.println("No hay cosechas");
        }     
    }
        System.out.println("Feliz dia de tu muerte");
        System.out.println("uwu");
}
}
// dentro de la granja public void addvaca<Arraylist>
//vaca nombre y precio y lo mismo para los demas animales
// las cosechas van a estar listas desde el pricipio pero voy a validar los dias para que no se puedan vender