package Practica7;
import Practica7.Doctor;
import java.util.ArrayList;
//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
    
        int cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de nombres."));
        ArrayList<String> Lista = new ArrayList<String>();
        int vector[] = new int[cant];
        String name;
        int age; 
        String position;
        String vec = " ";
        Doctor Doc = new Doctor();
        Bombero Fire = new Bombero();
        Policia Sherif = new Policia();
       
        
        for (int i = 0; i < cant; i++) {
            name = JOptionPane.showInputDialog("Ingrese el nombre");
            boolean nm = name.matches("^([A-Z]{1}[a-z])$");
            Lista.add(name);
        }
        
        for (int i = 0; i < cant; i++){
            boolean old = false;
            try
            {
                age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad."));
                vector[i] = age;
                vec = vec + vector[i];
                old = true;
            }catch(Exception e){
                old = false;
            }
        }
        
        for (int i = 0; i < cant; i++){
            JOptionPane.showMessageDialog(null, Doc.getName());
            JOptionPane.showMessageDialog(null, Doc.getAge());
            JOptionPane.showMessageDialog(null, Doc.getPosition());
        }
        
        for (int i = 0; i < cant; i++){
            JOptionPane.showMessageDialog(null, Fire.getName());
            JOptionPane.showMessageDialog(null, Fire.getAge());
            JOptionPane.showMessageDialog(null, Fire.getPosition());
            JOptionPane.showMessageDialog(null, Fire.getSalario());
        }
        
        for (int i = 0; i < cant; i++){
            JOptionPane.showMessageDialog(null, Sherif.getName());
            JOptionPane.showMessageDialog(null, Sherif.getAge());
            JOptionPane.showMessageDialog(null, Sherif.getPosition());
            JOptionPane.showMessageDialog(null, Sherif.getSalario());
        }
         
            JOptionPane.showMessageDialog(null, Lista);
            JOptionPane.showMessageDialog(null, vec);
            JOptionPane.showMessageDialog(null, Doc.getSalario());
    }
}
