import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Tandbørste mod ringe hygiejne");

        Tandbørste lisasTandboerste = new Tandbørste(); //Instantiere et objekt af klassen Tandbørste
        lisasTandboerste.boerstetimer = 120;
        lisasTandboerste.alarm = 12;
        lisasTandboerste.batteriMaaling = 10;

        Tandbørste patricksTandboerste = new Tandbørste();
        patricksTandboerste.boerstetimer = 140;
        patricksTandboerste.alarm = 10;
        patricksTandboerste.batteriMaaling = 20;

        System.out.println("Lisa er færdig med tandbørsting om" + lisasTandboerste.boerstetimer + "sekunder");
        System.out.println("Lisa skal børste tænder om" + lisasTandboerste.alarm + "timer");
        System.out.println("Lisa din tandbørste har" + lisasTandboerste.batteriMaaling + "% strøm tilbage");

        System.out.println("  ");

        System.out.println("Patrick er færdig med tandbørsting om" + patricksTandboerste.boerstetimer + "sekunder");
        System.out.println("Patrick skal børste tænder om" + patricksTandboerste.alarm + "timer");
        System.out.println("Patrick din tandbørste har" + patricksTandboerste.batteriMaaling + " " + "% strøm tilbage");

        patricksTandboerste.start();
        lisasTandboerste.start();

        if (patricksTandboerste.isStarted == true) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");


        }
    }
}