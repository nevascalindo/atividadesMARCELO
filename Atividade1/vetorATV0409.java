import java.util.Scanner;

public class vetorATV0409 {

    public static void main(String[] args) {
        int capacidade = 10;
        int[] vetor = new int[capacidade];
        int tamanho = 0;

        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Inserir elemento");
            System.out.println("2 - Pesquisar elemento");
            System.out.println("3 - Excluir elemento");
            System.out.println("4 - Imprimir vetor");
            System.out.println("5 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("1 - Na próxima posição livre");
                    System.out.println("2 - Na posição informada");
                    System.out.print("Escolha: ");

                    int tipoInsercao = leitor.nextInt();

                    switch (tipoInsercao) {

                        case 1:

                            if (tamanho == capacidade) {
                                System.out.println("Não é possível inserir: o vetor está cheio.");
                            } else {
                                System.out.print("Digite o valor: ");
                                int valorNovo = leitor.nextInt();

                                vetor[tamanho] = valorNovo; // A próxima posição livre é sempre igual ao tamanho atual
                                tamanho++;

                                System.out.println("Valor inserido na posição " + (tamanho - 1) + ".");
                            }
                            break;

                        case 2:

                            if (tamanho == capacidade) {
                                System.out.println("Não é possível inserir: o vetor está cheio.");
                            } else {

                                System.out.print("Digite a posição desejada: ");
                                int posicaoInsercao = leitor.nextInt();

                                if (posicaoInsercao < 0 || posicaoInsercao > tamanho) {
                                    System.out.println("Posição inválida.");
                                } else {

                                    System.out.print("Digite o valor: ");
                                    int valorNovo = leitor.nextInt();

                                    for (int i = tamanho; i > posicaoInsercao; i--) { // Desloca tudo uma casa para a direita, começando pelo final
                                        vetor[i] = vetor[i - 1];
                                    }
                                    vetor[posicaoInsercao] = valorNovo;
                                    tamanho++;

                                    System.out.println("Valor inserido na posição " + posicaoInsercao + ".");
                                }
                            }
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    if (tamanho == 0) {
                        System.out.println("O vetor está vazio.");
                    } else {

                        System.out.println("1 - Pelo elemento informado");
                        System.out.println("2 - Pela posição do vetor");
                        System.out.print("Escolha: ");

                        int tipoPesquisa = leitor.nextInt();

                        switch (tipoPesquisa) {

                            case 1:

                                System.out.print("Digite o valor procurado: ");
                                int valorProcurado = leitor.nextInt();
                                int achouNa = -1;

                                for (int i = 0; i < tamanho; i++) {
                                    if (vetor[i] == valorProcurado) {
                                        achouNa = i;
                                        break;
                                    }
                                }

                                if (achouNa != -1) {
                                    System.out.println("Encontrado na posição " + achouNa + ".");
                                } else {
                                    System.out.println("Valor não encontrado no vetor.");
                                }
                                break;
                            case 2:

                                System.out.print("Digite a posição: ");
                                int posicaoBusca = leitor.nextInt();

                                if (posicaoBusca < 0 || posicaoBusca >= tamanho) {
                                    System.out.println("Posição inválida.");
                                } else {
                                    System.out.println("Valor na posição " + posicaoBusca + ": " + vetor[posicaoBusca]);
                                }
                                break;

                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                    break;
                case 3:

                    if (tamanho == 0) {
                        System.out.println("O vetor está vazio.");
                    } else {

                        System.out.println("1 - Excluir o elemento informado");
                        System.out.println("2 - Excluir pela posição informada");
                        System.out.print("Escolha: ");

                        int tipoExclusao = leitor.nextInt();

                        switch (tipoExclusao) {

                            case 1:

                                System.out.print("Digite o valor a remover: ");
                                int valorRemover = leitor.nextInt();

                                int posicaoRemover = -1;

                                for (int i = 0; i < tamanho; i++) {
                                    if (vetor[i] == valorRemover) {
                                        posicaoRemover = i;
                                        break;
                                    }
                                }

                                if (posicaoRemover == -1) {
                                    System.out.println("Valor não encontrado no vetor.");
                                } else {

                                    for (int i = posicaoRemover; i < tamanho - 1; i++) {  // Puxa os elementos seguintes uma casa para a esquerda
                                        vetor[i] = vetor[i + 1];
                                    }

                                    tamanho--;

                                    System.out.println("Valor removido com sucesso.");
                                }

                                break;

                            case 2:

                                System.out.print("Digite a posição a remover: ");
                                int posicaoAlvo = leitor.nextInt();

                                if (posicaoAlvo < 0 || posicaoAlvo >= tamanho) {
                                    System.out.println("Posição inválida.");
                                } else {

                                    for (int i = posicaoAlvo; i < tamanho - 1; i++) {
                                        vetor[i] = vetor[i + 1];
                                    }

                                    tamanho--;

                                    System.out.println("Valor removido com sucesso.");
                                }

                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                    break;
                case 4:

                    if (tamanho == 0) {
                        System.out.println("O vetor está vazio.");
                    } else {

                        System.out.print("Vetor atual: ");
                        for (int i = 0; i < tamanho; i++) {
                            System.out.print("[" + vetor[i] + "] ");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
        leitor.close();
    }
}