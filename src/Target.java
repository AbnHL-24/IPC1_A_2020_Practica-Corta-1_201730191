import java.util.Scanner;
import  java.util.Random;

public class Target {

    public static final String INSTRUCCIONES = "Cada jugador escoge un tiro, los puntos de caa tiro se mostraran " +
                                                "a la hora de escoger, el primero en llegar a 200 puntos gana.";
    public static final String OPCIONES_FINALES = "Que desea hacer: 1.Jugar de nuevo. 2.Escoger otro juego. 3.Terminar el programa.";
    public static final String DESPEDIDA = "Gracias por jugar, adios.";
    public static final String CANTIDAD_DE_USUARIOS = "Elija la cantidad de jugadores: \n1. Dos jugadores \n2. Tres jugadores " +
                                                        "\n3. Cuatro jugadores";
    public static final String MALA_OPCION = "Por favor, escoja una de las opciones corectas";
    public static final String TIPOS_DE_TIRO = "Tipos de Tiro: \n1.Tiro rapido sobre el brazo (40 ó 0 puntos ) " +
                                                "\n2.Tiro controlado sobre el  brazo (30, 20 o 10 puntos) " +
                                                "\n3. Tiro bajo el brazo (40, 30, 20, 10 ó 0 puntos)";
    public static final String ELECCION_INCORRECTA = "leccion incorrecta, por favor ingrese una opcion valida.";

    public static final String TIRO_INCORRECTO = "Opcion no valida, por favor ingrese una opcion valida.";
    public static final String NOMBRE_USUARIO1 = "Por favor ingrese en nombre del primer usuario";
    public static final String NOMBRE_USUARIO2 = "Por favor ingrese en nombre del segundo usuario";
    public static final String NOMBRE_USUARIO3 = "Por favor ingrese en nombre del tercer usuario";
    public static final String NOMBRE_USUARIO4 = "Por favor ingrese en nombre del cuarto usuario";
    public static final String TURNO_DE = "Es el turno de ";

    public static String usuario1;
    public static int puntuacionTurnoJ1, puntuacionAcumuladaJ1, puntuacionTotalJ1;
    public static String usuario2;
    public static int puntuacionTurnoJ2, puntuacionAcumuladaJ2, puntuacionTotalJ2;
    public static String usuario3;
    public static int puntuacionTurnoJ3, puntuacionAcumuladaJ3, puntuacionTotalJ3;
    public static String usuario4;
    public static int puntuacionTurnoJ4, puntuacionAcumuladaJ4, puntuacionTotalJ4;

    public static final String PUNTUACION_DE_TURNO = "La puntuacion del turno es ";
    public static final String PUNTUACION_TOTAL = "La puntuacion total es ";
    public static final String GANADOR = "El ganador es ";


    public static int opcion;
    public static Scanner sc2 = new Scanner(System.in);
    public static Random rd2 = new Random();


    public static void juego() {
        System.out.println(INSTRUCCIONES);
        System.out.println(CANTIDAD_DE_USUARIOS);
        opcion = Integer.parseInt(sc2.nextLine());

        if(opcion == 1) {
            juegoParaDos();
        }
        else if(opcion == 2) {
            juegoParaTres();
        }
        else if(opcion == 3) {
            juegoParaCuatro();
        }
        else {
            System.out.println(MALA_OPCION);
            juego();
        }
    }

    public static void juegoParaDos() {
        System.out.println(NOMBRE_USUARIO1);
        usuario1 = sc2.nextLine();
        puntuacionTotalJ1 = 0;
        System.out.println(NOMBRE_USUARIO2);
        usuario2= sc2.nextLine();
        puntuacionTotalJ2 = 0;

        while(puntuacionTotalJ1 <200 && puntuacionTotalJ2 < 200) {
            System.out.println(TURNO_DE + usuario1);
            tiroJugador1();
            System.out.println(TURNO_DE + usuario2);
            tiroJugador2();
        }

        if((puntuacionTotalJ1 > 200) && (puntuacionTotalJ2 < 200)){
            System.out.println(GANADOR + usuario1);
            opciones();
        }
        else if((puntuacionTotalJ2 > 200) && (puntuacionTotalJ1 < 200)){
            System.out.println(GANADOR + usuario2);
            opciones();
        }
        else {
            if(puntuacionTotalJ1 > puntuacionTotalJ2){
                System.out.println(GANADOR + usuario1);
                opciones();
            }
            if(puntuacionTotalJ2 > puntuacionTotalJ1){
                System.out.println(GANADOR + usuario2);
                opciones();
            }
            else {
                System.out.println("EMPATE");
                opciones();
            }
        }
    }

