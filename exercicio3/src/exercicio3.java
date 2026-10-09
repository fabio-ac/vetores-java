import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        int tamanho = nome.length();
        char[] vetor = new char[tamanho];

        for (int posicao = 0; posicao < tamanho; posicao++) {
            vetor[posicao] = nome.charAt(posicao);

        } for(int numero = 0; numero < tamanho/2; numero++){
            char auxiliar = vetor[numero];
            vetor [numero] = vetor [tamanho - 1 - numero];
            vetor [tamanho - 1 - numero] = auxiliar;
        }

        System.out.print(nome + " ao contrario é: ");
        for (int i = 0; i < tamanho; i++){
            System.out.print(vetor[i]);
        }
    }
}