import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        Queue<String> lista = new LinkedList<>();
        int escolha;

        try {
            do {
                System.out.println(
                        "\n==>PEDIDOS DA LANCHONETE<== \n {1} Adicionar novo pedido. \n {2} Processar pedido mais antigo. \n {3} Visualizar pedidos na fila. \n {4} >SAIR<");
                escolha = valor.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("\n==>ADICIONAR NOVO PEDIDO<==");
                        System.out.println("Insira o pedido: ");
                        String resposta = valor.next();
                        lista.add(resposta);
                        System.out.println("O pedido " + resposta + " foi adicionado à fila.");
                        break;
                    case 2:
                        System.out.println("\n==>PROCESSAR PEDIDO<==");
                        if (lista.size() == 0) {
                            System.out.println("Não tem pedidos na fila.");
                            break;
                        } else {
                            System.out.println("O pedido " + lista.poll() + " foi processado.");
                            break;
                        }
                    case 3:
                        System.out.println("\n==>LISTA DE PEDIDOS<==");
                        if (lista.size() == 0) {
                            System.out.println("Não possui pedidos na fila.");
                            break;
                        } else {
                            System.out.println("Fila: " + lista.toString());
                            break;
                        }
                    default:
                        break;
                }
            } while (escolha != 4);
            System.out.println("\n ==PROGRAMA FINALIZADO==");
        } catch (Exception e) {
            System.out.println("\n Erro: Insira uma resposta de opção válida!");
        }
        valor.close();
    }
}