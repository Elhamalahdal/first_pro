import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        int[] a=new int[5];
        inputElment(a);
        printElment(a);
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i]=input.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]+"\t");

        }

    }
    public static void printElment(int[]x){
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i]+"\t");

    }



}
public static void inputElment(int[]y){
    Scanner input=new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
        y[i]=input.nextInt();

    }

}
}



