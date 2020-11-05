package Practica7;

import Practica7.Doctor;
import java.util.ArrayList;
import java.util.regex.*;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad de nombres."));
        ArrayList<String> Lista = new ArrayList<String>();
        int vector[] = new int[cant];
        String name;
        int age;
        String position;
        double horasTrabajadas;
        double valorHora;
        String cadena = "";
        Doctor doc = new Doctor();
        
        for (int i = 0; i < cant; i++) {
            boolean bandera = true;
            name = JOptionPane.showInputDialog("Por favor ingrese su nombre.");
            
            do {
                Pattern patron = Pattern.compile("[A-Za-z]");
                Matcher encaja = patron.matcher(name);
                
                if (!encaja.find() || (name == null || name.equals(""))) {
                    bandera = true;
                    JOptionPane.showMessageDialog(null, "Lo que ingreso no es un nombre.\n Por favor intentelo denuevo");
                    name = JOptionPane.showInputDialog("Por favor ingrese nuevamente su nombre.");
                } else {
                    bandera = false;
                    Lista.add(name);
                }
            } while (bandera == true);
        }

        for (int i = 0; i < cant; i++) {
            boolean bandera = false;
            
            do {
                try {
                    age = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su edad."));
                    bandera = true;
                    vector[i] = age;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error, solo se permiten numeros.");
                    bandera = false;
                }
            } while (!bandera);
            cadena = cadena + vector[i] + " ";
        }

        for (int i = 0; i < cant; i++) {
            doc.getName();
            doc.getAge();
            doc.getPosition();
        }

        JOptionPane.showMessageDialog(null, Lista);
        JOptionPane.showMessageDialog(null, cadena);
        JOptionPane.showMessageDialog(null, doc.getSalario());
    }
}
