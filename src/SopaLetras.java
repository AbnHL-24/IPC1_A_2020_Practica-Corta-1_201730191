import java.util.Scanner;
import java.util.Random;

public class SopaLetras {

    public static final String INSTRUCCIONES = "Una tercera persona debe ingresar una palabra, " +
                                                "esta sera impresa con las letras revueltas y " +
                                                "usted tratara de adivinar la palabra ingresasa, tiene 3 intentos.";
    public static final String PEDIR_PALABRA_CORRECTA = "Por favor ingrese una palabra.";
    public static final String PEDIR_PALABRA_MODIFICADA = "Por favor ingrese la palabra que cree es correcta";
    public static final String GANO_EL_JUEGO = "Ud ingreso correctamente la palabra, ud ha ganado el juego.";
    public static final String PERDIO_EL_JUEGO = "Ud se ha quedado sin intentos, ud ha perdido el juego.";
    public static final String PALABRA_INCORRECTA = "La palabra ingresada es incorrecta, pruebe de nuevo.";
    public static final String OPCIONES_FINALES = "Que desea hacer: 1.Jugar de nuevo. 2.Escoger otro juego. 3.Terminar el programa.";
    public static final String DESPEDIDA = "Gracias por jugar, adios.";
    public static final String ELECCION_INCORRECTA = "leccion incorrecta, por favor ingrese una opcion valida.";

    public static String palabraOriginal;
    public static String palabraModificada;
    public static int vidas;
    public static Scanner sc1 = new Scanner(System.in);
    public static Random rd = new Random();


    public static void juego() {
        System.out.println(INSTRUCCIONES);
        System.out.println(PEDIR_PALABRA_CORRECTA);

        cambiarpalabra();

        vidas = 3;

        while (vidas > 0) {
            System.out.println(palabraModificada);
            System.out.println(PEDIR_PALABRA_MODIFICADA);
            palabraModificada = sc1.nextLine();
            if (palabraOriginal.equals(palabraModificada)) {
                System.out.println(GANO_EL_JUEGO);
                //Llamar Punteo.sumarPunto
                opciones();
            } else {
                System.out.println(PALABRA_INCORRECTA);
                vidas--;
            }
        }
        System.out.println(PERDIO_EL_JUEGO);
        opciones();

    }

    public static void opciones() {
        int opcion;
        System.out.println(OPCIONES_FINALES);
        opcion = Integer.parseInt(sc1.nextLine());

        if(opcion == 1) {
            SopaLetras.juego();
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

    public static void cambiarpalabra() {
        palabraOriginal = sc1.nextLine();
        int[] letras = new int[palabraOriginal.length()];

        for (int i = 0; i < letras.length; i++) {
            letras[i]= rd.nextInt(letras.length);
            //mientras comparar sea verdadero crear nuevo random
            while(comparar(i-1, letras[i], letras)){
                letras[i]= rd.nextInt(letras.length);
            }
        }
        for (int i = 0; i < letras.length; i++) {
            System.out.print(palabraOriginal.charAt(letras[i]));
        }
    }

    public static boolean comparar(int iAnt, int letra, int[] letras)
    {
        boolean paso;
        if (iAnt<0){
            paso = false;
        }
        else if (letra != letras[iAnt]){
            paso = comparar(iAnt-1, letra, letras);
        }
        else {
            paso = true;
        }
        return paso;
    }
}