    public static void juegoParaTres() {
        System.out.println(NOMBRE_USUARIO1);
        usuario1 = sc2.nextLine();
        puntuacionTotalJ1 = 0;
        System.out.println(NOMBRE_USUARIO2);
        usuario2= sc2.nextLine();
        puntuacionTotalJ2 = 0;
        System.out.println(NOMBRE_USUARIO3);
        usuario3= sc2.nextLine();
        puntuacionTotalJ3 = 0;

        while(puntuacionTotalJ1 <200 && puntuacionTotalJ2 < 200 && puntuacionTotalJ3 < 200 ) {
            System.out.println(TURNO_DE + usuario1);
            tiroJugador1();
            System.out.println(TURNO_DE + usuario2);
            tiroJugador2();
            System.out.println(TURNO_DE + usuario3);
            tiroJugador3();
        }

        if((puntuacionTotalJ1 > 200) && (puntuacionTotalJ2 < 200) && (puntuacionTotalJ3 < 200)){
            System.out.println(GANADOR + usuario1);
            opciones();
        }
        else if((puntuacionTotalJ2 > 200) && (puntuacionTotalJ1 < 200) && (puntuacionTotalJ3 < 200)){
            System.out.println(GANADOR + usuario2);
            opciones();
        }
        else if((puntuacionTotalJ3 > 200) && (puntuacionTotalJ1 < 200) && (puntuacionTotalJ2 < 200)){
            System.out.println(GANADOR + usuario3);
            opciones();
        }
        else {
            if((puntuacionTotalJ1 > puntuacionTotalJ2) && (puntuacionTotalJ1 > puntuacionTotalJ3)) {
                System.out.println(GANADOR + usuario1);
                opciones();
            }
            if((puntuacionTotalJ2 > puntuacionTotalJ1) && (puntuacionTotalJ2 > puntuacionTotalJ3)) {
                System.out.println(GANADOR + usuario2);
                opciones();
            }
            if((puntuacionTotalJ3 > puntuacionTotalJ2) && (puntuacionTotalJ3 > puntuacionTotalJ1)) {
                System.out.println(GANADOR + usuario3);
                opciones();
            }
            else {
                System.out.println("EMPATE");
                opciones();
            }
        }
    }

    public static void juegoParaCuatro() {
        System.out.println(NOMBRE_USUARIO1);
        usuario1 = sc2.nextLine();
        puntuacionTotalJ1 = 0;
        System.out.println(NOMBRE_USUARIO2);
        usuario2= sc2.nextLine();
        puntuacionTotalJ2 = 0;
        System.out.println(NOMBRE_USUARIO3);
        usuario3= sc2.nextLine();
        puntuacionTotalJ3 = 0;
        System.out.println(NOMBRE_USUARIO4);
        usuario4= sc2.nextLine();
        puntuacionTotalJ4 = 0;

        while(puntuacionTotalJ1 <200 && puntuacionTotalJ2 < 200 && puntuacionTotalJ3 < 200 ) {
            System.out.println(TURNO_DE + usuario1);
            tiroJugador1();
            System.out.println(TURNO_DE + usuario2);
            tiroJugador2();
            System.out.println(TURNO_DE + usuario3);
            tiroJugador3();
            System.out.println(TURNO_DE + usuario4);
            tiroJugador4();
        }

        if((puntuacionTotalJ1 > 200) && (puntuacionTotalJ2 < 200) && (puntuacionTotalJ3 < 200) && (puntuacionTotalJ4 < 200)){
            System.out.println(GANADOR + usuario1);
            opciones();
        }
        else if((puntuacionTotalJ2 > 200) && (puntuacionTotalJ1 < 200) && (puntuacionTotalJ3 < 200) && (puntuacionTotalJ4 < 200)){
            System.out.println(GANADOR + usuario2);
            opciones();
        }
        else if((puntuacionTotalJ3 > 200) && (puntuacionTotalJ1 < 200) && (puntuacionTotalJ2 < 200) && (puntuacionTotalJ4 < 200)){
            System.out.println(GANADOR + usuario3);
            opciones();
        }
        else if((puntuacionTotalJ4 > 200) && (puntuacionTotalJ1 < 200) && (puntuacionTotalJ2 < 200) && (puntuacionTotalJ3 < 200)){
            System.out.println(GANADOR + usuario3);
            opciones();
        }
        else {
            if((puntuacionTotalJ1 > puntuacionTotalJ2) && (puntuacionTotalJ1 > puntuacionTotalJ3)) {
                System.out.println(GANADOR + usuario1);
                opciones();
            }
            if((puntuacionTotalJ2 > puntuacionTotalJ1) && (puntuacionTotalJ2 > puntuacionTotalJ3)) {
                System.out.println(GANADOR + usuario2);
                opciones();
            }
            if((puntuacionTotalJ3 > puntuacionTotalJ2) && (puntuacionTotalJ3 > puntuacionTotalJ1)) {
                System.out.println(GANADOR + usuario3);
                opciones();
            }
            else {
                System.out.println("EMPATE");
                opciones();
            }
        }
    }

