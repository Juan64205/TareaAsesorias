
package Practica7;

import java.util.Random;
import javax.swing.JOptionPane;


public class Doctor implements Employee {

    String name;
    int age;
    String position[] = {"Enfermero", "Especialista", "Cirujano"};
    
    public Doctor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Doctor() {
        
    }
    
    @Override
    public String getName() {
        return "Francisco";
    }

    @Override
    public int getAge() {
        return 30;
    }

    @Override
    public String getPosition() {
        int index = new Random().nextInt(position.length);
        return position[index];
    }

    @Override 
    public double getHorasT(){
        double workhour = 0;
        boolean Doct = false;
        try
        {
            workhour = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor ingrese las horas trabajadas"));
            Doct = true;
        }catch(Exception e){
            Doct = false; 
        }
        return workhour;
    }
    
    @Override 
    public double getValorHora(){
        double valhour = 0;
        boolean Doct = false;
        try 
        {
            valhour = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor ingrese el valor de la hora."));
            Doct = true;
        }catch(Exception e){
            Doct = false;
        }
        return valhour;
    }
    
    @Override
    public double getSalario() {
        double salary = getHorasT() * getValorHora(); 
        JOptionPane.showMessageDialog(null, "Su salario es:");
        return salary;
    }
}
