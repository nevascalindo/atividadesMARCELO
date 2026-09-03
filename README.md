## 1. Fila (Queue)

Fila é uma estrutura de dados linear que segue a lógica do FIFO (First In, First Out), ou seja, o primeiro elemento que entra é o primeiro que sai. Funciona igual uma fila de banco: quem chega primeiro é atendido primeiro, e ninguém "fura" a fila pra sair antes de quem já estava lá.

Diferente de um vetor comum, onde dá pra acessar qualquer posição livremente, na fila só se mexe nas pontas: os elementos entram sempre pelo final (essa operação se chama *enqueue*) e saem sempre pelo início (*dequeue*). Isso é o que garante a ordem de atendimento ser respeitada.

Existem alguns tipos de fila:

- **Fila simples**: a mais básica, segue exatamente o FIFO, sem regras extras.
- **Fila circular**: quando o final da fila "volta" pro início, reaproveitando espaços que ficaram vazios depois de remoções. É bem usada em implementações com vetor, pra não desperdiçar memória.
- **Fila de prioridade**: aqui a ordem de saída não depende só de quem chegou primeiro, mas de uma prioridade definida (por exemplo, urgência em um hospital).
- **Deque (fila dupla)**: permite inserir e remover tanto no início quanto no final, então é mais flexível que a fila comum.

No dia a dia, fila aparece em várias situações:

- Fila de atendimento em banco, caixa de mercado ou totem de senha
- Impressora que recebe vários documentos pra imprimir e vai processando um por vez, na ordem que chegaram
- Sistema operacional organizando os processos que esperam pra usar o processador
- Aplicativos de mensagem, quando várias mensagens ficam "na fila" pra serem enviadas ou entregues
- Streaming de vídeo/áudio, que usa fila pra guardar os próximos trechos que ainda vão ser carregados