    public static void opciones() {
        int opcion;
        System.out.println(OPCIONES_FINALES);
        opcion = Integer.parseInt(sc2.nextLine());

        if(opcion == 1) {
            Target.juego();
        }
        else if(opcion == 2) {
            Main.menuJuegos();
        }
        else if(opcion == 3) {
            cerrarPrograma();
        }
        else {
            System.out.println(ELECCION_INCORRECTA);
            opciones();
        }
    }

    public static void cerrarPrograma() {
        System.out.println(DESPEDIDA);
        int cero = 0;
        System.exit(cero);
    }

    public static void tiroJugador1() {
        int tiroJ1 = 0;
        int randomJ1 = 0;

        System.out.println(TIPOS_DE_TIRO);
        tiroJ1 = Integer.parseInt(sc2.nextLine());

        if(tiroJ1 == 1) {
            randomJ1 = rd2.nextInt(2);

            if(randomJ1 == 0) {
                puntuacionTurnoJ1 = 40;
            }
            else {
                puntuacionTurnoJ1 = 0;
            }
        }
        else if(tiroJ1 == 2) {
            randomJ1 = rd2.nextInt(3);

            if(randomJ1 == 0) {
                puntuacionTurnoJ1 = 30;
            }
            else if(randomJ1 == 1) {
                puntuacionTurnoJ1 = 20;
            }
            else {
                puntuacionTurnoJ1 = 10;
            }
        }
        else if(tiroJ1 == 3) {
            randomJ1 = rd2.nextInt(5);

            if(randomJ1 == 0) {
                puntuacionTurnoJ1 = 40;
            }
            else if(randomJ1 == 1) {
                puntuacionTurnoJ1 = 30;
            }
            else if(randomJ1 == 2) {
                puntuacionTurnoJ1 = 20;
            }
            else if(randomJ1 == 3) {
                puntuacionTurnoJ1 = 10;
            }
            else {
                puntuacionTurnoJ1 = 0;
            }
        }
        else {
            System.out.println(TIRO_INCORRECTO);
            tiroJugador1();
        }

        puntuacionTotalJ1 = puntuacionAcumuladaJ1 + puntuacionTurnoJ1;
        puntuacionAcumuladaJ1 = puntuacionTotalJ1;

        System.out.println(PUNTUACION_DE_TURNO + puntuacionTurnoJ1);
        System.out.println(PUNTUACION_TOTAL + puntuacionTotalJ1);
    }

