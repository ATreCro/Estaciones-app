
import java.util.Scanner;


public class holaEstacionSwitch {
    public static void main (String args []){
    Scanner consola = new Scanner (System.in);
        System.out.println("Introduzca un mes: ");
    var mes = consola.nextInt();
    var estacion = "Estación desconocida";
    
    switch (mes){
        case 1: case 2: case 12:
            estacion = "Invierno";
            break;
        case 3: case 4: case 5: 
            estacion = "Primavera";
            break;
        case 6: case 7: case 8: 
            estacion = "Verano";
            break;
        case 9: case 10: case 11: 
            estacion = "Otonio";
            break;
    }
        System.out.println("estacion = " + estacion);

    }
            
}
