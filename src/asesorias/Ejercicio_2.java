
package asesorias;


public class Ejercicio_2 
{
    public static void main(String[] args) 
    {
        int n=1,suma=0;
        
        while(n<=50)
        {
            suma=suma+n;//sumador
            n++;//contador
            
        }
        System.out.println(String.format("La suma es: %d ", suma));//Uso de interpolación
    }
    
}
