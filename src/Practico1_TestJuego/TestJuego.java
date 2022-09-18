package Practico1_TestJuego;

import java.util.Scanner;

public class TestJuego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pasos = 0;
        String opc;

        //a) Crear Robot:
        Robot rob = new Robot();

        //b) Crear hombre1
        Hombre homb1 = new Hombre("Pedro");

        //c) Hacer que el hombre Juegue con el Robot.          
        do {
            System.out.println("\nHola! " + homb1.getNombreID() + " Quieres jugar? \nIngrese s o n:");
            opc = sc.nextLine();
            if (opc.equalsIgnoreCase("s")) {
                if (rob.bateriaVacia() || rob.energiaActual() < 52) {
                    rob.recargar();
                    rob.despertar();
                    homb1.jugarConRobot(rob);
                } else {
                    rob.despertar();
                    homb1.jugarConRobot(rob);
                }
            }
        } while (opc.equalsIgnoreCase("s"));

        //b) Crear hombre2
        Hombre homb2 = new Hombre("Marta");
        do {
            System.out.println("\nHola! " + homb2.getNombreID() + " Quieres jugar? \nIngrese s o n:");
            opc = sc.nextLine();
            if (opc.equalsIgnoreCase("s")) {
                if (rob.bateriaVacia() || rob.energiaActual() < 52) {
                    rob.recargar();
                    rob.despertar();
                    homb1.jugarConRobot(rob);
                } else {
                    rob.despertar();
                    homb1.jugarConRobot(rob);
                }
            }
        } while (opc.equalsIgnoreCase("s"));
        
        int var;
        rob.despertar();

        do {
            System.out.println("oprima 1 si desea avanzar");
            System.out.println("oprima 2 si desea retroceder");
            System.out.println("oprima 3 si desea dormir");
            System.out.println("oprima 4 si desea despertar");
            System.out.println("oprima 5 si desea recargar");
            System.out.println("oprima 6 si desea bateria llena");
            System.out.println("oprima 7 si desea bateria vacia");
            System.out.println("oprima 8 si desea conocer la energia actual");
            System.out.println("oprima 9 si desea Jugar");
            System.out.println("oprima 0 si desea salir");
            var = sc.nextInt();
            switch (var) {
                case 1:
                    System.out.println("Indique la cantidad de pasos que desea AVANZAR");
                    pasos = sc.nextInt();
                    int pasosVar = rob.avanzar(pasos);
                    if (pasos == pasosVar) {
                        System.out.println("Avanzar " + pasosVar + " pasos indicados.");
                        System.out.println("Carga de la bateria: " + rob.energiaActual());
                    } else {
                        if (pasosVar != 0) {
                            System.out.println("Solo avanze: " + pasosVar + " pasos. RECARGAR!!");
                            System.out.println("Carga de la bateria: " + rob.energiaActual());
                        } else {
                            System.out.println("No hubo movimiento, debe recargar mi bateria! Pasos: " + pasosVar);
                            System.out.println("Carga de la bateria: " + rob.energiaActual());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Indique la cantidad de pasos que desea RETROCEDER");
                    pasos = sc.nextInt();
                    pasosVar = rob.retroceder(pasos);
                    if (pasos == pasosVar) {
                        System.out.println("Retrocedi " + pasosVar + " pasos indicados.");
                        System.out.println("Carga de la bateria: " + rob.energiaActual());
                    } else {
                        if (pasosVar != 0) {
                            System.out.println("Solo retrocedi: " + pasosVar + " pasos. RECARGAR!!");
                            System.out.println("Carga de la bateria: " + rob.energiaActual());
                        } else {
                            System.out.println("No hubo movimiento, debe recargar mi bateria! Pasos: " + pasosVar);
                            System.out.println("Carga de la bateria: " + rob.energiaActual());
                        }
                    }
                    break;
                case 3:
                    rob.dormir();
                    System.out.println("Dulces Sueños... zzZZZ \nEstado activo: " + rob.isActivo() + "\n- - - - - - - - - - - - - -");
                    break;
                case 4:
                    rob.despertar();
                    System.out.println("Iniciando... \nEstado activo: " + rob.isActivo() + "\n- - - - - - - - - - - - - -");
                    break;
                case 5:
                    rob.recargar();
                    System.out.println("Cargando... \nEstado activo: " + rob.isActivo() + "\n- - - - - - - - - - - - - -");
                    break;
                case 6:
                    if (rob.bateriaLlena()) {
                        System.out.println("\n- - - - - - - - - - - - - -\nMi batería está al 100%!! ");
                    } else {
                        System.out.println("LA carga de bateria es: " + rob.energiaActual());
                    }
                    break;
                case 7:
                    if (rob.bateriaVacia()) {
                        System.out.println("\n- - - - - - - - - - - - - -\nParece que No hay suficiente energía... RECARGUE");
                    } else {
                        System.out.println("LA carga de bateria es: " + rob.energiaActual());
                    }
                    break;
                case 8:
                    System.out.println("La carga de bateria es: " + rob.energiaActual());
                    break;
                case 9:
                        System.out.println("\nVamos a Jugar!!");
                    if (rob.bateriaVacia() || rob.energiaActual() < 52) {
                        rob.recargar();
                        rob.despertar();
                        homb2.jugarConRobot(rob);
                    } else {
                        rob.despertar();
                        homb2.jugarConRobot(rob);
                    }
                    break;
                    }            
        } while (var != 0);
    }
}
