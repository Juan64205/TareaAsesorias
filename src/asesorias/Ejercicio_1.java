
package asesorias;


public class Ejercicio_1 
{

    public static void main(String[] args) 
    {
        int a=50;
        while(a>0)
        {
           if(a % 2 == 0)
           {
               System.out.println(String.format("El número %d es par ", a));
           }else
             {
                 System.out.println(String.format("El número %d es impar ", a));
             }
           
             a--;
        }
        
    }
    
}
