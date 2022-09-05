import java.util.Scanner;
public class Myndighedstjekkerprogram {
    public static void main(String[] args) {
        Scanner brugerinput = new Scanner(System.in);
        System.out.println("Hvad er din alder?");
        int alder = brugerinput.nextInt();



        if (alder < 18) {
            System.out.println("Du er ikke myndig");
        } else {
            System.out.println("Du er myndig");
        }
    }
}