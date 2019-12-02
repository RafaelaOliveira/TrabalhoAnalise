Disciplina: Análise e Desenvolvimento de Sistemas.

Aluna: Rafaela Maria de Oliveira.

# Trabalho de Análise

Foi criado um projeto baseado no cenário de lançamentos, atualizações e notificações de notas de um aluno.

Os Patterns utilizados foram:

Observer que será responsável por manter um monitoramento constante na nota do aluno alertando sempre que existir alguma modificação, além da capacidade de informar qual é o novo valor. A grande vantagem desse pattern nesse cenário é garantir que os dados estejam sempre atualizados.

Bridge que é capaz de buscar esses dados, exportar (no caso foram criadas as classe PDF e CSV de exemplo) e processar (classe ZIP e CRYPTO) criando um relátorio que segue uma ordem obrigatória de sequência para execução. O pattern é util pois permite o usuário variar entre dois lados independentes, como por exemplo, exportar os dados de uma forma e processa-lo de varias maneiras distintas ou vice e versa, oferecendo então a possibilidade de escolha para a combinação que mais agradar o usuário, além de, permitir que novos meios de exportação ou processamento sejam criados com facilidade.

E o Strategy que permite o usuario escolher qual a forma de notificar o aluno que ocorreram alterações na nota (nesse caso as classes EMAIL e PORTAL foram criadas para exemplo). Esse pattern facilita a criação de novas classes caso seja preciso adicionar novos modos de notificação, como por exemplo uma notificação por telefone, bastaria criar a classe SMS, sem a necessidade de interferir na estrutura do projeto.
