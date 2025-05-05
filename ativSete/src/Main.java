//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[15];

        System.out.println("Digite 15 números:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
        System.out.print("Digite o número que deseja contar: ");
        int numeroProcurado = sc.nextInt();

        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroProcurado) {
                contador++;
            }
        }
        System.out.println("O número " + numeroProcurado + " aparece " + contador + " vezes no vetor.");

        sc.close();
    }
}
