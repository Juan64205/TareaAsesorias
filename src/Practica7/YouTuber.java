package Practica7;

import java.util.Random;
import javax.swing.JOptionPane;

public class YouTuber implements Employee {

    private String name;
    private int age;
    private String position[] = {"Gamplays", "Viajes", "Tutoriales"};

    public YouTuber(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public double getCantidadHorasTrabajadas() {
        double horasTrabajadas = -1;
        boolean bandera = false;
        do {
            try {
                horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese horas trabajadas."));
                bandera = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error, solo se permiten numeros.");
                bandera = false;
            }
        } while (!bandera);
        return horasTrabajadas;
    }

    @Override
    public double getValorPorHora() {
        double valorHora = 0;
        boolean bandera = false;
        do {
            try {
                valorHora = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor por hora trabajadas."));
                bandera = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error, solo se permiten numeros.");
                bandera = false;
            }
        } while (!bandera);
        return valorHora;
    }

    @Override
    public double getSalario() {
        double salario = getCantidadHorasTrabajadas() * getValorPorHora();
        return salario;
    }

}
