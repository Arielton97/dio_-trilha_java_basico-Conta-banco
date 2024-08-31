Para o Projeto Simples que a DIO pede, use [DIO - trilha Java básico](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe):

1. Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.
3. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
   - Programa: "Por favor, digite o número da Agência !"
   - Usuário: 1021 (depois ENTER para o próximo campo)
4. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

**Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.**











Se for criar para um esquema de banco de dados, use a seguinte documentação (fornecida pelo Microsoft Copilot)

1. **Clientes**
    - `cliente_id` (chave primária)
    - `nome`
    - `endereco`
    - `telefone`
    - `email`
    - `data_nascimento`

2. **Contas**
    - `conta_id` (chave primária)
    - `cliente_id` (chave estrangeira referenciando `Clientes`)
    - `tipo_conta` (corrente, poupança, etc.)
    - `saldo`
    - `data_abertura`

3. **Transacoes**
    - `transacao_id` (chave primária)
    - `conta_id` (chave estrangeira referenciando `Contas`)
    - `tipo_transacao` (depósito, saque, transferência)
    - `valor`
    - `data_transacao`

4. **Cartoes**
    - `cartao_id` (chave primária)
    - `conta_id` (chave estrangeira referenciando `Contas`)
    - `numero_cartao`
    - `data_validade`
    - `cvv`

5. **Login**
    - `login_id` (chave primária)
    - `cliente_id` (chave estrangeira referenciando `Clientes`)
    - `username`
    - `senha`

