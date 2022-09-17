package Practico1_TestJuego;

import java.util.Scanner;

public class TestJuego {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        //a) Crear Robot:
        Robot rob = new Robot();        
        int pasos = 0;
        //b) Crear hombre1
        Hombre homb1 = new Hombre("Pedro");  
        Hombre homb2 = new Hombre("Marta");
        
        //Informar la modalidad de uso en un menu o lista de opciones.
        
        System.out.println("Estado actual de Bateria: " +rob.energiaActual());
        
        System.out.println("\nHola! " + homb1.getNombreID() + " Quieres jugar? \nIngrese los pasos a Retroceder:");
        pasos = sc.nextInt();
        int pasosVar = rob.retroceder(pasos);
        if (pasos == pasosVar) {
            System.out.println("Retrocedi " +pasosVar+ " pasos indicados.");
            System.out.println("Carga de la bateria: " +rob.energiaActual());
        }else {
            if (pasosVar!=0) {
                System.out.println("Solo retrocedi: " + pasosVar + " pasos.");
                System.out.println("Carga de la bateria: " +rob.energiaActual());
            } else {
                System.out.println("No hubo movimiento, debe recargar mi bateria! Pasos: " + pasosVar);
                System.out.println("Carga de la bateria: " +rob.energiaActual());
            }    
        }  
        pasos = sc.nextInt();
        pasosVar = rob.retroceder(pasos);
        if (pasos == pasosVar) {
            System.out.println("Retrocedi " +pasosVar+ " pasos indicados.");
            System.out.println("Carga de la bateria: " +rob.energiaActual());
        }else {
            if (pasosVar!=0) {
                System.out.println("Solo retrocedi: " + pasosVar + " pasos.");
                System.out.println("Carga de la bateria: " +rob.energiaActual());
            } else {
                System.out.println("No hubo movimiento, debe recargar mi bateria! Pasos: " + pasosVar);
                System.out.println("Carga de la bateria: " +rob.energiaActual());
            }    
        }  
        //jugar.. Para despertarlo, si no tiene bateria: recargar antes.
        System.out.println("\nHola! " + homb1.getNombreID() + " Quieres jugar? \n*** *** ***En Marcha!! *** *** ***");
        if (rob.bateriaVacia() || rob.energiaActual()<52) {
            rob.recargar();
            rob.despertar();
            homb1.jugarConRobot(rob);
        } else {
            rob.despertar();
            homb1.jugarConRobot(rob);
        }
        System.out.println("\nHola! " + homb2.getNombreID() + " Quieres jugar? \n*** *** ***En Marcha!! *** *** ***");
        if (rob.bateriaVacia() || rob.energiaActual()<52) {
            
            rob.recargar();
            rob.despertar();
            homb1.jugarConRobot(rob);
        } else {
            rob.despertar();
            homb1.jugarConRobot(rob);
        }
        
        
    }    
}
