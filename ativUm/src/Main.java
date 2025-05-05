//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] vetor = {1,2,3,4,5,6,7,8,9,10};

        int soma = 0;
        for(int i = 0; i< vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.print(soma);

    }
}