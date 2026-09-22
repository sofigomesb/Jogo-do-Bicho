import java.util.Scanner;
import java.util.Arrays;

public class JogodoBicho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = {"Avestruz", "Águia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacaré", "Leão", "Macaco", "Porco", "Pavão", "Peru", "Touro", "Tigre", "Urso", "Veado", "Vaca"};

        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            numeros[i] = a;
        }
        Arrays.sort(numeros);

        for (int n = 0; n < numeros.length; n++) {
            for (int m = 0; m < nomes.length; m++) {
                if (numeros[n] == m+1) {
                    System.out.println(nomes[m]);
                }
            }
        }

    }
}