import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Universidad -> ");
        String universidad = sc.nextLine();
        System.out.println("Nota 1    Nota 2    Nota 3");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        System.out.println(n1 + "-" + n2 + "-" + n3 );
        System.out.println();

    }
}