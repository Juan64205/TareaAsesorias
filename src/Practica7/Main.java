/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica7;
import Practica7.Doctor;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese cantidad de nombres.");
        int cant = t.nextInt();
        ArrayList<String> Lista = new ArrayList<String>();
        int vector[] = new int [cant];
        String name;
        int age;
        String position;
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Porfavor ingrese su nombre.");
            Lista.add(t.nextLine());
        }
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Porfavor ingrese su edad.");
            vector[i] = t.nextInt();
        }
         
        System.out.println(Lista);
        System.out.println(vector);
        /*
        Doctor Doc = new Doctor("Jhon", 30);
        Doc.getName();
        Doc.getAge();
        Doc.getPosition();
        System.out.println(Doc.getName()+" "+Doc.getAge()+" "+Doc.getPosition());  
        */
    }
}
