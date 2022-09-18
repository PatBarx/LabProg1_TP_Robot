package Practico1_TestJuego;

public class Hombre {

    private String nombreID;

    public Hombre() {
    }

    public Hombre(String nombreID) {
        this.nombreID = nombreID;
    }  

    public String getNombreID() {
        return nombreID;
    }

    public void setNombreID(String nombreID) {
        this.nombreID = nombreID;
    }
    

    public void jugarConRobot(Robot robot) {
        robot.despertar();
        System.out.println("Iniciando... \nEstado activo: " + robot.isActivo() + "\n- - - - - - - - - - - - - -");
        if (robot.isActivo() && robot.energiaActual() > 52) {  //1º energia y estado..check 
            robot.avanzar(500);                 // --> 2º avanzar
            System.out.println("Avanzando... 500pasos");
            robot.retroceder(20);                 // --> 2º retroceder
            System.out.println("Retroceso... 20pasos");
            System.out.println("Carga de la bateria: " + robot.energiaActual()); //3º decir energia
        }            
        robot.dormir();        
        System.out.println("Dulces Sueños... zzZZZ \nEstado activo: " + robot.isActivo() + "\n- - - - - - - - - - - - - -");
    } 
}
