import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
           String str;
           while (!((str = bufferedReader.readLine()).equals("exit"))) {
               if(isDigit(str)) {
                   if (str.matches(".*[.].*"))
                       print(Double.parseDouble(str));
                   else if (Integer.parseInt(str) > 0 && Integer.parseInt(str) < 128)
                       print((short) Integer.parseInt(str));
                   else if (Integer.parseInt(str) <= 0 || Integer.parseInt(str) >= 128)
                       print(Integer.parseInt(str));
               }
               else
                   print(str);
           }
       }
       catch (NumberFormatException exception) {
           exception.printStackTrace();
       }
    }

    public static boolean isDigit(String s) {
        try {
            Double.parseDouble(s);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
