package alex;
import java.util.Scanner;
/**
 *
 * @author Kevin mauricio
 */
public class Alex {
    //Progra que evalua el numero que digita el 
    //usuario y nos dice si es par o impar
    public static void main(String[] args) {
       
    Scanner Teclado = new Scanner(System.in);
     
    int opt;
    int tam;
    char aleatorio;
    boolean revisar = false;
            
        System.out.println("Ingresa el numero de letras a generar");
        tam =Teclado.nextInt();
   
        char array[] = new char[tam];
        
    do{
        System.out.println("1° Llenar\n"
                + "2° Mostrar\n"
                + "3° Llenar sin repetir\n"
                + "4° salir");
     switch(opt=Teclado.nextInt())
     {    
         case 1:
           for(int i=0; i<array.length; i++)
           {
            aleatorio =(char)(Math.random()*(90-65)+65);
            array[i]=aleatorio;
           }
           System.out.println("Datos guardados con exito");  
         break;
         
         case 2:
              for(int i=0; i<array.length; i++)
              {
                  System.out.println(i+"= Letra geberada =" +array[i]);   
              }
         break;
         
         case 3:
             for(int i=0; i<array.length; i++)
           {
            aleatorio =(char)(Math.random()*(90-65)+65);
             
            while(true)
            {
                for(int k=0; k<=i; k++)
                {
                    if(aleatorio==array[k])
                    {
                        revisar = true;
                    }
                }
             if(revisar)   
             {
                aleatorio =(char)(Math.random()*(90-65)+65);
                revisar = false;
             }
             else
             {
                 break;
             }
            }
              array[i]=aleatorio;
               System.out.println("posicion ["+i+"]="+array[i]);
           }      
         break;
         
         case 4:
             System.out.println("El programa ha finalizado con exito");
         break;
     }
        
    }while(4!=opt);
     
    }     
}
