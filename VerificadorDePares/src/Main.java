//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] vetor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int contador = 0;

        for (int i = 0; i <= vetor.length; i++){
           if (i % 2 == 0){

               System.out.println(" "+i);
               contador++;
           }
        }
        System.out.print("A quantidade é de " + contador);
    }
}