    public static void tiroJugador2() {
        int tiroJ2 = 0;
        int randomJ2 = 0;

        System.out.println(TIPOS_DE_TIRO);
        tiroJ2 = Integer.parseInt(sc2.nextLine());

        if(tiroJ2 == 1) {
            randomJ2 = rd2.nextInt(2);

            if(randomJ2 == 0) {
                puntuacionTurnoJ2 = 40;
            }
            else {
                puntuacionTurnoJ2 = 0;
            }
        }
        else if(tiroJ2 == 2) {
            randomJ2 = rd2.nextInt(3);

            if(randomJ2 == 0) {
                puntuacionTurnoJ2 = 30;
            }
            else if(randomJ2 == 1) {
                puntuacionTurnoJ2 = 20;
            }
            else {
                puntuacionTurnoJ2 = 10;
            }
        }
        else if(tiroJ2 == 3) {
            randomJ2 = rd2.nextInt(5);

            if(randomJ2 == 0) {
                puntuacionTurnoJ2 = 40;
            }
            else if(randomJ2 == 1) {
                puntuacionTurnoJ2 = 30;
            }
            else if(randomJ2 == 2) {
                puntuacionTurnoJ2 = 20;
            }
            else if(randomJ2 == 3) {
                puntuacionTurnoJ2 = 10;
            }
            else {
                puntuacionTurnoJ2 = 0;
            }
        }
        else {
            System.out.println(TIRO_INCORRECTO);
            tiroJugador2();
        }

        puntuacionTotalJ2 = puntuacionAcumuladaJ2 + puntuacionTurnoJ2;
        puntuacionAcumuladaJ2 = puntuacionTotalJ2;

        System.out.println(PUNTUACION_DE_TURNO + puntuacionTurnoJ2);
        System.out.println(PUNTUACION_TOTAL + puntuacionTotalJ2);
    }
    public static void tiroJugador3() {
        int tiroJ3 = 0;
        int randomJ3 = 0;

        System.out.println(TIPOS_DE_TIRO);
        tiroJ3 = Integer.parseInt(sc2.nextLine());

        if(tiroJ3 == 1) {
            randomJ3 = rd2.nextInt(2);

            if(randomJ3 == 0) {
                puntuacionTurnoJ3 = 40;
            }
            else {
                puntuacionTurnoJ3 = 0;
            }
        }
        else if(tiroJ3 == 2) {
            randomJ3 = rd2.nextInt(3);

            if(randomJ3 == 0) {
                puntuacionTurnoJ3 = 30;
            }
            else if(randomJ3 == 1) {
                puntuacionTurnoJ3 = 20;
            }
            else {
                puntuacionTurnoJ3 = 10;
            }
        }
        else if(tiroJ3 == 3) {
            randomJ3 = rd2.nextInt(5);

            if(randomJ3 == 0) {
                puntuacionTurnoJ3 = 40;
            }
            else if(randomJ3 == 1) {
                puntuacionTurnoJ3 = 30;
            }
            else if(randomJ3 == 2) {
                puntuacionTurnoJ3 = 20;
            }
            else if(randomJ3 == 3) {
                puntuacionTurnoJ3 = 10;
            }
            else {
                puntuacionTurnoJ3 = 0;
            }
        }
        else {
            System.out.println(TIRO_INCORRECTO);
            tiroJugador3();
        }

        puntuacionTotalJ3 = puntuacionAcumuladaJ3 + puntuacionTurnoJ3;
        puntuacionAcumuladaJ3 = puntuacionTotalJ3;

        System.out.println(PUNTUACION_DE_TURNO + puntuacionTurnoJ3);
        System.out.println(PUNTUACION_TOTAL + puntuacionTotalJ3);
    }

    public static void tiroJugador4() {
        int tiroJ4 = 0;
        int randomJ4 = 0;

        System.out.println(TIPOS_DE_TIRO);
        tiroJ4 = Integer.parseInt(sc2.nextLine());

        if(tiroJ4 == 1) {
            randomJ4 = rd2.nextInt(2);

            if(randomJ4 == 0) {
                puntuacionTurnoJ4 = 40;
            }
            else {
                puntuacionTurnoJ4 = 0;
            }
        }
        else if(tiroJ4 == 2) {
            randomJ4 = rd2.nextInt(3);

            if(randomJ4 == 0) {
                puntuacionTurnoJ4 = 30;
            }
            else if(randomJ4 == 1) {
                puntuacionTurnoJ4 = 20;
            }
            else {
                puntuacionTurnoJ4 = 10;
            }
        }
        else if(tiroJ4 == 3) {
            randomJ4 = rd2.nextInt(5);

            if(randomJ4 == 0) {
                puntuacionTurnoJ4 = 40;
            }
            else if(randomJ4 == 1) {
                puntuacionTurnoJ4 = 30;
            }
            else if(randomJ4 == 2) {
                puntuacionTurnoJ4 = 20;
            }
            else if(randomJ4 == 3) {
                puntuacionTurnoJ4 = 10;
            }
            else {
                puntuacionTurnoJ4 = 0;
            }
        }
        else {
            System.out.println(TIRO_INCORRECTO);
            tiroJugador4();
        }

        puntuacionTotalJ4 = puntuacionAcumuladaJ4 + puntuacionTurnoJ4;
        puntuacionAcumuladaJ4 = puntuacionTotalJ4;

        System.out.println(PUNTUACION_DE_TURNO + puntuacionTurnoJ4);
        System.out.println(PUNTUACION_TOTAL + puntuacionTotalJ4);
    }
}
