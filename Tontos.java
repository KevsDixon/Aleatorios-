package tontos;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Kevin Mauricio
 */
public class Tontos {
    public static void main(String[] args) {
        
    Scanner Teclado = new Scanner(System.in);
     Random objeto = new Random();
     // Arreglo que contine las letras
     char[] array_Letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                            'n','ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
     boolean[] arreglo = new boolean[27];
        
     
        int tam;
        System.out.println("Ingresa el tamaño del arreglo");
        tam=Teclado.nextInt();
        
        char letter;
          int indice;
          
        for (int i = 0; i <tam; i++) 
        {
          
            do{
              indice = objeto.nextInt(27);  
            } while (arreglo[indice]);
            
            arreglo[indice] = true;
            letter = array_Letras[indice];
            System.out.println("posicion ["+i +"]="+letter);
        }
    }
    
}
