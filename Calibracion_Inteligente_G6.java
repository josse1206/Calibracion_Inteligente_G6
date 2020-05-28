/*
  * Implementar un algoritmo que le permita ingresar:
1. Los Niveles De Automotizacion Industrial
2. Administracion de Nivel de Campo
3. Administracion de Nivel de Control PLC
4. Administracion de Nivel de Supervision
5. Registro del Nivel MES
6. Registro del Nivel ERP
7. Imprimir Reportes
 */
package calibracion_inteligente_g6;

/**
 *@author USUARIO Grupo6:
 * Taco William
 * Unda Erick
 * Vega Jessica
 * Yacelga Jose
 */
import java.util.Scanner;
public class Calibracion_Inteligente_G6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner objeto=new Scanner (System.in);
        System.out.println("Modelo computacional");
        System.out.println("Caso practico Robots en la Industria Automotriz");
        System.out.println("Calibracion Inteligente");
        System.out.println("6. Registro del Nivel ERP");
        String erp=objeto.nextLine();
        
        System.out.println("7. Imprimir Reportes");
        String reportes=objeto.nextLine();
    }
    
}
