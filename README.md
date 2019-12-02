# Trabalho de Análise

Foi criado um projeto baseado no cenário de lançamentos, atualizações e notificações de notas de um aluno.
Os Patterns utilizados foram:

Observer que será responsável por monitorar constantemente a nota do aluno alertando quando existir alguma modificação, além de informar qual é o novo valor, garantindo assim estar sempre atualizado.

Bridge que é capaz de buscar esses dados, exportar (no caso foram criadas as classe PDF e CSV de exemplo) e processar (classe ZIP e CRYPTO) criando um relátorio que segue uma ordem obrigatória de sequência para execução, mas permite o usuario variar entre dois lados independentes como por exemplo exportar os dados de uma forma e processa-lo de duas maneiras distintas ou vice e versa.

E o Strategy que permite o usuario escolher qual a forma de notificar o aluno que ocorreram alterações na nota (nesse caso as classes EMAIL e PORTAL foram criadas para exemplo). Esse pattern facilita a criação de novas classes caso seja preciso adicionar novos modos de notificação, como por exemplo uma notificação por telefone, bastaria criar a classe SMS, sem a necessidade de interferir na estrutura do projeto.
