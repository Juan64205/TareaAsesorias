package Practica7;

import java.util.Random;
import javax.swing.JOptionPane;

public class Bombero implements Employee {
    
    String name;
    int age;
    String position[] = {"Jefe de cuerpo", "Suboficial", "Bombero"};
    
    public Bombero(){
    
    }
    
    public Bombero(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String getName(){
        return "Bob";
    }
    
    @Override
    public int getAge(){
        return 38;
    }
    
    @Override
    public String getPosition(){
        int index = new Random().nextInt(position.length);
        return position[index];
    }

    @Override
    public double getHorasT() {
        double workhour = 0;
        boolean fireman = false;
        try
        {
            workhour = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor ingrese las horas trabajadas."));
            fireman = true;
        }catch(Exception e){
            fireman = false;
        }
        return workhour;
    }
    
     @Override
    public double getValorHora(){
      double valhour = 0;
      boolean fireman = false;
      try
      {
          valhour = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor ingrese el valor de la hora."));
          fireman = true;
      }catch(Exception e){
          fireman = false;
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
