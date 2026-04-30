//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double [] vetor = {1,2,3,4,5,6,7.4,8,9,10,11.8,20.5};

        double media = 0;
        int qntNumero = 0;
        double soma = 0;

        for (int i = 0; i<vetor.length; i++) {
            soma += vetor[i];
            }

            media = soma / vetor.length;
            System.out.printf("\n %.1f",media);

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i]> media){
//                System.out.printf("%.1f\n", vetor[i]);
                qntNumero++;

            }
        }
        System.out.print("\nQuantidade de números maiores que a média: " + qntNumero);

    }
}