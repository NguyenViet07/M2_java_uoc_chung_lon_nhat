import java.util.Scanner;

public class uoc_chung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("nhap so a: ");
        a = input.nextInt();
        System.out.print("nhap so b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");

        while (a != b) {
            if (a > b){
                a -= b;
            } else {
                b -= a;
            }
        }

        System.out.println("Greatest common factor: " + a);
    }
}
