import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String key;
            key = bufferedReader.readLine();
            if (key.equals(Planet.EARTH)) {
                thePlanet = Earth.getInstance();
                System.out.println("Earth was created");
            }
           else if (key.equals(Planet.MOON)) {
                thePlanet = Moon.getInstance();
                System.out.println("Moon was created");
            }
            else if (key.equals(Planet.SUN)) {
                thePlanet = Sun.getInstance();
                System.out.println("Sun was created");
            }
            else {
                thePlanet = null;
                System.out.println("Nothing was created, try again");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
