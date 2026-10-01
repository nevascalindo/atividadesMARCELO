# Fila, Lista e Pilha

## Introdução

As estruturas de dados servem para organizar as informações dentro de um programa, e a escolha da estrutura certa faz diferença na hora de guardar, buscar e remover dados. A Fila, a Lista e a Pilha são três das mais usadas. As três guardam vários elementos em sequência, mas cada uma tem uma regra diferente de como os dados entram e saem. Neste texto vou explicar como cada uma funciona, onde são usadas no dia a dia e como se comportam em inserção, remoção e acesso.

## Desenvolvimento

### O que é cada estrutura

A **Lista** é uma sequência de elementos em que podemos adicionar, remover e consultar itens em qualquer posição. Não existe uma regra fixa de ordem, então ela é a mais flexível das três. Em Java, ela pode ser feita com `ArrayList` ou `LinkedList`.

A **Pilha** segue a regra LIFO (*Last In, First Out*), ou seja, o último a entrar é o primeiro a sair. Tudo acontece em uma única ponta, chamada de topo. Funciona como uma pilha de pratos: o prato que você colocou por último é o primeiro que você pega. As operações principais são `push` (empilhar) e `pop` (desempilhar).

A **Fila** segue a regra FIFO (*First In, First Out*), onde o primeiro a entrar é o primeiro a sair. Os elementos entram no fim da fila e saem pelo início, igual a uma fila de banco ou de lanchonete. As operações principais são `enqueue` (entrar na fila) e `dequeue` (sair da fila).

### Exemplos de uso

A Lista aparece em situações como a lista de contatos do celular e o carrinho de compras de um site, onde o usuário coloca e tira produtos em qualquer ordem. Também é o caso da lista de compras que fizemos em aula.

A Pilha é usada no botão de desfazer (Ctrl+Z) dos editores de texto, que sempre desfaz a última ação feita, e no botão de voltar do navegador, que volta para a última página visitada. Ela também é usada pelo próprio computador para controlar a chamada de funções durante a execução de um programa.

A Fila é usada onde a ordem de chegada precisa ser respeitada, como na fila de impressão, em que os documentos saem na ordem em que foram enviados, e no atendimento de clientes. O programa da lanchonete deste trabalho é um exemplo: o pedido mais antigo é sempre preparado primeiro.

### Complexidade das operações

Na **Lista**, o custo depende de como ela é implementada. Com `ArrayList`, o acesso por posição é muito rápido, O(1), mas inserir ou remover no meio é mais lento, O(n), porque os outros elementos precisam ser deslocados. Com `LinkedList`, inserir e remover nas pontas é rápido, O(1), mas para acessar um elemento é preciso percorrer a lista, O(n). A vantagem da Lista é a liberdade de acesso, e a desvantagem é que, com muitos dados, operações no meio podem ficar lentas.

Na **Pilha**, a inserção e a remoção são O(1), pois só mexem no topo. O acesso também é O(1), mas somente ao elemento do topo. Para chegar a um item que está no fundo, é preciso tirar todos os que estão acima dele, O(n). Ela é simples e rápida, mas não serve quando precisamos consultar qualquer elemento.

Na **Fila**, a inserção no fim e a remoção no início também são O(1). O acesso rápido existe apenas para o primeiro elemento, e procurar um item no meio exige percorrer a fila, O(n). A vantagem é garantir que o atendimento siga a ordem de chegada, e a desvantagem é o acesso limitado às pontas.

## Conclusão

Lista, Pilha e Fila guardam dados de forma sequencial, mas cada uma resolve um tipo de problema. A Lista é a mais livre, a Pilha trabalha sempre com o último que entrou e a Fila com o primeiro que entrou. Quanto mais restrita a estrutura, mais rápidas ficam as operações principais, mas menos liberdade de acesso ela oferece. Por isso, o importante é analisar o que o programa precisa fazer e escolher a estrutura que se encaixa melhor.

---

# Programa da lanchonete

O programa `Lanchonete.java` simula o controle de pedidos de uma lanchonete usando uma Fila. Ele foi feito com `Queue<String>` e `LinkedList`, e cada pedido é guardado como um texto dentro da fila.

O menu tem quatro opções:

1. **Adicionar novo pedido:** o usuário digita o pedido e ele é colocado no fim da fila com `add()`, que é o enqueue.
2. **Processar pedido mais antigo:** o primeiro pedido da fila é retirado com `poll()`, que é o dequeue. Se a fila estiver vazia, o programa avisa que não há pedidos.
3. **Visualizar pedidos na fila:** mostra todos os pedidos que estão esperando, na ordem em que foram feitos.
4. **Sair:** encerra o programa.

O menu se repete com um `do...while` até o usuário escolher sair, e o `switch` decide o que fazer em cada opção. O `try/catch` evita que o programa quebre caso o usuário digite algo que não seja um número no menu.