import java.util.Scanner;

public class OrdenacaoNotas {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        try {
            System.out.println("\n==>LISTA DE NOTAS DA TURMA<==");
            System.out.println("Insira a quantidade de notas: ");
            int quantidade = valor.nextInt();

            if (quantidade <= 0) {
                System.out.println("A quantidade precisa ser maior que zero.");
            } else {
                double[] notas = new double[quantidade];

                for (int i = 0; i < quantidade; i++) {
                    System.out.println("Insira a nota " + (i + 1) + ": ");
                    notas[i] = valor.nextDouble();
                }

                for (int i = 0; i < notas.length - 1; i++) {
                    int menor = i;

                    for (int j = i + 1; j < notas.length; j++) {
                        if (notas[j] < notas[menor]) {
                            menor = j;
                        }
                    }

                    double aux = notas[i];
                    notas[i] = notas[menor];
                    notas[menor] = aux;
                }

                System.out.println("\n==>NOTAS EM ORDEM CRESCENTE<==");
                for (int i = 0; i < notas.length; i++) {
                    System.out.println((i + 1) + "º: " + notas[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("\n Erro: Insira um valor válido!");
        }

        valor.close();
    }
}