/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamen_finalprogra1;

import java.util.ArrayList;

public class Granja {

    String nombre;
    ArrayList<Vaca> vacas = new ArrayList<>();
    ArrayList<Vegetal> vegetales = new ArrayList();
    ArrayList<Conejo> conejos1 = new ArrayList<>();
    int dinero;

    public Granja() {

    }

    public ArrayList<Vaca> getVacas() {
        return vacas;
    }

    public void setVacas(ArrayList<Vaca> vacas) {
        this.vacas = vacas;
    }

    public ArrayList<Vegetal> getVegetales() {
        return vegetales;
    }

    public void setVegetales(ArrayList<Vegetal> vegetales) {
        this.vegetales = vegetales;
    }

    public ArrayList<Conejo> getConejos1() {
        return conejos1;
    }

    public void setConejos(ArrayList<Conejo> conejos) {
        this.conejos1 = conejos;
    }

    public Granja(String nombre) {
        this.vacas = new ArrayList<>();
        this.conejos1 = new ArrayList<>();
        this.vegetales = new ArrayList<>();
        this.dinero = 500;
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    

    public void addVegetal() {

        Vegetal vegetal = new Vegetal();
        vegetales.add(vegetal);

    }

    public void addConejo(String nombre) {
        Conejo conejos = new Conejo(nombre);
        conejos1.add(conejos);
    }

    public void addVaquitas(String nombre) {
        Vaca vacas1 = new Vaca(nombre);
        vacas.add(vacas1);
    }
    public int printSizeV(){
        int value1=vacas.size();
        return value1;
    }
    public int printSizeC(){
        int value2=conejos1.size();
        return value2;
    }
    public int printSizeVe(){
        int value3=vegetales.size();
        return value3;
    }    
    public void printGranja(){
        int value1=vacas.size();
        int value2=conejos1.size();
        int value3=vegetales.size();
    }
}
