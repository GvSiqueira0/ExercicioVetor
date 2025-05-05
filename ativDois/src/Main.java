import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetor = new int[15];


        for(int i = 0; i< vetor.length; i++){
            vetor[i]= sc.nextInt();
        }

        int maior = vetor[0];
        int indice = 0;

        for (int i = 0; i < vetor.length; i++){

            if(vetor[i] > maior){
            maior = vetor[i];
            indice = i;
            }
        }
        sc.close();
        System.out.print("O valor maior é "+ maior +" e o seu indice é "+ indice);
    }
}