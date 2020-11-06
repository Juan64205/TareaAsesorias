package Practica7;

import javax.swing.JOptionPane;
import java.util.Random;

public class Policia implements Employee{
    
    String name;
    int age;
    String position[] = {"Coronel", "Teniente", "Mayor"};
    
    public Policia(){
    
    }
    
    public Policia(String name, int age){
        this.name = name;
        this.age = age;
    } 

    @Override
    public String getName() {
        return "Jorge";
    }

    @Override
    public int getAge() {
        return 29;
    }

    @Override
    public String getPosition() {
        int index = new Random().nextInt(position.length);
        return position[index];
    }

    @Override
    public double getHorasT(){
        double workhour = 0;
        boolean policeman = false;
        try
        {
            workhour = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor ingrese las horas trabajadas."));
            policeman = true;
        }catch(Exception e){
            policeman = false;
        }    
        
        return workhour;
    }
    
    @Override
    public double getValorHora(){
        double valhour = 0;
        boolean policeman = false;
        try
        {
            valhour = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor ingrese el valor de la hora."));
            policeman = true;
        }catch(Exception e){
            policeman = false;
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
