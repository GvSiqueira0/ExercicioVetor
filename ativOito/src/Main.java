//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];
        
        System.out.println("Digite 5 números para o vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A: ");
            A[i] = sc.nextInt();
        }

        System.out.println("Digite 5 números para o vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("B: ");
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            C[i] = A[i];
        }

        for (int i = 0; i < 5; i++) {
            C[i + 5] = B[i];
        }

        System.out.println("Vetor C");
        for (int i = 0; i < 10; i++) {
            System.out.print(C[i] + " ");
        }
        sc.close();
    }
}
