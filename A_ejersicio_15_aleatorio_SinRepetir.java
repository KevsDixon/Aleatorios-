package a_ejersicio_15_aleatorio_sinrepetir;
import java.util.Scanner;
/**
 *
 * @author Kevin Mauricio 
 */
public class A_ejersicio_15_aleatorio_SinRepetir {

    public static void main(String[] args) {
       
        Scanner Teclado = new Scanner(System.in);
        int tam;
        int opt;
        char temporal;
        boolean bandera = false;

        System.out.println("Ingresa el tamaño del vector");
        tam = Teclado.nextInt();
        System.out.println("El tamaño del vector es de " + tam);

        char vector[] = new char[tam];
        char palabra;
    
        do {

            System.out.println("\n1° Llenar de forma aliatoria\n"
                    + "2° Mostrar\n"
                    + "3° aleatorio sin repetir\n"
                    + "4° Salir");

            switch (opt = Teclado.nextInt()) {
                case 1:

                    for (int i = 0; i < vector.length; i++) {
                        palabra = ((char) (Math.random() * (90 - 65) + 65));
                        vector[i] = palabra;

                    }
                    System.out.println("Llenado con exito");
                    break;
                case 2:

                    for (int i = 0; i < vector.length; i++) {
                        System.out.println(i + "= Letra generada es : " + vector[i]);
                    }
                    break;

                case 3:
                    for (int i = 0; i < vector.length; i++) {
                        palabra = ((char) (Math.random() * (90 - 65) + 65));


                        //int j = 0;
                        while (true){
                            for (int k = 0; k <= i; k++){
                                if(palabra == vector[k]){
                                    bandera = true;
                                }
                            }
                            if(bandera)
                            {
                            palabra = ((char) (Math.random() * (90 - 65) + 65));
                            bandera = false;
                            }else 
                            {
                             break;
                            }

                        }
                        vector[i] = palabra;
                       
                    }
                    System.out.println("Llenado con exito");

                    break;

                case 4:
                    System.out.println("El programa ha finalizado");
                    break;
            }

        } while (opt != 4);
    
    }
    
}
