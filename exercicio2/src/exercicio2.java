import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de espaço do vetor: ");
        int numero = sc.nextInt();
        int[] vetor = new int[numero];

        for (int n = 0; n < numero; n++) {
            System.out.println("Digite o valor para o espaço " + (n + 1) + ": ");
            vetor[n] = sc.nextInt();

            if (vetor[n] % 2 == 0) {
                vetor[n] = vetor[n] * 2;
            } else {
                vetor[n] = (int) Math.pow(vetor[n], 2);
            }

        } for (int i = 0; i < numero; i++){
            System.out.println(vetor[i]);
        }
    }
}