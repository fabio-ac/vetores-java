import java.util.Scanner;

public class exercicio1 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Digite o numero de espaços para o vetor");
         int n = sc.nextInt();
         int[] vetor = new int[n];

         for (int i=0; i < n; i++){
            System.out.print("Digite o número do espaço " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
         }

         for (int ordenar = 0; ordenar < n - 1; ordenar++){
             for (int j = 0; j < n - 1; j++){
             if (vetor[j] > vetor[j + 1]){
                 int auxiliar = vetor[j];
                 vetor [j] = vetor [j + 1];
                 vetor [j + 1] = auxiliar;
             }
         }
         }

         for (int i=0; i < n; i++){
             System.out.println(vetor[i] + " ");
         }

         System.out.println("Qual o seu nome?");
         String nome = sc.next();
         char[] letras = nome.toLowerCase().toCharArray();

         int contador = 0;
         for (int c=0; c < letras.length; c++){
             if (letras[c] == 'a' || letras[c] == 'e' || letras[c] == 'i' || letras[c] == 'o' || letras[c] == 'u'){
                 contador++;
             }
         }; System.out.print("Seu nome possui " + contador + " vogais!");






    }

}

