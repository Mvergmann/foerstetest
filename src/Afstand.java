import java.util.Scanner;
public class Afstand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double afstand = Math.abs(a * x1 - y1 + b)/Math.sqrt(1+Math.pow(a,2));

        System.out.println(afstand);

    }
}
