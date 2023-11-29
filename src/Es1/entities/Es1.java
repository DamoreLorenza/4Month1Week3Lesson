package entities;
import entities.Rettangolo;

import java.awt.geom.Area;

public class Es1 {
    public static void main(String[] args){
        rettangoloUno();
        rettangoloDue();

    }

    public static void rettangoloUno(){
        Rettangolo uno = new Rettangolo();
        uno.lunghezza=7;
        uno.larghezza=5;
        System.out.println("la lunghezza è " + uno.lunghezza +  " "  + "la larghezza è " + uno.larghezza + " " + "l'area è " );
        uno.calculatingArea();
        uno.calculatingPerimentro();



    }
    public static void rettangoloDue(){
        Rettangolo due = new Rettangolo();
        due.lunghezza=8;
        due.larghezza=6;
        System.out.println("la lunghezza è " + due.lunghezza +  " "  + "la larghezza è " + due.larghezza + " " + "l'area è " );
        due.calculatingArea();
        due.calculatingPerimentro();


    }
}
