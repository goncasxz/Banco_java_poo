# Banco_java_poo
## Descrição

O projeto "Banco Java POO" simula um sistema bancário simples com funcionalidades como abrir e fechar contas, realizar depósitos, saques, consultar saldo e pagar mensalidades. Foi desenvolvido utilizando Programação Orientada a Objetos (POO) em Java. O projeto é composto por duas classes principais: AulaExemploConta (responsável pela interação com o usuário e controle das operações) e Conta (representando as contas bancárias e seus métodos de operação).

## Funcionalidades

- **Abrir Conta:** Permite criar uma nova conta com um saldo inicial dependendo do tipo de conta (Conta Corrente ou Conta Poupança).
- **Fechar Conta:** Permite fechar uma conta, desde que o saldo esteja zerado.
- **Depositar:** Permite depositar um valor na conta.
- **Sacar:** Permite realizar saques, desde que haja saldo suficiente.
- **Consultar Saldo:** Exibe o saldo atual da conta.
- **Pagar Mensalidade:** Permite pagar mensalidades específicas para cada tipo de conta (R$ 12 para conta corrente e R$ 20 para conta poupança).

## Requisitos

- JDK 8 ou superior
- Um editor de código como o NetBeans ou IntelliJ IDEA

## Como Usar

1. **Clone o repositório**:

    ```bash
    git clone https://github.com/goncasxz/Banco_java_poo.git
    ```

2. **Compile e execute o código no seu IDE preferido (NetBeans recomendado).**

3. **Ao rodar o programa, você será recebido com um menu interativo, onde poderá escolher entre as seguintes opções:**

    - 1 - Abrir Conta
    - 2 - Fechar Conta
    - 3 - Depositar
    - 4 - Sacar
    - 5 - Consultar Saldo
    - 6 - Pagar Mensalidade
    - 7 - Sair
  
## Estrutura do Código

### AulaExemploConta.java

*   Responsável por exibir o menu para o usuário e chamar os métodos adequados das instâncias de `Conta`.
*   Gerencia uma lista de contas e possibilita a execução de operações bancárias, como abrir conta, realizar depósitos, saques, consultar saldo, pagar mensalidades e fechar contas.

### Conta.java

*   Representa uma conta bancária com propriedades como número da conta, tipo (Conta Corrente ou Conta Poupança), saldo e status.
*   Contém métodos para abrir e fechar contas, realizar depósitos, saques, consultar saldo e pagar mensalidades.

---

## Utilização de Programação Orientada a Objetos (POO)

O projeto utiliza os conceitos de Programação Orientada a Objetos (POO) para modelar um sistema bancário. A seguir, os principais conceitos de POO utilizados:

1. **Classe**: A classe `Conta` é a representação de uma conta bancária e contém atributos (como número da conta, tipo e saldo) e métodos (como abrir conta, depositar, sacar, etc.). A classe `AulaExemploConta` gerencia a execução do programa e interage com as instâncias de `Conta`.

2. **Objeto**: As instâncias da classe `Conta` são objetos que representam contas bancárias individuais. Cada conta tem suas próprias propriedades (como saldo e tipo) e comportamentos (como sacar e depositar).

3. **Encapsulamento**: Os atributos da classe `Conta` são privados, garantindo que não possam ser acessados diretamente fora da classe. Métodos públicos (como `depositar`, `sacar`, `consultarSaldo`) fornecem acesso controlado a esses atributos.

4. **Abstração**: A classe `Conta` esconde os detalhes da implementação das operações bancárias, oferecendo ao usuário apenas a interface necessária para realizar as operações, como abrir conta, consultar saldo e pagar mensalidade.

5. **Herança**: Embora o exemplo não utilize herança diretamente, é possível estender a classe `Conta` para criar tipos específicos de contas com comportamentos adicionais, como uma conta especial com limite de crédito.

6. **Polimorfismo**: O uso de polimorfismo poderia ser incorporado no futuro, por exemplo, para permitir que diferentes tipos de contas (como conta corrente e conta poupança) implementem de forma diferente métodos como `consultarSaldo` ou `pagarMensalidade`.


## Exemplo de Execução

Ao executar o programa, o menu inicial será exibido:

`BEM-VINDO AO BANCO
DIGITE A OPCAO DESEJADA:
1 - ABRIR CONTA
2 - FECHAR CONTA
3 - DEPOSITAR
4 - SACAR
5 - CONSULTAR SALDO
6 - PAGAR MENSALIDADE
7 - SAIR`

### Descrição das Opções

1. **Abrir Conta**: 
   - Ao selecionar a opção "1", será solicitado o nome do titular e o tipo da conta (CC - Conta Corrente ou CP - Conta Poupança).
   - Após a criação, a conta será gerada e será possível realizar outras operações.

2. **Fechar Conta**: 
   - Ao escolher a opção "2", será solicitado o número da conta a ser fechada, e, caso não haja saldo ou dívida, a conta será encerrada.

3. **Depositar**:
   - Ao selecionar "3", o usuário poderá realizar um depósito na conta de sua escolha.

4. **Sacar**:
   - A opção "4" permite ao usuário realizar um saque, desde que haja saldo suficiente.

5. **Consultar Saldo**:
   - A opção "5" exibe o saldo atual da conta.

6. **Pagar Mensalidade**:
   - A opção "6" permite pagar a mensalidade dependendo do tipo de conta (R$12 para CC e R$20 para CP).

7. **Sair**:
   - Ao selecionar "7", o programa será encerrado.

---

## Licença

Este projeto é de código aberto e pode ser utilizado e modificado livremente, desde que seja respeitado o código de ética e boas práticas no uso do software.

