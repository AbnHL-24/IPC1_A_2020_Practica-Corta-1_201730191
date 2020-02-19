import java.util.Scanner;

public class Main {

    public static final String  MENSAJE_BIENVENIDA =  "Bienvenido al juego 3JT, escoja uno de los tres juegos.";
    public static final String LISTA_DE_JUEGOS = "1.Sopa de letras \n2.Target \n3.2048 \n4.Salir";
    public static final String ELECCION_INCORRECTA = "leccion incorrecta, por favor ingrese una opcion valida.";
    public static final String DESPEDIDA = "Gracias por jugar, adios.";
    public static int juegoEscogido;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(MENSAJE_BIENVENIDA);
        menuJuegos();
    }

    public static void menuJuegos() {
        System.out.println(LISTA_DE_JUEGOS);
        juegoEscogido = Integer.parseInt(sc.nextLine());
        if(juegoEscogido ==1) {
            SopaLetras.juego();
            System.out.println("sopaLetras");
        }
        else if(juegoEscogido == 2) {
            //target.juego();
            System.out.println("target");
        }
        else if(juegoEscogido == 3) {
            //veinteCuarentaOcho.juego();
            System.out.println("veinteCuarentaOcho");
        }
        else if(juegoEscogido == 4) {
            cerrarPrograma();
        }
        else {
            System.out.println(ELECCION_INCORRECTA);
            menuJuegos();
        }
    }

    public static void cerrarPrograma() {
        System.out.println(DESPEDIDA);
        int cero = 0;
        System.exit(cero);
    }
}
