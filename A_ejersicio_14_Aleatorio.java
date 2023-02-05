package a_ejersicio_14_aleatorio;
import java.util.Scanner;
/**
 *
 * @author Kevin Mauricio
 */
public class A_ejersicio_14_Aleatorio {

    
    public static void main(String[] args) {
     
    Scanner Teclado = new Scanner(System.in);
     int tam; 
      
        System.out.println("Ingrsa el tamaño del vector");
        tam = Teclado.nextInt();
        System.out.println("El tamaño del vector es de "+tam);
        
        char vector[]= new char[tam];
        
        char palabra;
       
        for(int i=0; i<vector.length; i++)
        {
        palabra = ((char)(Math.random()*(90-65)+65));
             System.out.println(i +"= Letra generada es : "+palabra);
        }
     
    }
    
}
