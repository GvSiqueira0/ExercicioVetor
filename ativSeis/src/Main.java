//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = {5, 8, 3, 8, 2, 9, 4, 8, 6, 1};
        System.out.print("Digite o número que deseja remover: ");
        int numRemover = sc.nextInt();


        int[] novoVetor = new int[vetor.length - 1];
        boolean removido = false;
        int j = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numRemover && !removido) {
                removido = true;
                continue;
            }
            if (j < novoVetor.length) {
                novoVetor[j] = vetor[i];
                j++;
            }
        }

        if (removido) {
            System.out.println("após remover o número:");
            for (int num : novoVetor) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Número não encontrado.");
        }
        sc.close();
    }
}