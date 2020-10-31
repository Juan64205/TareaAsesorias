/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica7;

import java.util.Random;

/**
 *
 * @author Apolo
 */
public class Doctor implements Employee {

    String name;
    int age;
    String position[] = {"Enfermero", "Especialista", "Cirujano"};
    
    public Doctor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Doctor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getPosition() {
        int index = new Random().nextInt(position.length);
        return position[index];
    }
    
}
