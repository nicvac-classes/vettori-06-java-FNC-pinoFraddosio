//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n, imin;

        System.out.print("Inserire la grandezza del vettore: ");
        n = in.nextInt();

        String[] nomi = new String[n];
        String[] nazionali = new String[n];
        float[] tempi = new float[n];

        for(int i = 0; i < n; i++){
            System.out.print("Nome " + (i+1) + "° atleta: ");
            nomi[i] = in.next();
            System.out.print("Nazionale "  + (i+1) + "° atleta: ");
            nazionali[i] = in.next();
            System.out.print("Tempo " + (i+1) + "° atleta: ");
            tempi[i] = in.nextFloat();
        }

        System.out.println("Informazioni inserite: ");

        for(int i = 0; i < n; i++){
            System.out.println((i+1) + "° atlteta: " + nomi[i] + "; nazionale: " + nazionali[i] + "; tempo: " + tempi[i]);
        }

        System.out.println("Ricerca dell'atleta vincitore");
        float min;

        imin = 0;
        min = tempi[0];

        for(int i = 0; i < nomi.length; i++){
            if(tempi[i] < min){
                imin = i;
                min = tempi[i];
            }
        }

        System.out.println("Atleta vincitore: " + nomi[imin] + "; nazionale: " + nazionali[imin] + "; tempo: " + tempi[imin]);

    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md