package christian.jonathan.laimena.pbo.utility;
import java.util.Scanner;

public class InputUtility {
    static Scanner input =  new Scanner(System.in);

    public static String inputString(String teksPrompt) {
        System.out.print(teksPrompt);
        return input.next();
    }

    public static int inputInt(String teksPrompt) {
        System.out.print(teksPrompt);
        return input.nextInt();
    }

    public static double inputDouble(String teksPrompt) {
        System.out.print(teksPrompt);
        return input.nextDouble();
    }
}