import java.util.Scanner;

public class fOURE {
    public static void main(String[] args) {
        int[] a=new int[5];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
           a[i]=input.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]+"\t");

        }
    }
}
