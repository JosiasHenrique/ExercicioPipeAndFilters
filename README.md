Filtro de Softwares – Arquitetura Pipe and Filters

Este projeto foi desenvolvido como parte da disciplina Arquitetura de Software da faculdade, aplicando o padrão arquitetural Pipe and Filters.
O exercício tinha tema livre, e foi implementado um sistema de filtros para uma lista de softwares.

Contexto

No padrão Pipe and Filters, cada filtro é uma unidade independente de processamento que recebe dados, aplica uma transformação ou filtragem e retorna um novo conjunto de dados.
Esses filtros podem ser encadeados em um "pipe", onde a saída de um filtro é a entrada do próximo.

O objetivo foi criar uma estrutura flexível, que permita adicionar ou remover filtros facilmente, atendendo ao requisito do exercício anterior:

"Explique como você garantiria que o sistema fosse escalável para futuros filtros."

A solução foi projetada para ser escalável, permitindo incluir novos filtros apenas implementando a mesma interface.

Princípios SOLID aplicados

O projeto utilizou o princípio OCP – Open/Closed Principle:

"Entidades de software devem estar abertas para extensão, mas fechadas para modificação."

Existe uma interface Processor que define o método execute(List<Software> softwares).

Qualquer novo filtro pode ser criado implementando essa interface, sem alterar o código existente.

O pipe executa qualquer implementação de Processor, tornando o sistema flexível para mudanças futuras.
