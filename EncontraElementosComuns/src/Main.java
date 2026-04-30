//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[6];
        int[] B = new int[6];
        int[] C = new int[6];
        int contador = 0;

        System.out.println("Digite 6 números para o vetor A:");
        for (int i = 0; i < 6; i++) {
            System.out.print("A: ");
            A[i] = sc.nextInt();
        }

        System.out.println("Digite 6 números para o vetor B:");
        for (int i = 0; i < 6; i++) {
            System.out.print("B: ");
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (A[i] == B[j]) {
                    boolean jaExiste = false;
                    for (int k = 0; k < contador; k++) {
                        if (C[k] == A[i]) {
                            jaExiste = true;
                            break;
                        }
                    }
                    if (!jaExiste) {
                        C[contador] = A[i];
                        contador++;
                    }
                }
            }
        }
        if (contador == 0) {
            System.out.println("Nenhum elemento em comum.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.print(C[i] + " ");
            }
        }
        sc.close();
    }
}
